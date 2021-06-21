package PageActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions {
	
	WebDriver currentDriver = null;
	
	public PageActions(WebDriver driver) {
		currentDriver = driver;
		
	}

	public void clickOnSignInBtn() {
		
		currentDriver.findElement(By.xpath("//a[@class='login']")).click();
		
	}

	public void enterUserName() {
		By ele = By.xpath("//input[@id='email']");
		waitForElement(ele);
		currentDriver.findElement(ele).sendKeys("priyamanikandan16@gmail.com");
	
		
	}
	
public void enterPassword() {
		
		currentDriver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Pass@1234");
	
		
	}

public void clickSubmitBtn() {
	currentDriver.findElement(By.id("SubmitLogin")).click();
	
}

public void clickOnTShirts() {
	By ele = By.xpath("//div[@id='block_top_menu']/ul/li/a[contains(text(),'T-shirts')]");
	waitForElement(ele);
	currentDriver.findElement(ele).click();
	
}

public void addTShirts() {
	By ele = By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
	Actions action = new Actions(currentDriver);
	action.moveToElement(currentDriver.findElement(ele)).build().perform();
	By ele1 = By.xpath("//div[@class='button-container']/a[ @title='Add to cart']");
	waitForElement(ele1);
	currentDriver.findElement(ele1).click();
	By ele2 = By.xpath("//*[@title='Close window']");
	waitForElement(ele2);
	currentDriver.findElement(ele2).click();
	
}

public void viewShoppingCart() {
	WebElement viewMyCart = currentDriver.findElement(By.xpath("//a[@title='View my shopping cart']"));
	if(viewMyCart.isDisplayed())
	{
		viewMyCart.click();
		By ele = By.xpath("//td[@class='cart_description']//a[contains(text(),'T-shirts')]");
		waitForElement(ele);
		Assert.assertTrue("T-Shirt is not added", currentDriver.findElement(ele).isDisplayed());
	} else {
		Assert.fail("View My Cart is not displayed");
	
	}
	
}

public void waitForElement(By ele) {
	WebDriverWait wait = new WebDriverWait(currentDriver, 60); 
    wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
	
}

public void clickOnCustomerAccount() {
	
	By ele = By.xpath("//a[@title='View my customer account']");
	waitForElement(ele);
	currentDriver.findElement(ele).click();
	

	
}

public void clickOnCustomerInformation() {
	By ele = By.xpath("//ul[@class='myaccount-link-list']/li/a[@title='Information']");
	waitForElement(ele);
	currentDriver.findElement(ele).click();
	
}

public void editFirstName() {
	By ele = By.xpath("//input[@id='firstname']");
	waitForElement(ele);
	currentDriver.findElement(ele).clear();
	currentDriver.findElement(ele).sendKeys("Priya");
	
	By passEle = By.xpath("//input[@id='old_passwd']");
	waitForElement(ele);
	currentDriver.findElement(passEle).sendKeys("XX12345");
	
	By saveBtn = By.xpath("//button[@name='submitIdentity']");
	waitForElement(ele);
	currentDriver.findElement(saveBtn).click();
	
}

}
