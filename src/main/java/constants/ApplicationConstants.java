package constants;

import java.io.File;

public final class ApplicationConstants {
    public static final String PROJECT_PATH = System.getProperty("user.dir");
    public static final String SRC_TEST_RESOURCES = "src/test/resources";
    public static final String APPIUM_URL = "appiumURL";
    public static final String CONFIG_PROPERTIES = "config.properties";
    public static final String TEST_RESOURCES_DIR = PROJECT_PATH + File.separator
            + SRC_TEST_RESOURCES;
    public static final String CONFIG_PROPERTIES_PATH =
            TEST_RESOURCES_DIR + File.separator + CONFIG_PROPERTIES;
    public static final String CFL = "CFL";
    public static final String TOR_MAPLE_LEAFS = "TOR Maple Leafs";
    public static final String EDIT = "Edit";
    public static final String CONTINUE = "Continue";
    public static final String ALLOW = "Allow";
    public static final String DONE = "Done";


}
