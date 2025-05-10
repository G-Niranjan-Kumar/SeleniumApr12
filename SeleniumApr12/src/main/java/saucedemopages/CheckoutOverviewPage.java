package saucedemopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage extends CommonCodeUse{
	
	//Page factory
	public CheckoutOverviewPage(WebDriver driver) {
		super(driver);
	}
	
	//Page Elements
	@FindBy(name="finish")
	private WebElement finish;
	
	//Page Actions
	public void finishOverview() {
		finish.click();
	}
	
}
