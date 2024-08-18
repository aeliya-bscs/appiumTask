package appiumtest;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class base {
	
	@BeforeTest
	public static AndroidDriver<AndroidElement> Capabilities()throws MalformedURLException{
	
	
		
	  
	
		DesiredCapabilities cap = new DesiredCapabilities();


		cap.setCapability("platformName","Android");
		cap.setCapability("appium:automationName", "uiautomator2");
		cap.setCapability("appium:deviceName", "AilyaEmulator");     
		cap.setCapability("appium:noReset","true");
		cap.setCapability("appium:appPackage", "com.ctere1.reactactivechat");

		URL url = URI.create("http://127.0.0.1:4723/:4723/wd/hub").toURL();
		

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(url, cap);
		
		return driver;
		
		
	}
	
	 @Test
	    public void loginTest() {
	        // Locate and interact with login fields and buttons
	        AndroidElement usernameField = driver.findElementById("00000000-0000-002d-ffff-ffff000000b1");	        		+ "");
	        AndroidElement passwordField = driver.findElementById("00000000-0000-002d-ffff-ffff000000b2");
	        AndroidElement loginButton = driver.findElementById("00000000-0000-002d-ffff-ffff000000ae");

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
         AndroidElement messageicon = driver.findElement(By.className("android.view.ViewGroup")); 
        
         messageicon.click();
         //select user
         AndroidElement selctUser = driver.findElement(By.xpath("(//android.widget.TextView[@text='User status'])[2]"));
         
//exact interaction is not available
         
         selctUser.click();
         
         MobileElement messageInputField = driver.findElement(By.className("android.widget.EditText"));
        		 
        		 //  click textfield  
        		 
        messageInputField.click()


         messageInputField.sendKeys("Hello, this is a test message!");

         // Locate the send button and click it
         MobileElement sendButton = driver.findElement(By.className("android.widget.TextView"));

         sendButton.click();
       
	  }
	
	

}
