package saucedemopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends CommonCodeUse{
	
	//Page factory
	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	//Page Elements
	@FindBy(id="checkout")
	private WebElement checkout;
	
	//Page Actions
	public void checkout() {
		checkout.click();;
	}
	
}
