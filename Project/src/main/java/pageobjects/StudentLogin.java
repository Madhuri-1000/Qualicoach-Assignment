package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentLogin {
	public WebDriver driver;
	By user=By.id("username");
	By pass=By.id("password");
	By login=By.id("loginbtn");
	
	By course=By.xpath("//div[@cat-id='3'] /a /p[text()='Perl']");
	By coursesub=By.id("id_submitbutton");
	
	By taqid=By.xpath("//div[@cat-id='3'] /a /p[text()='SQL']");
	By tbqid=By.xpath("/html/body/div[3]/div/div/div/section/div[1]/div[2]/div/form/div/input[1]");

	
	By cid=By.xpath("//div[@cat-id='3'] /a /p[text()='ISTQB-ISEB']");
	By c1id=By.xpath("//div[@class='content'] / div[@id='accordion'] / div[8] ");
	By c2id=By.xpath("//div[@class='content'] / div[@id='accordion'] / div[8] / div[2] / div / ul / li / a ");
	By c3id=By.xpath("//div[@role='main'] /div / div / form / div / input[@type='submit']");
	
	//By tid=By.xpath("//div[3]/div/aside/div/div[2]/div/div[4]/div[2]/div/ul/li[2]/a/div[2]");
	//By t2id=By.xpath("//div[3]/div/aside/div/div[2]/div/div[4]/div[1]/div/ul/li/a");
	
	By qid=By.xpath("//div[@cat-id='3'] /a /p[text()='Python Beginners']");
	By q1id=By.xpath("//div[@class='content'] / div[@id='accordion'] / div[6]");
	By q2id=By.xpath("//div[@class='content'] / div[@id='accordion'] / div[6] / div[1] / div / ul / li / a ");
	
	By q3id=By.linkText("Answer the questions");
	
	By eid=By.xpath("//*[@id='action-menu-toggle-0']/span/span/span/img");
	By e1id=By.xpath("//*[@id='actionmenuaction-2']");
	By e2id=By.xpath("//*[@id='page-user-profile']/section/div[2]/div/div/div/section[1]/ul/li[1]/span/a");
	By e3id=By.xpath("//*[@id='id_firstname']");
	By e4id=By.xpath("//*[@id='id_firstname']");
	By e5id=By.xpath("//*[@id='id_submitbutton']");
	public StudentLogin(WebDriver driver) {
		
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
	public WebElement getcourseid() {
		return driver.findElement(course);
	}
	public WebElement getcoursesub() {
		return driver.findElement(coursesub);
	}
	public WebElement gettaqid() {
		return driver.findElement(taqid);
	}
	public WebElement gettbqid() {
		return driver.findElement(tbqid);
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
	/*public WebElement gettid() {
		return driver.findElement(tid);
	}
	
	public WebElement gett2id() {
		return driver.findElement(t2id);
	}*/
	public WebElement getqid() {
		return driver.findElement(qid);
	}
	public WebElement getq1id() {
		return driver.findElement(q1id);
	}
	public WebElement getq2id() {
		return driver.findElement(q2id);
	}
	public WebElement getq3id() {
		return driver.findElement(q3id);
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
	
}
