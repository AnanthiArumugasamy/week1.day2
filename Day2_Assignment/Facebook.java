package Week2.Day2_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// Download and set the path
		WebDriverManager.chromedriver().setup();
//Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
//Maximize the window
		driver.manage().window().maximize();
//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Click on Create New Account button    //When there is no more way to create attributes go for xpath
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
//Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Ananthi");
//Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Arumugasamy");
//Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("7558150281");
//Enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Anush");
//Handle all the three dropdowns
		WebElement eleid = driver.findElement(By.id("day"));
		Select dd = new Select(eleid);
		dd.selectByVisibleText("9");
		WebElement eleMonth = driver.findElement(By.id("month"));
		Select dd1 = new Select(eleMonth);
		dd1.selectByValue("10");
		WebElement eleYear = driver.findElement(By.id("year"));
		Select dd2 = new Select(eleYear);
		dd2.selectByIndex(22);
//Select the radio button "Female"
		driver.findElement(By.xpath("//input[@class='_8esa']")).click();

	}

}
