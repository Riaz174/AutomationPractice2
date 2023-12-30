package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	@FindBy(name = "email") WebElement email;
	@FindBy(id = "continue") WebElement Continue;
	
	public WebDriver driver;
	public Sign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void emailsendkeys() {
		email.sendKeys("john@gmail.com");
	}
	public void continuebuttonClick() {
		Continue.click();
	}
	

}
