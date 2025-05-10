package saucedemopages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonCodeUse {
	WebDriver driver;
	
	//Page factory
	public CommonCodeUse(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void waitForWebElement(WebElement we, int time) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(we));
	}
	
	public void enterInput(WebElement we, String input, int time) {
		waitForWebElement(we, time);
		we.sendKeys(input);
	}
	
	public void clickElement(WebElement we, int time) {
		waitForWebElement(we, time);
		we.click();
	}

}
