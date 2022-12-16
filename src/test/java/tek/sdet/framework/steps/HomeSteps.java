package tek.sdet.framework.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.beust.jcommander.Strings;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;


public class HomeSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	

	@When("User click on All section")
	public void userClickOnAllSection() {
	click(factory.homePage().allElement);
	logger.info("user clicked on All element");
	}
	
	@When ("User on {string}")
	public void useronDepartment(String department) {
		if (department.equalsIgnoreCase("Electronics")) {
			click(factory.homePage().ElectronicsOPtion);
		} else if(department.equalsIgnoreCase("Computers")) {
			click(factory.homePage().ComputersOPtion);
		}
		else if(department.equalsIgnoreCase("Smart Home")) {
			click(factory.homePage().SmartHomeOPtion);  }
		
		else if(department.equalsIgnoreCase("Sports")) {
			click(factory.homePage().SportsOPtion);  }
		else if(department.equalsIgnoreCase("Automotive")) {
			click(factory.homePage().automativeTab);  }
		logger.info("all departments are present");
		
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable data) {
		
	List<String> allDeptSideBar = data.values();
				 
	 Assert.assertTrue(isElementDisplayed(factory.homePage().ElectronicsOPtion));
	Assert.assertTrue(isElementDisplayed(factory.homePage().ComputersOPtion));
	Assert.assertTrue(isElementDisplayed(factory.homePage().SmartHomeOPtion));
	Assert.assertTrue(isElementDisplayed(factory.homePage().SportsOPtion));
	Assert.assertTrue(isElementDisplayed(factory.homePage().automativeTab));
	logger.info("options are displayed");
	
			 }

	
	
	//verify user can add item to cart
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
	
		selectByVisibleText(factory.homePage().allDepartments, string);
	   
		logger.info("user changed the category =");
	   
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String value){
	 click(factory.homePage().searchInputField);
	 sendText(factory.homePage().searchInputField, value);

	 logger.info("user search for an item");
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
	   click(factory.homePage().searchButton);
	  
	   
	   logger.info("user clicked on search icon");
	   
	}
	
	
	@When("User click on item")
	public void userClickOnItem() {
		
		click(factory.homePage().kasa);
		logger.info("user clicked on item");

	
	
	}
	
	
	
	@When("Userclick add to Cart button")
	public void userclickAddToCartButton() {
	  click(factory.homePage().AddtoCartBttn);
	  logger.info("user clicked add to cart button");
	}

	
	@When("User select quantity ‘{int}’")
	public void userSelectQuantity(Integer int1) {
	    selectByIndex(factory.homePage().QuantityBttn, 2);
	    logger.info("user select quantity");
	}
	@Then("the cart icon quantity should change to ‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer int1) {
Assert.assertTrue(isElementDisplayed(factory.homePage().QuantityBttn));
logger.info("the cart icon quantity changed");
	}
	
	
	//verify place order no address or card
	
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
	   click(factory.homePage().AddtoCartBttn);
	   logger.info("user clicked on cart button");
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	   click(factory.homePage().CartButton);
	   logger.info("user clicked on cart option");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.homePage().ProceedtoCheckOutButton);
	    logger.info("user clicked on proceed to checkout");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	   click(factory.homePage().NewAddressForShippingBttn);
	   logger.info("user clicked add new address link for shipping");
	}
	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> newAddressInfoTable = data.asMaps(String.class, String.class);
		click(factory.accountPage().CountryDropDownMenu);
		selectByVisibleText(factory.accountPage().CountryDropDownMenu, newAddressInfoTable.get(0).get("country"));
		sendText(factory.accountPage().fullName, newAddressInfoTable.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumber, newAddressInfoTable.get(0).get("phoneNumber"));
		sendText(factory.accountPage().streetAddress, newAddressInfoTable.get(0).get("streetAddress"));
		sendText(factory.accountPage().aptInput, newAddressInfoTable.get(0).get("apt"));
		sendText(factory.accountPage().city, newAddressInfoTable.get(0).get("city"));
		click(factory.accountPage().state);
		selectByVisibleText(factory.accountPage().state, newAddressInfoTable.get(0).get("state"));
		sendText(factory.accountPage().zipCode, newAddressInfoTable.get(0).get("zipCode"));
		logger.info("user filled in new address info");
	
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	   click(factory.homePage().AddPaymentForShipping);
	   logger.info("user clicked add a credit card or debit");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	 click(factory.homePage().PlaceOrderBttn);
	 logger.info("user clicked on place your order");
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		waitTillPresence(factory.homePage().OrderPlacedSuccessMessege);
	Assert.assertTrue(isElementDisplayed(factory.homePage().OrderPlacedSuccessMessege));
	logger.info("order was placed");
	}
	
	// need to learn how to just click by visible text on a whole page.
	
	@When("User search for another item {string}")
	public void userSearchForAnotherItem(String value1){
	 click(factory.homePage().searchInputField);
	 sendText(factory.homePage().searchInputField, value1);

	 logger.info("user search for another item");
	}
	@And ("User click on new item")
	public void userClickOnNewItem() {
click(factory.homePage().ApexLegendOPtion);
	
	
	}
}


