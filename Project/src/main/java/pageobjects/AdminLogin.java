package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLogin {

	public WebDriver driver;
	By user=By.id("username");
	By pass=By.id("password");
	By login=By.id("loginbtn");
	
	By cid=By.xpath("//*[@id='page-admin-search']/section/div[2]/div/ul/li[2]/a");
	By c1id=By.xpath("//*[@id='linkusers']/div/div/div[2]/div[2]/ul/li[3]/a");
	By c2id=By.xpath("//*[@id='id_username']");
	By c3id=By.xpath("//*[@id='id_auth']/optgroup[1]/option[2]");
	By c4id=By.xpath("//*[@id='id_createpassword']");
	By c41id=By.xpath("//span/em[contains(text(),'Click to enter text')]");
	By c42id=By.xpath("//*[@id='id_newpassword']");
	By c5id=By.xpath("//*[@id='id_firstname']");
	By c6id=By.xpath("//*[@id='id_lastname']");
	By c7id=By.xpath("//*[@id='id_email']");
	By c8id=By.xpath("//*[@id='id_maildisplay']/option[2]");
	By c9id=By.xpath("//*[@id='id_city']");
	By c10id=By.xpath("//*[@id='id_country']/option[104]");
	By c11id=By.xpath("//*[@id='id_description_editoreditable']");
	By c12id=By.xpath("//*[@id='id_submitbutton']");
	
	
	By eid=By.xpath("//*[@id='page-admin-search']/section/div[2]/div/ul/li[2]/a");
	By e1id=By.xpath("//*[@id='linkusers']/div/div/div[2]/div[2]/ul/li[1]/a");
	By e2id=By.xpath("//*[@id='id_realname']");
	By e3id=By.xpath("//*[@id='id_addfilter']");
	By e4id=By.xpath("//div[2]/div/div[1]/table/tbody/tr[3]/td[6]/a[3]");
	By e5id=By.xpath("//*[@id='id_username']");
	By e6id=By.xpath("//*[@id='id_submitbutton']");
	
	By ed1id=By.xpath("//div[2]/div/div[1]/table/tbody/tr/td[6]/a[1]");
	By ed2id=By.xpath("//*[@id='modal-footer']/div/div[1]/form/div/input[1]");

	By crid=By.xpath("//*[@id='page-admin-search']/section/div[2]/div/ul/li[3]/a");
	By cr1id=By.xpath("//*[@id='linkcourses']/div/div/div[1]/div[2]/ul/li[1]/a");
	By cr2id=By.xpath("//*[@id='category-listing']/div/div[1]/a");
	By cr3id=By.xpath("//*[@id='id_parent']/option[1]");
	By cr4id=By.xpath("//*[@id='id_name']");
	By cr5id=By.xpath("//*[@id='id_idnumber']");
	By cr6id=By.xpath("//*[@id='id_description_editoreditable']");
	By cr7id=By.xpath("//*[@id='id_submitbutton']");
	By cr8id=By.xpath("//section/div[2]/div/form[1]/div[2]/div[1]/div/ul/li[22]/div/a");
	By cr9id=By.xpath("//section/div[2]/div/form[1]/div[2]/div[2]/div/div[1]/a");
	By cr10id=By.xpath("//*[@id='id_fullname']");
	By cr11id=By.xpath("//*[@id='id_shortname']");
	By cr12id=By.xpath("//*[@id='id_idnumber']");
	By cr13id=By.xpath("//*[@id='id_summary_editoreditable']");
	By cr14id=By.xpath("//*[@id='id_saveanddisplay']");
	
	
	By d1id=By.xpath("//*[@id='inst168']/div[2]/ul/li[1]/div/a");
	By d2id=By.xpath("//section/div[2]/div/div[3]/a[1]");
	
	
public AdminLogin(WebDriver driver) {
		
		this.driver=driver;
	}
	public WebElement getUserid() {
		return driver.findElement(user);
	}
	public WebElement getPass() {
		return driver.findElement(pass);
	}
	public WebElement getlogin() {
		return driver.findElement(login);
		
	}
	public WebElement getcid() {
		return driver.findElement(cid);
		
	}
	public WebElement getc1id() {
		return driver.findElement(c1id);
		
	}
	public WebElement getc2id() {
		return driver.findElement(c2id);
		
	}
	public WebElement getc3id() {
		return driver.findElement(c3id);
		
	}
	public WebElement getc4id() {
		return driver.findElement(c4id);
		
	}
	public WebElement getc41id() {
		return driver.findElement(c41id);
		
	}
	public WebElement getc42id() {
		return driver.findElement(c4id);
		
	}
	public WebElement getc5id() {
		return driver.findElement(c5id);
		
	}
	public WebElement getc6id() {
		return driver.findElement(c6id);
		
	}
	public WebElement getc7id() {
		return driver.findElement(c7id);
		
	}
	public WebElement getc8id() {
		return driver.findElement(c8id);
		
	}
	public WebElement getc9id() {
		return driver.findElement(c9id);
		
	}
	public WebElement getc10id() {
		return driver.findElement(c10id);
		
	}
	public WebElement getc11id() {
		return driver.findElement(c11id);
		
	}
	public WebElement getdc12id() {
		return driver.findElement(c12id);
		
	}
	public WebElement geteid() {
		return driver.findElement(eid);
		
	}
	public WebElement gete1id() {
		return driver.findElement(e1id);
		
	}
	public WebElement gete2id() {
		return driver.findElement(e2id);
		
	}
	public WebElement gete3id() {
		return driver.findElement(e3id);
		
	}
	public WebElement gete4id() {
		return driver.findElement(e4id);
		
	}
	public WebElement gete5id() {
		return driver.findElement(e5id);
		
	}
	public WebElement gete6id() {
		return driver.findElement(e6id);
		
	}
	public WebElement geted1id() {
		return driver.findElement(ed1id);
		
	}
	public WebElement geted2id() {
		return driver.findElement(ed2id);
		
	}
	public WebElement getcrid() {
		return driver.findElement(crid);
		
	}
	public WebElement getcr1id() {
		return driver.findElement(cr1id);
		
	}

	public WebElement getcr2id() {
		return driver.findElement(cr2id);
		
	}

	public WebElement getcr3id() {
		return driver.findElement(cr3id);
		
	}
	public WebElement getcr4id() {
		return driver.findElement(cr4id);
		
	}
	public WebElement getcr5id() {
		return driver.findElement(cr5id);
		
	}
	public WebElement getcr6id() {
		return driver.findElement(cr6id);
		
	}
	public WebElement getcr7id() {
		return driver.findElement(cr7id);
		
	}
	public WebElement getcr8id() {
		return driver.findElement(cr8id);
		
	}
	public WebElement getcr9id() {
		return driver.findElement(cr9id);
		
	}
	public WebElement getcr10id() {
		return driver.findElement(cr10id);
		
	}
	public WebElement getcr11id() {
		return driver.findElement(cr11id);
		
	}
	public WebElement getcr12id() {
		return driver.findElement(cr12id);
		
	}
	public WebElement getcr13id() {
		return driver.findElement(cr13id);
		
	}
	public WebElement getcr14id() {
		return driver.findElement(cr14id);
		
	}
	
	public WebElement getd1id() {
		return driver.findElement(d1id);
		
	}
	public WebElement getd2id() {
		return driver.findElement(d2id);
		
	}
	
	


}