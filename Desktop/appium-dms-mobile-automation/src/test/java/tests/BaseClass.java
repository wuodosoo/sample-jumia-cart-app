/*

import java.net.URL;

package tests;


import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.NoHttpResponseException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/*
public class BaseClass {
	
	
//	AppiumDriver<MobileElement> driver;
	
	private static final String APP = "/Users/Gordon/Downloads/Twiga DMS v3.11.0-210317_0912(STAGING).apk";
    private static final String APPIUM = "http://localhost:4723/wd/hub";

    private AndroidDriver driver;
	
	
	
    @BeforeTest
	public void setup() {
    	
    	try {
    	
    	DesiredCapabilities caps = new DesiredCapabilities();
    	
    //	DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("noReset", "true");
        caps.setCapability("app Activity","com.twigafoods.soko.ui.common.auth.LoginActivity");
        caps.setCapability("app Activity","com.twigafoods.soko.ui.common.auth.LoginActivity");
        caps.setCapability("app Activity","com.twigafoods.soko.ui.common.ui.MainDashboardActivity");
        caps.setCapability("app Package", "com.twigafoods.soko.staging");
        caps.setCapability("autoGrantPermissions", "true");
        caps.setCapability("app", APP);
        
        driver = new AndroidDriver(new URL(APPIUM), caps);
    	
    //	caps.setCapability("platformName","ANDROID");
    //	caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
    //	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
    //	caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
    	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
    //	caps.setCapability(MobileCapabilityType.UDID, "5554");
    //	caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
    //    caps.setCapability(MobileCapabilityType.APP, "/Users/Gordon/Downloads/Twiga DMS v3.11.0-210317_0912(STAGING).apk");
     //   caps.setCapability("appPackage","com.twigafoods.soko.staging");
      //  caps.setCapability("appActivity", "com.twigafoods.soko.ui.common.auth.LoginActivity");
      //  caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
    	
    //	URL url = new URL("http://localhost:4723/wd/hub");
    	
    //	driver = new AppiumDriver<MobileElement>(url, caps);
    //	driver = new AndroidDriver<MobileElement>(url, caps);
    	
  
    	
    	}catch(Exception exp) {
    		System.out.println("Cause is : " + exp.getCause());
    		System.out.println("Message is : " +exp.getMessage());
    		exp.printStackTrace();
    	}
    	

		
}
    
	
	@AfterTest
	public void teardown() {
		 if (driver != null) {
	            driver.quit();
	        }

	
		
	}
}

     
     /
      * 
      */

package tests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.NoHttpResponseException;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    private static final String APP = "/Users/Gordon/Downloads/Twiga DMS v3.11.0-210317_0912(STAGING).apk";
    private static final String APPIUM = "http://localhost:4723/wd/hub";

    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "Nokia 4.2");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("UDID", "8T89571EA19B2300889");
        caps.setCapability("noReset", "true");
        caps.setCapability("app Activity","com.twigafoods.soko.ui.common.auth.LoginActivity");
        caps.setCapability("app Activity","com.twigafoods.soko.ui.common.auth.LoginActivity");
        caps.setCapability("app Activity","com.twigafoods.soko.ui.common.ui.MainDashboardActivity");
        caps.setCapability("app Package", "com.twigafoods.soko.staging");
        caps.setCapability("autoGrantPermissions", "true");
        caps.setCapability("app", APP);
        driver = new AndroidDriver(new URL(APPIUM), caps);
        try { Thread.sleep(3000); } catch (Exception ign) {}
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


