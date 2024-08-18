package appiumtest;
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



public class mainCLass extends base {

	public static void main(String[] args) {
	
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		base b=new base();
		b.loginTest();
		b.MessageTest();

	}

}
