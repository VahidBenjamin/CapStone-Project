package tek.sdet.framework.steps;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountBttn);
		logger.info("user clicked on account button");
	}

	@When("User update name {string} and phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().newUpdateName);
		sendText(factory.accountPage().newUpdateName, nameValue);
		clearTextUsingSendKeys(factory.accountPage().UpdatePhonenumber);
		sendText(factory.accountPage().UpdatePhonenumber, phoneValue);
		logger.info("user updated name and phone");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().UpdateBttn);
		logger.info("user clicked on update button");
	}

	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().UpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().UpdateSuccessMessage));
		logger.info("user profile info was updated");
	}

	// update password

	@When("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> PassWordMaps = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().PreviousPassword, PassWordMaps.get(0).get("previousPassword"));
		sendText(factory.accountPage().NewUpdatePassword, PassWordMaps.get(0).get("newPassword"));
		sendText(factory.accountPage().NewConfirmPasswordUpdate, PassWordMaps.get(0).get("confirmPassword"));
		logger.info("user entered password update information");

	}

	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().UpdatePasswordButtonRetail);
		logger.info("user clicked on change Password button");
	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().UpdatedPasswordMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().UpdatedPasswordMessage));
		logger.info("password was updated successfully");
	}

// add payment 

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethodLink);
		logger.info("user clicked on add a payment link");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String, String>> DebitCardCollection = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, DebitCardCollection.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameONCardInput, DebitCardCollection.get(0).get("nameOnCard"));
		click(factory.accountPage().expirationMonthInput);
		selectByVisibleText(factory.accountPage().expirationMonthInput,
				DebitCardCollection.get(0).get("expirationMonth"));
		click(factory.accountPage().expirationYear);
		selectByVisibleText(factory.accountPage().expirationYear, DebitCardCollection.get(0).get("expirationYear"));

		sendText(factory.accountPage().securityCode, DebitCardCollection.get(0).get("securityCode"));
		logger.info("user filled out Debit or Credit card info");
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().AddSubmitcardInfoBttn);
		logger.info("User clicked on Add your Card button");
		slowDown();
	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		waitTillPresence(factory.accountPage().PaymentAddedMessege);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().PaymentAddedMessege));
		logger.info("Payment method added success message is displayed");
	}

	// edit card info

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		
		click(factory.accountPage().ClickOnCreditCard4338);
		click(factory.accountPage().editYourCard);
		logger.info("user clicked on edit card section");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {

		List<Map<String, String>> EditCardCollection = data.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput, EditCardCollection.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameONCardInput);
		sendText(factory.accountPage().nameONCardInput, EditCardCollection.get(0).get("nameOnCard"));
		click(factory.accountPage().expirationMonthInput);
		selectByVisibleText(factory.accountPage().expirationMonthInput,
				EditCardCollection.get(0).get("expirationMonth"));
		click(factory.accountPage().expirationYear);
		selectByVisibleText(factory.accountPage().expirationYear, EditCardCollection.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCode);
		sendText(factory.accountPage().securityCode, EditCardCollection.get(0).get("securityCode"));
		logger.info("user filled out Debit or Credit card info");

	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateCardBttn);
		logger.info("user clicked on update your card button");
	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().CardUpdatedMessage));
	}

/// remove credit card

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().RemoveUrCardBttn);
		logger.info("user clicked on remove option of card");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {

		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().cardNumberInput));
		logger.info("user removed card");

	}

	// verify user can add address

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().AddAddressBttn);
		logger.info("user clicked on Add address button");
	}

	@When("user fill new address form with below information")
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

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().FinalAddAddress);
		logger.info("user clicked add address button to finalize");

	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(factory.accountPage().AddressAddedMessege);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().AddressAddedMessege));
		logger.info("user added address successfully");
	}

	// verify user can edit address
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().EditAddressStart);
		clearTextUsingSendKeys(factory.accountPage().fullName);
		clearTextUsingSendKeys(factory.accountPage().phoneNumber);
		clearTextUsingSendKeys(factory.accountPage().streetAddress);
		clearTextUsingSendKeys(factory.accountPage().aptInput);
		clearTextUsingSendKeys(factory.accountPage().city);
		clearTextUsingSendKeys(factory.accountPage().zipCode);
		logger.info("user clicked on edit address option");
	}

	@And("And user fill new address form with below information")
	public void userfillnewaddressformtoEDIT(DataTable data) {
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

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().UpdateAddressBtnFINAL);
		logger.info("user clicked on update address after entering info");
	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().AddressUpdatedSuccesMESSEGE);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().AddressUpdatedSuccesMESSEGE));
		logger.info("address updated successfully");
	}

	// verify user can remove address
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().RemoveAddressOPtion);
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		//waitTillPresence(factory.accountPage().RemoveAddressOPtion);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().AddAddressBttn));
		logger.info("user removed card");
	}

}
