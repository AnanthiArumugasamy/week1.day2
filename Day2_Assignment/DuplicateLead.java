package Week2.Day2_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babyananthi.1999@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();      
        Thread.sleep(2000);
		WebElement nameElement = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[2]"));
        String str =nameElement.getText();
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        driver.findElement(By.linkText("Duplicate Lead")).click();
       String title = driver.getTitle();
        if (title.contains("Duplicate Lead | opentaps CRM")) {
        	System.out.println("Title verified");
        }else {
        	System.out.println("Mismatch");
        }
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
        if(name.equals(str)) {
        	System.out.println("Name is same as duplicate lead name");
        }else {
        	System.out.println("Name is different from duplicate lead name");
        }
        driver.close();
	}
}
