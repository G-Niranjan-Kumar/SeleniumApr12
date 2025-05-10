package saucedemopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends CommonCodeUse{
	
	//Page factory
	public ProductsPage(WebDriver driver) {
			super(driver);
	}

	//Page Elements
	@FindBy(id="item_4_title_link")
	private WebElement product;
	
	
	//Page Actions
	public void openProduct() {
		product.click();;
	}
	
}
