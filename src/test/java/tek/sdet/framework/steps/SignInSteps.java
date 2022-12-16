package tek.sdet.framework.steps;


	
	
	import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import tek.sdet.framework.pages.POMFactory;
	import tek.sdet.framework.utilities.CommonUtility;

	public class SignInSteps extends CommonUtility {
		
		POMFactory factory = new POMFactory();

		@Given("User is on retail website")
		public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle +" is equal to "+ expectedTitle);
		
		}
		
		
		@When ("User click on Sign in option")
		public void userClickOnSignInOption() {
			click(factory.signInPage().signIn);
			logger.info("user clicked on Sign In option");
		}
		
		@And("User enter email {string} and password {string}")
		public void userEnterEmailAndPassword(String email,String password) {
			sendText(factory.signInPage().emailField,email);
			sendText(factory.signInPage().passwordField,password);
			logger.info("user entered email "+ email + " and password "+ password);
			slowDown();
			
		}
		
		@And("User click on login button")
		public void userClickOnLoginButton() {
			click(factory.signInPage().loginButton);
			logger.info("user clicked on login button");
		}
		
		@Then("User should be logged in into Account")
		public void userShouldBeLoggedInIntoAccount() {
			Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
			logger.info("user logged in into account");
			//slowDown();
			
		}
		
		@And("User click on Create New Account button")
		public void userClickOnCreateNewAccountButton() {
			click(factory.signInPage().createNewAccount);
			logger.info("user clicked on create new account button");
		}

//		

		@And("User fill the signUp information with below data")
    	public void userFillInfoWithBelowData(DataTable data) {
			List<Map<String,String>> SignUpInfo = data.asMaps(String.class,String.class);
			sendText(factory.signInPage().newName, SignUpInfo.get(0).get("name"));
			sendText(factory.signInPage().SignUpEmail, SignUpInfo.get(0).get("email"));
			sendText(factory.signInPage().SignUpnewPassWord, SignUpInfo.get(0).get("password"));
			sendText(factory.signInPage().SignInNewConfirmPass, SignUpInfo.get(0).get("confirmPassword"));
		}
	
		
	
		
		@And("User click on SignUp button")
		public void userClickonSignupBttn() {
			
		click(factory.signInPage().newSignUpBttn);
		logger.info("user clicked on sign up Button");
			
		}
		
		
		@Then ("User should be logged into account page")
		public void userShouldBeLoggedIntoAccountPage() {
			Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
			logger.info("user should be logged into account page");
		}
		
		//first scenerio
		
		

}
