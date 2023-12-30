package Com.CucumberFrameWork.AutomationPractice2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository4\\AutomationPractice2\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //ChromeDriver class constructor
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement window = driver.findElement(By.id("openwindow"));
		window.click();
		Thread.sleep(2000);
		String currentwindowhandle = driver.getWindowHandle();
		//WebElement course = driver.findElement(By.xpath("//*[text()='Courses']"));
		//course.click();
		System.out.println(currentwindowhandle);
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterators = windowhandles.iterator();
		String Firsthandlestore = iterators.next();
		String Secondhandlestore = iterators.next();
		System.out.println("This is First=" + Firsthandlestore);
		System.out.println("This is Second=" + Secondhandlestore);
		driver.switchTo().window(Secondhandlestore);
		Thread.sleep(3000);
		WebElement course = driver.findElement(By.xpath("//*[text()='Courses']"));
		course.click();
		
		
	}

}
