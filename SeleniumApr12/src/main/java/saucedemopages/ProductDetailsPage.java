package saucedemopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends CommonCodeUse{
	
	//Page factory
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	//Page Elements
	@FindBy(id="add-to-cart")
	private WebElement addtocart;
	
	@FindBy(className="shopping_cart_link")
	private WebElement shoppingcart;
	
	
	//Page Actions
	public void addToCart() {
		addtocart.click();;
	}
	
	public void shoppingCart() {
		shoppingcart.click();;
	}
	
}
