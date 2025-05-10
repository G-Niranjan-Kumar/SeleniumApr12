package saucedemopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInfoPage extends CommonCodeUse{
	
	//Page factory
	public CheckoutInfoPage(WebDriver driver) {
		super(driver);
	}

	//Page Elements
	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	
	@FindBy(id="postal-code")
	private WebElement postalcode;
	
	@FindBy(id="continue")
	private WebElement proceednext;
	
	//Page Actions
	public void checkoutInformatio() {
		firstname.sendKeys("Niranjan");
		lastname.sendKeys("Gangaraju");
		postalcode.sendKeys("L5W1C9");
		proceednext.click();
	}
	
}
