package QualicoachProject;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageobjects.AdminLogin;
import resources.base;

public class AdminLoginPage extends base{
	
	public static Logger log = LogManager.getLogger(AdminLoginPage.class.getName());
	
	@Test(priority=1)
	public void createUser() throws IOException, InterruptedException
	{
		
		driver=initializeDriver();
		driver.get("https://test.qualicoach.org/admin/search.php");
		driver.manage().window().maximize();
		AdminLogin l = new AdminLogin(driver);
		l.getUserid().sendKeys("admin70");
		l.getPass().sendKeys("Admin@8125");
		l.getlogin().click();
		Thread.sleep(1000);
		l.getcid().click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		l.getc1id().click();
		Thread.sleep(1000);
		l.getc2id().sendKeys("admin20002");
		Thread.sleep(1000);
		l.getc3id().click();
		Thread.sleep(1000);
		l.getc4id().click();
		l.getc41id().click();
		Thread.sleep(2000);
		l.getc42id().sendKeys("Hello124");
		js.executeScript("window.scrollBy(0,300)");
		l.getc5id().sendKeys("abc20002");
		Thread.sleep(1000);
		l.getc6id().sendKeys("xyz20002");
		Thread.sleep(1000);
		l.getc7id().sendKeys("abc20002@qualitestgroup.com");
		Thread.sleep(1000);
		l.getc8id().click();
		Thread.sleep(1000);
		l.getc9id().sendKeys("HUBLI");
		Thread.sleep(1000);
		l.getc10id().click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		l.getc11id().sendKeys("Qualitest Employee Fresher");
		js.executeScript("window.scrollBy(0,1000)");
		l.getdc12id().click();
		
		log.info("User created successfully");
	
		driver.close();
		
	}
	@Test(priority=2)
	public void editUser() throws  IOException ,InterruptedException
	{
		driver=initializeDriver();
		driver.get("https://test.qualicoach.org/admin/search.php");
		driver.manage().window().maximize();
		AdminLogin l = new AdminLogin(driver);
		l.getUserid().sendKeys("admin70");
		l.getPass().sendKeys("Admin@8125");
		l.getlogin().click();
		Thread.sleep(1000);
		l.geteid().click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		l.gete1id().click();
		Thread.sleep(1000);
		l.gete2id().sendKeys("Test");
		Thread.sleep(1000);
		l.gete3id().click();
		Actions a = new Actions(driver);
		WebElement e =l.gete4id();
		a.moveToElement(e).click().build().perform();
		l.gete5id().clear();
		l.gete5id().sendKeys("namechanged123");
		l.gete6id().click();
		
		log.info("Edit User Successfull");
		driver.close();
}
	@Test(priority=3)
	public void deleteUser() throws  IOException ,InterruptedException
	{
		driver=initializeDriver();
		driver.get("https://test.qualicoach.org/admin/search.php");
		driver.manage().window().maximize();
		AdminLogin l = new AdminLogin(driver);
		l.getUserid().sendKeys("admin70");
		l.getPass().sendKeys("Admin@8125");
		l.getlogin().click();
		Thread.sleep(1000);
		l.geteid().click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		l.gete1id().click();
		Thread.sleep(2000);
		l.gete2id().sendKeys("example");
		Thread.sleep(1000);
		l.gete3id().click();
		Actions a = new Actions(driver);
		WebElement e =l.geted1id();
		a.moveToElement(e).click().build().perform();
		//l.geted2id().click();
		Thread.sleep(3000);
		
		log.info("Delete User Successfull");
		driver.close();
		
	}
	
	@Test(priority=4)
	public void createcourse() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get("https://test.qualicoach.org/admin/search.php");
		driver.manage().window().maximize();
		AdminLogin l = new AdminLogin(driver);
		l.getUserid().sendKeys("admin70");
		l.getPass().sendKeys("Admin@8125");
		l.getlogin().click();
		Thread.sleep(1000);
		l.getcrid().click();
		Thread.sleep(1000);
		l.getcr1id().click();
		Thread.sleep(1000);
		l.getcr2id().click();
		Thread.sleep(1000);
		l.getcr3id().click();
		Thread.sleep(1000);
		l.getcr4id().sendKeys("C Basic40");
		Thread.sleep(4000);
		l.getcr5id().sendKeys("20006");
		Thread.sleep(2000);
		l.getcr6id().sendKeys("This is a course which is basic of C");
		Thread.sleep(1000);
		l.getcr7id().click();
		Thread.sleep(1000);
		l.getcr8id().click();
		Thread.sleep(1000);
		l.getcr9id().click();
		Thread.sleep(1000);
		l.getcr10id().sendKeys("C Basic Course40");
		Thread.sleep(1000);
		l.getcr11id().sendKeys("C40 ");
		Thread.sleep(1000);
		l.getcr12id().sendKeys("140");
		Thread.sleep(1000);
		l.getcr13id().sendKeys("C Basic Programing Course 40");
		Thread.sleep(1000);
		l.getcr14id().click();
		Thread.sleep(1000);
		
		log.info("Created Course Successfull");
		driver.close();
	}

@Test(priority=5)
public void downloadReport() throws InterruptedException, IOException 
{
	driver=initializeDriver();
	driver.get("https://test.qualicoach.org/my/");
	driver.manage().window().maximize();
	AdminLogin l = new AdminLogin(driver);
	l.getUserid().sendKeys("admin70");
	l.getPass().sendKeys("Admin@8125");
	l.getlogin().click();
	Thread.sleep(1000);
	l.getd1id().click();
	Thread.sleep(4000);
	l.getd2id().click();
	Thread.sleep(1000);
	
	log.info("Downloaded Report Successfull");
	driver.close();
}


	
}

