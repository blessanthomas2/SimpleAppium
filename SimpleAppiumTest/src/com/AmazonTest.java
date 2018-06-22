package com;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class AmazonTest {
 
		private static AndroidDriver driver;
		
		public static void main(String[] args) throws Exception {
			
			
			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/Apps/Amazon/");
			File app = new File(appDir, "amazon.apk");
 
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			
//			capabilities.setCapability("deviceName", "Galaxy S8");
//			capabilities.setCapability("udid", "98897a444d4e533057");
//			capabilities.setCapability("platformVersion", "8.0.0");
			
			capabilities.setCapability("deviceName", "Nexus 5X API 25");
			capabilities.setCapability("udid", "emulator-5554");
			capabilities.setCapability("platformVersion", "7.1.1");
			
			
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
			capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
 
			driver = new AndroidDriver( url, capabilities);
			
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(10000);
			driver.quit();
 
	}
 
}