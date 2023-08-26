//package appiumtests;
//
//import java.net.URL;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.remote.MobilePlatform;
//
//public class CalculatorTest {
//	
//	public static void main(String[] args) {
//		try {
//			openFacebook();
//		}catch(Exception exp) {
//			System.out.println(exp.getCause());
//			System.out.println(exp.getMessage());
//			exp.printStackTrace();
//		}
//	}
//	
//	public static void openFacebook() throws Exception{
//		
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("appium:deviceName", "Galaxy A71");
//		caps.setCapability("appium:udid", "R58NA4W9NLD");
//		caps.setCapability("platformName", "Android");
//		caps.setCapability("appium:platformVersion", "13");
//		caps.setCapability("appium:automationName", "UiAutomator2");
//		caps.setCapability("appium:appPackage", "com.sec.android.app.popupcalculator");
//		caps.setCapability("appium:appActivity", "com.sec.android.app.popupcalculator.Calculator");
//		//cap.setCapability("appPackage", "com.android.calculator2");
//		//cap.setCapability("appActivity", "com.android.calculator2.Calculator");
//		
//		URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		
//		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url, caps);
//		
//		MobileElement one = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
//		one.click();
//		
//		MobileElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
//		two.click();
//		
//		MobileElement three = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
//		three.click();
//		
//		MobileElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
//		plus.click();
//		
//		MobileElement four = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04"));
//		four.click();
//		
//		MobileElement five = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
//		five.click();
//		
//		MobileElement six = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06"));
//		six.click();
//		
//		MobileElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
//		equal.click();
//		
//		System.out.println("Application Started.....");
//	}
//}
