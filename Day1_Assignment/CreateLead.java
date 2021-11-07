package Week2.Day1_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

	        WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");			
			WebElement eleusername = driver.findElement(By.id("username"));
			eleusername.sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ZOHO");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ananthi");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arumugasamy");
			driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
			driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Affiliate Sites");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ananthi");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("A");
			driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
			driver.findElement(By.name("birthDate")).sendKeys("10/9/99");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Team Leader");
			driver.findElement(By.name("departmentName")).sendKeys("EEE");
			driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("400000");
			driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Computer Software");
			driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
			driver.findElement(By.name("ownershipEnumId")).sendKeys("Partnership");
			driver.findElement(By.name("sicCode")).sendKeys("2456");
			driver.findElement(By.name("tickerSymbol")).sendKeys("Agree");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Have a nice day");
			driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("All is well");
			driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
			driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
			driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("606302");
			driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("3248");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7558150281");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babyananthi.1999@gmail.com");
			driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("Ananthi");
			driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.cbi.com");
			driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ananthi");
			driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("2/22,Nallur");
			driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Nallur");
			driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("606302");
			driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("044");
			driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Ananthi");
			driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("2/22,veppur");
			driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Indiana");
			driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
     		driver.findElement(By.name("submitButton")).click();
	

}
}