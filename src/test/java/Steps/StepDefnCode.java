package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageActions.PageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefnCode {
	
	WebDriver driver = null;
	
	@Given("Launch My Store App")
	public void launch_my_store_app() {
		String chromedriverPath = System.getProperty("user.dir")+ "/Chromedriver/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromedriverPath);
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
	   
	}

	@And("Click on SignIn Button")
	public void click_on_sign_in_button() {
		PageActions pageActions = new PageActions(driver);
		pageActions.clickOnSignInBtn();
	  
	}

	@Then("Enter Username and Password and Sign In to the app")
	public void enter_username_and_password_and_sign_in_to_the_app() {
		PageActions pageActions = new PageActions(driver);
		pageActions.enterUserName();
		pageActions.enterPassword();
		pageActions.clickSubmitBtn();
	   
	}

	@Then("Order T-Shirt")
	public void order_t_shirt() {
		
		PageActions pageActions = new PageActions(driver);
		pageActions.clickOnTShirts();
		pageActions.addTShirts();
	    
	}

	@Then("Verify the Order History")
	public void verify_the_order_history() {
		PageActions pageActions = new PageActions(driver);
		pageActions.viewShoppingCart();
		driver.close();
	   driver.quit();
	}
	
	@Then("Click on Customer Account Information")
public void customer_account_information() {
		PageActions pageActions = new PageActions(driver);
		pageActions.clickOnCustomerAccount();
		pageActions.clickOnCustomerInformation();
	}
	
	@And("Edit First Name and Save")
	public void edit_firstname_and_save() {
		PageActions pageActions = new PageActions(driver);
		pageActions.editFirstName();
		driver.close();
		driver.quit();
	}
}
