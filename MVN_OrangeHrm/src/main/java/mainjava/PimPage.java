package mainjava;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage extends BaseClass {

	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']")
	WebElement txt;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	List<WebElement> checkbox;
	
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String textonpage() {
		return txt.getText();
	}
	
	public void checkboxselection() {
		checkbox.get(0).click();
	}
	
	public boolean selectionOfcheckbox() {
		return checkbox.get(0).isSelected();
	}
}
