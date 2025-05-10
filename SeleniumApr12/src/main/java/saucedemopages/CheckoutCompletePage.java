package saucedemopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends CommonCodeUse{
	
	//Page factory
	public CheckoutCompletePage(WebDriver driver) {
		super(driver);
	}
	
	//Page Elements
	@FindBy(className="complete-header")
	private WebElement successmessage;
	
	@FindBy(id="back-to-products")
	private WebElement backtoproducts;
	
	public String getMessage() {
		return successmessage.getText(); //Thank you for your order!
	}

	//Page Actions
	public void backToProducts() {
		backtoproducts.click();
	}
	
}
