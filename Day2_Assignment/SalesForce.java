package Week2.Day2_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// Download and set the path
		WebDriverManager.chromedriver().setup();
		// Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// Maximize the window
		driver.manage().window().maximize();
		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Fill in all the text boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Ananthi");
		driver.findElement(By.name("UserLastName")).sendKeys("Arumugasamy");
		driver.findElement(By.name("UserEmail")).sendKeys("babyananthi.1999@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("ZOHO");
		driver.findElement(By.name("UserPhone")).sendKeys("7558150281");
		// Handle all the dropdowns
		WebElement eleTitle = driver.findElement(By.name("UserTitle"));
		Select dropDown = new Select(eleTitle);
		dropDown.selectByVisibleText("CxO / General Manager");
		WebElement eleEmp = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dropDown1 = new Select(eleEmp);
		dropDown1.selectByVisibleText("15 - 100 employees");
		WebElement eleCountry = driver.findElement(By.name("CompanyCountry"));
		Select dropDown2 = new Select(eleCountry);
		dropDown2.selectByValue("IN");
		// Click the checkbox
		driver.findElement(By.className("checkbox-ui")).click();
		// Close the browser
		driver.close();
	}

}
