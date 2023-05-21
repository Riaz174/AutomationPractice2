package Com.CucumberFrameWork.AutomationPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
	public static WebDriver driver;
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice2\\src\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver(); //ChromeDriver class constructor
	driver.navigate().to("https:www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	WebElement creatNewAccount = driver.findElement(By.xpath("//*[contains(text(),'Create new account')]"));
	creatNewAccount.click();
	Thread.sleep(3000);
	WebElement fname = driver.findElement(By.name("firstname"));
	fname.sendKeys("John");
	Thread.sleep(3000);
	WebElement sname = driver.findElement(By.name("lastname"));
	sname.sendKeys("Doe");
	Thread.sleep(3000);
	WebElement emailField = driver.findElement(By.name("reg_email__"));
	emailField.sendKeys("john@gmail.com");
	Thread.sleep(3000);
	WebElement reemail = driver.findElement(By.name("reg_email_confirmation__"));
	reemail.sendKeys("john@gmail.com");
	Thread.sleep(3000);
	WebElement nepassField = driver.findElement(By.id("password_step_input"));
	nepassField.sendKeys("abcde");
	Thread.sleep(3000);
	WebElement birthdate = driver.findElement(By.name("birthday_day"));
	Select ob = new Select(birthdate);
	ob.selectByIndex(6);
	Thread.sleep(3000);
	WebElement birthmonth = driver.findElement(By.name("birthday_month"));
	Select ob1 = new Select(birthmonth);
	ob1.selectByValue("11");
	Thread.sleep(3000);
	WebElement birthyear = driver.findElement(By.name("birthday_year"));
	Select ob2 = new Select(birthyear);
	ob2.selectByVisibleText("2018");
	Thread.sleep(6000);
	WebElement gender = driver.findElement(By.xpath("//*[contains(text(),'Custom')]"));
	gender.click();
	
	}
	}
