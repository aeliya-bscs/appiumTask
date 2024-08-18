package appiumtest;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class base {

	public static AndroidDriver driver;
	
	public static void main(String[] args) {
		
	  
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();


		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appium:automationName", "uiautomator2");
		capabilities.setCapability("appium:deviceName", "AilyaEmulator");     
		capabilities.setCapability("appium:noReset","true");
		capabilities.setCapability("appium:appPackage", "com.ctere1.reactactivechat");

		URL url = URI.create("http://127.0.0.1:4723/:4723/wd/hub").toURL();
		

		driver = new AndroidDriver(url, capabilities);
		
		
	}
	
	 @Test
	    public void loginTest() {
	        // Locate and interact with login fields and buttons
	        AndroidElement usernameField = driver.findElementById("00000000-0000-0028-ffff-ffff000000b2");
	        AndroidElement passwordField = driver.findElementById("00000000-0000-0028-ffff-ffff000000b3");
	        AndroidElement loginButton = driver.findElementById("00000000-0000-0028-ffff-ffff000000b4");

	        // Enter username and password
	        usernameField.sendKeys("da@yahoo.com");
	        passwordField.sendKeys("test1234");
	        loginButton.click();

	        // Verify login success
	        AndroidElement chat = driver.findElementByText("Chats");
	        assert chat.isDisplayed();
	    }
		
	  public void MessageTest() {
         //click chat button
         MobileElement messageInputField = driver.findElement(By.id("00000000-0000-0028-ffff-ffff00000150")); // Adjust with actual ID
        
         
         //select user
         MobileElement messageInputField = driver.findElement(By.id("00000000-0000-0028-ffff-ffff00000239"));"
        		 
        		 //  click textfield  
        		 
        MobileElement messageInputField = driver.findElement(By.id("Type a message..."));


         messageInputField.sendKeys("Hello, this is a test message!");

         // Locate the send button and click it
         MobileElement sendButton = driver.findElement(By.id("00000000-0000-0028-ffff-ffff00000321"));

         sendButton.click();
       
	  }
	
	


	}

}
