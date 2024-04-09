package driver;

import constants.ApplicationConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.PropertyUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

import static constants.ApplicationConstants.APPIUM_URL;


public final class DriverFactory {

    public static void initializeDriver() throws MalformedURLException {
        DriverManager.setAppiumDriver(appiumDriver());
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }

    public static AppiumDriver<MobileElement> appiumDriver() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PropertyUtils.getPropertyValue(MobileCapabilityType.PLATFORM_NAME));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PropertyUtils.getPropertyValue(MobileCapabilityType.PLATFORM_VERSION));
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, PropertyUtils.getPropertyValue(MobileCapabilityType.DEVICE_NAME));
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, PropertyUtils.getPropertyValue(MobileCapabilityType.AUTOMATION_NAME));
        desiredCapabilities.setCapability(MobileCapabilityType.APP, ApplicationConstants.TEST_RESOURCES_DIR + PropertyUtils.getPropertyValue(MobileCapabilityType.APP));
        return new AndroidDriver<>(new URL(PropertyUtils.getPropertyValue(APPIUM_URL)), desiredCapabilities);
    }
}
