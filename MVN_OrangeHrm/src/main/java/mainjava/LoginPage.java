package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//*[text()=' Login ']")
	WebElement btnlogin;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement txt;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginmethod() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		btnlogin.click();
	}
	
	public String textonpage() {
		return txt.getText();
	}
	
	public String urlofpage() {
		return driver.getCurrentUrl();
	}
	
}
