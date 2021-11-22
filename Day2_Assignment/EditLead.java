package Week2.Day2_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ananthi");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("10204")).click();
String title = driver.getTitle();
System.out.println(title);
String name ="View Lead | opentaps CRM";
if(name.equals(title)) {
	System.out.println("Title is same");
}
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_companyName")).clear();
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Cognizant");
driver.findElement(By.name("submitButton")).click();
String str = driver.findElement(By.id("viewLead_companyName_sp")).getText();
if(str.contains("Cognizant (10204)")) {
	System.out.println("Company name is changed");
}else {
		System.out.println("Company name is not changed");
	}
driver.close();
}	
}



