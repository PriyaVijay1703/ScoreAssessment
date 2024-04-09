package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public final class DriverManager {

    public static final Logger log = LogManager.getLogger(DriverManager.class);
    private static final ThreadLocal<AppiumDriver<MobileElement>> threadLocalDriver = new ThreadLocal<>();

    public static AppiumDriver<MobileElement> getDriver() {
        return threadLocalDriver.get();
    }

    public static void setAppiumDriver(AppiumDriver<MobileElement> driver) {
        if (Objects.nonNull(driver))
            threadLocalDriver.set(driver);
    }

    public static void unload() {
        log.info("Unloading driver");
        threadLocalDriver.remove();
    }
}
