
# Score Mobile Automation

This project aims to automate score mobile testing with mobile automation frameworks.Appium and Android emulator is used for automation.
It has testsuite which has test case named "ScoreTestCase" . Below are the test steps covered in the testcase
1.Open Score Application
2.Navigate to League Page
3.Selecting Score Tab
4.Verify that you are on the correct tab and that the data is displayed
5.Verify that back navigation returns you to the previous page correctly.

# Prerequisite

Below installations are required to run the code in local 

   1. Homebrew [ /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)" ]
   2. Java 11 [brew install openjdk@11]
   3. android-sdk [ brew install --cask android-sdk]
   4. Node [brew install node]
   5. Appium [brew install --cask appium]
   6. IDE [Intellij IDEA - brew install --cask intellij-idea-ce]
   7. Set JAVA_HOME and ANDROID_HOME environment variables

For Windows: Except Homebrew, Obtain other executables and install manually.  

# Dependencies

1. Appium Java Client
2. TestNG
3. log4j
4. junit

# Steps to Initiate a Test Run

1. Clone repo from Git [git clone git@github.com:PriyaVijay1703/ScoreAssessment.git]
2. Run Appium Server in local and obtain endpoint by configuring desired capabilities.
3. Place the app to src/test/resource directory
4. Open /ScoreMobileAutomation/src/test/resource & update config.properties

   |  property | sample value                          |
   |---|---------------------------------------|
   |  appiumURL | http://localhost:4723/                |
   |  platformName | Android                               |
   |  app | name of the apk file in resource path |
   |  deviceName | name of the device (Pixel_6)          |
   |  executionName | Prefix of snapshot report directory   |
 
5. Execute Test Suite under /src/test/resources/suites/TestSuite.xml

# Verify Run

1. log report of the test is written in reporting.log file in project's root directory.
2. Screenshots taken during the test run are stored in test run directory. Name of the directory will be dynamic based on the execution timestamp.

# Sample Execution status

Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
