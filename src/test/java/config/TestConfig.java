package config;

import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestConfig {

    static Properties config;
    static String browser;
    static String testEnv;
    public static String url;

    public static String getBrowser(){
        testConfig();
        browser=config.getProperty("Browser");
        testEnv=config.getProperty("TestEnv");
        url=config.getProperty(testEnv.toUpperCase()+".environment");
        return browser;
    }

    public static void testConfig() {
        config=loadproperties("TestConfig.properties");


    }

    private  static Properties loadproperties(String filename) {
        Properties readenvironment = new Properties();
        try {
            readenvironment.load(new FileInputStream(System.getProperty("user.dir") + File.separator + "config/TestConfig.properties"));
        } catch (IOException e) {
            System.out.println("TestConfig.properties file not found!");
            Assert fail;
        }
        return readenvironment;
    }
}
