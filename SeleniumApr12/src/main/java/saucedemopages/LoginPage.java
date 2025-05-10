package saucedemopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonCodeUse{
	
	/*
	 * WebDriver driver;
	 * 
	 * //Page factory 
	 * public LoginPage(WebDriver driver) {
	 * PageFactory.initElements(driver, this); this.driver = driver; }
	 */

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Page Elements
	@FindBy(name="user-name")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement login;
	
	
	//Page Actions
	public void enterUserName() {
		/*
		 * waitForWebElement(username, 5); username.sendKeys("standard_user");
		 */
		enterInput(username, "standard_user", 3);
	}
	
	public void enterPassword() {
		/* password.sendKeys("secret_sauce"); */
		enterInput(password, "secret_sauce", 3);
	}
	
	public void loginButton() {
		/* login.click(); */
		clickElement(login, 3);
	}
	
}
