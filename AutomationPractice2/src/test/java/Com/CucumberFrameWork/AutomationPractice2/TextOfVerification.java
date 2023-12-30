package Com.CucumberFrameWork.AutomationPractice2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amazon.pages.HomeOfFacebook;
import Common.Utilities;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TextOfVerification extends Utilities {
	
  @Test(priority = 2,dependsOnMethods = "sign")
  public void f() throws IOException, InterruptedException {
	HomeOfFacebook home = new HomeOfFacebook(driver); 
	String tx = home.verificationOfText();
	Thread.sleep(2000);
	shots();
	System.out.println(tx);
	//Assert.assertEquals(tx, "Connect with friends and the world around you on Facebook.");
	SoftAssert st = new SoftAssert();
	Thread.sleep(2000);
	shots();
	st.assertEquals(tx, "Connect with friends and the world around you on Facebook.");
	 System.out.println("This is after assertion");
	 Thread.sleep(2000);
	 shots();
	  st.assertAll();
  }
  		

   @Test(priority=1)
  public void sign() {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  home.userName("abcde");
	  home.paswd("fghijk");
	  home.login();
   }
   		 }
   
	  
	  
  


