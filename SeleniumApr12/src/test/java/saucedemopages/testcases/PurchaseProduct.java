package saucedemopages.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import saucedemopages.CartPage;
import saucedemopages.CheckoutCompletePage;
import saucedemopages.CheckoutInfoPage;
import saucedemopages.CheckoutOverviewPage;
import saucedemopages.LoginPage;
import saucedemopages.ProductDetailsPage;
import saucedemopages.ProductsPage;

public class PurchaseProduct extends CommonTestNGMethods{
	
	@Test
	public void purchase() {
		
		LoginPage lp = new LoginPage(driver);
		ProductsPage pp = new ProductsPage(driver);
		ProductDetailsPage pdp = new ProductDetailsPage(driver);
		CartPage cp = new CartPage(driver);
		CheckoutInfoPage cip = new CheckoutInfoPage(driver);
		CheckoutOverviewPage cop = new CheckoutOverviewPage(driver);
		CheckoutCompletePage ccp = new CheckoutCompletePage(driver);		
		
		
		lp.enterUserName();
		lp.enterPassword();
		lp.loginButton();
		
		pp.openProduct();
		
		pdp.addToCart();
		pdp.shoppingCart();
		
		cp.checkout();
		
		cip.checkoutInformatio();
		
		cop.finishOverview();
		
		String success = ccp.getMessage();
		System.out.println("Purchase Success Message : "+success);
		
		ccp.backToProducts();
		
		Assert.assertEquals(success, "Thank you for your order!");
	}
	
}
