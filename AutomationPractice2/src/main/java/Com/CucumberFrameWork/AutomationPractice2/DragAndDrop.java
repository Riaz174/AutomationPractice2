package Com.CucumberFrameWork.AutomationPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository4\\AutomationPractice2\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //ChromeDriver class constructor
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		WebElement dragged = driver.findElement(By.id("draggable"));
		WebElement dropped = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragged, dropped).build().perform();
		driver.switchTo().parentFrame();
		WebElement dialogue = driver.findElement(By.linkText("Dialog"));
		dialogue.click();
	}

}
