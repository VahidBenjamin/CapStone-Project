package tek.sdet.framework.steps;

import java.util.List;
import java.util.Scanner;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class OrderSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@And ("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().OrderLink);
		logger.info("user clicked on orders section");
		slowDown();
	}
	
	
	@And ("User click on first order in list")
	public void userClickOnFirstOrder() {
//		click(factory.orderPage().FirstOrderOPtion);
	logger.info("user clicked on the first order on the list");	
	}

	@And ("User click on Cancel The Order button")
	public void userClickedOnCancelTheOrderButton() {
		click(factory.orderPage().CancelOrderBttn);	
		logger.info("user clicked on cancel order");
	}
	
	@When("User select the cancelation Reason 'Bought wrong item’")
	public void userSelectTheCancelationReasonBoughtWrongItem() {
	  click(factory.orderPage().BoughtWrongItem); 
	  click(factory.orderPage().BoughtWrongItem);
	  logger.info("user selected bought wrong item choice");
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		slowDown();
	   click(factory.orderPage().CancelFinalizeBttn);
	   logger.info("user clicked on cancel order button");
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().OrderCancelledMessege));
	    logger.info("user recieved order cancelled messege");
	}
	
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	   click(factory.orderPage().returnItemBttn);
	   logger.info("user clicked on return item button");
	}
//	@When("And User select the Return Reason 'Item damaged'")
//	public void userSelectTheReturnReasonItemDamaged() {
//	  click(factory.orderPage().ItemDamaged);
//	    logger.info("user selected reason for return");
//	   
//	}
	
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
	  selectByVisibleText(factory.orderPage().ReasonForCancelOrder, string);
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedEx(String string) {
	  selectByVisibleText(factory.orderPage().DropOffInput, string);
	  logger.info("user select the drop off location");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	   click(factory.orderPage().SubmitReturn);
	   logger.info("user click submitreturn button");
	}
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().ReturnSuccessMessege));
	    logger.info("message of item returned visible");
	}

	//write a review
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	   click(factory.orderPage().WriteAreviewBttn);
	   logger.info("user clicked on review button");
	}
	
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText(String string1, String string2) {
	 
//		click(factory.orderPage().HeadlineInput);
	   sendText(factory.orderPage().HeadlineInput, string1);
	   sendText(factory.orderPage().ReviewInput, string2);
	   logger.info("user entered headline and review");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	    click(factory.orderPage().AddReviewBttn);
	    logger.info("user clicked on add review button to send review");
	    slowDown();
	}
	@Then("a review message should be displayed ‘Your review was added successfully")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
	 Assert.assertTrue(isElementDisplayed(factory.orderPage().ReviewAddedSuccessMessege));
	 logger.info("messege recieved, review added successfuly");
	}

	
	
	
	
	
	
	
	
	
	
}
