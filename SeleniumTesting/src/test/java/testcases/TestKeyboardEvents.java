package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyboardEvents {

	public static void main(String[] args) {


		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]")).click();
		//driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.CONTROL + "a").sendKeys(Keys.CONTROL + "c").perform();
	//	action.sendKeys(Keys.chord(Keys.CONTROL+"a")).sendKeys(Keys.chord(Keys.CONTROL+"c")).build().perform();
	
		driver.findElement(By.id("identifierId")).click();
		action.sendKeys(Keys.CONTROL + "a").perform();
	//	action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		
		
	}

}
