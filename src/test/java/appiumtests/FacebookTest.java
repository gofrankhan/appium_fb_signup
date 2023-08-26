package appiumtests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.offset.PointOption;

public class FacebookTest {
	
	public static void main(String[] args) {
		try {
			openFacebook();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	public static void openFacebook() throws Exception{
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appium:deviceName", "Galaxy A71");
		caps.setCapability("appium:udid", "R58NA4W9NLD");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:platformVersion", "13");
		caps.setCapability("appium:automationName", "UiAutomator2");
		caps.setCapability("appium:appPackage", "com.facebook.katana");
		caps.setCapability("appium:appActivity", "com.facebook.katana.LoginActivity");
		//cap.setCapability("appPackage", "com.android.calculator2");
		//cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url, caps);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Create new account\"]")));
		MobileElement btnCreateNewAccont = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Create new account\"]"));
		btnCreateNewAccont.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Get Started\"]")));
		MobileElement btnGetStarted = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Get Started\"]"));
		btnGetStarted.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.gms:id/cancel")));
		MobileElement nonOfTheAbove = driver.findElement(By.id("com.google.android.gms:id/cancel")); 
		nonOfTheAbove.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"First name\"]/parent::android.view.ViewGroup/following-sibling::android.widget.EditText")));
		MobileElement inputFirstName = driver.findElement(By.xpath("//android.view.View[@content-desc=\"First name\"]/parent::android.view.ViewGroup/following-sibling::android.widget.EditText"));
		inputFirstName.sendKeys("Daraz");
		
		MobileElement inputLastName = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Surname\"]/parent::android.view.ViewGroup/following-sibling::android.widget.EditText"));
		inputLastName.sendKeys("Alibaba");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Next\"]")));
		MobileElement btnNext = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]"));
		btnNext.click();
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.NumberPicker[@index='0']")));
//		driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys("09"); 
//		driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys("May"); 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
		
		MobileElement startElement = driver.findElement(By.xpath("//android.widget.NumberPicker[2]/android.widget.EditText"));

		// Define the coordinates for the swipe start and end points
		int startX = startElement.getLocation().getX() + startElement.getSize().getWidth() / 2;
		int startY = startElement.getLocation().getY() + startElement.getSize().getHeight() / 2;
		int endX = startX; // Same X coordinate as start
		int endY = startY - 30; // Adjust this value to control the swipe distance

		// Perform the swipe gesture
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(startX, startY))
		           .moveTo(PointOption.point(endX, endY))
		           .release()
		           .perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
		MobileElement btnSet = driver.findElement(By.id("android:id/button1")); 
		btnSet.click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Next\"]")));
		MobileElement btnNext1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Next\"]"));
		btnNext1.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Male\"]")));
		MobileElement btnMale = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Male\"]"));
		btnMale.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Next\"]")));
		MobileElement btnNext2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Next\"]"));
		btnNext2.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[1]")));
		MobileElement btnDeny = driver.findElement(By.xpath("//android.widget.Button[1]"));
		btnDeny.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText")));
		MobileElement inputMobile = driver.findElement(By.xpath("//android.widget.EditText"));
		inputMobile.sendKeys("01700224466");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Next\"]")));
		MobileElement btnNext3 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Next\"]"));
		btnNext3.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText")));
		MobileElement inputPassword = driver.findElement(By.xpath("//android.widget.EditText"));
		inputPassword.sendKeys("12qw!@QW");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Next\"]")));
		MobileElement btnNext4 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Next\"]"));
		btnNext4.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")));
		MobileElement btnSave = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]"));
		btnSave.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc=\"I Agree\"]")));
		MobileElement btnIAgree = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"I Agree\"]"));
		btnIAgree.click();
		
		System.out.println("Application Started.....");
	}
}
