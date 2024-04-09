package pages;


import driver.DriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ScreenActions {
    public static final Logger log = LogManager.getLogger(ScreenActions.class);

    protected ScreenActions() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }


    public static void click(MobileElement element, String elementName) {
        try {
            Thread.sleep(3000);
            element.click();
            log.info("Element {} clicked successfully", elementName);
        } catch (Exception e) {
            log.error("Error with Click Element {} {}", elementName, e.getMessage());
        }
    }
}
