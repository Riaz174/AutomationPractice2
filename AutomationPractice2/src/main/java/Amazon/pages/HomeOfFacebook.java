package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFacebook {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Connect with friends and the world around you on Facebook.')]")
WebElement text;
	@FindBy(name = "email") WebElement email;
	@FindBy(name = "pass") WebElement paswd;
	@FindBy(name = "login") WebElement lbutton; 
	public HomeOfFacebook(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public  String verificationOfText() {
		String tx =text.getText();
		return tx;
	}
	public void userName(String id) {
		email.sendKeys(id);
	}
	public void paswd(String id) {
		paswd.sendKeys(id);
	}
	public void login() {
		lbutton.click();
	}

}
