package base;

import constants.ApplicationConstants;
import driver.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import driver.DriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.*;
import utils.CommonUtils;
import utils.PropertyUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;


public class BaseTest {

    private static final Logger log = LogManager.getLogger(BaseTest.class);
    private String screenShotFilePath;
    private AppiumDriver<MobileElement> driver;

    private String testCaseName;

    @BeforeSuite
    public void initializeDriver() {
        try {
            DriverFactory.initializeDriver();
            this.driver = DriverManager.getDriver();
            this.screenShotFilePath = ApplicationConstants.PROJECT_PATH
                    + File.separator + PropertyUtils.getPropertyValue("executionName")
                    + CommonUtils.getCurrentDateTime()
                    + File.separator;
        } catch (MalformedURLException e) {
            log.error("Error occurred while initializing Base Test {}", e.getMessage());
        }
    }

    @BeforeTest
    public void beforeTest() {
        log.info("test case execution started");
    }

    @AfterTest
    public void afterTestUpdates()
    {
        log.info("{} case execution completed", this.testCaseName);
    }

    @BeforeMethod
    public void handleBeforeMethod(Method method) {
        this.testCaseName = method.getName();
        this.screenShotFilePath = screenShotFilePath
                + this.testCaseName
                + File.separator;
        log.info("Test case screenshot directory {}", screenShotFilePath );
    }

    @AfterSuite
    public void closeDriver() {
        DriverFactory.quitDriver();
        log.info("Driver quit successfully");
    }

    public void saveScreenShot(String fileName) {
        try {
            File snapshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(snapshot, new File(screenShotFilePath + fileName + ".jpg"));
            log.info("Screenshot saved successfully to {} with name {}", screenShotFilePath, fileName);
        } catch (IOException e) {
            log.error("Error while getting screenshot {} {}", fileName, e.getMessage());
        }
    }

}
