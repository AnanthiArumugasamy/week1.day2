package Week2.Day2_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Ananthi");
		driver.findElement(By.id("lastNameField")).sendKeys("Arumugasamy");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ananthi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Arumugasamy");
		driver.findElement(By.name("departmentName")).sendKeys("Analyst");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Hello Everyone");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']"))
				.sendKeys("babyananthi.1999@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select Dd = new Select(state);
		Dd.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Have a nice day");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String stc = driver.getTitle();
		driver.close();
		System.out.println(stc);
	}

}
