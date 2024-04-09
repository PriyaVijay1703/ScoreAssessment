package utils;


import constants.ApplicationConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;


public final class PropertyUtils {

    private static final Properties property = new Properties();
    private static final Logger log = LogManager.getLogger(PropertyUtils.class);

    static void loadProperties() {
        log.info("Loading Properties to the application");
        try (FileInputStream input = new FileInputStream(ApplicationConstants.CONFIG_PROPERTIES_PATH)) {
            property.load(input);
            log.info("Properties loaded successfully");
        } catch (IOException e) {
            log.error("Error Occurred while loading properties {}", e.getMessage());
        }
    }

    public static String getPropertyValue(String key) {
        if (property.entrySet().isEmpty()) {
            loadProperties();
        }
        if (Objects.isNull(property.getProperty(key))) {
            log.error("Property name - " + key + " is not found. Please check the config.properties");
        }
        return property.getProperty(key);
    }
}
