package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id = "signinLink")
	public WebElement signIn;
	@FindBy(id = "email")
	public WebElement emailField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(xpath ="//button[@type='submit']")
	public WebElement loginButton;

	@FindBy(id = "newAccountBtn")
	public WebElement createNewAccount;
	
//	@FindBy(id = "nameInput")
//	public WebElement nameField;
	
	
	@FindBy (id = "nameInput")
	public WebElement newName;
	@FindBy (id = "phoneNumberInput")
	public WebElement phonenumber;
	
	@FindBy (id = "personalUpdateBtn")
	public WebElement updatebttn;
	
//	@FindBy(id = "confirmPasswordInput")
//	public WebElement confirmPasswordBttn;
	@FindBy(id = "signupBtn")
	public WebElement signupButton;
	@FindBy(id="accountLink")
	public WebElement account;
	@FindBy (id = "emailInput")
	public WebElement SignUpEmail;
	
	
	@FindBy (id = "passwordInput")
	public WebElement SignUpnewPassWord;
	@FindBy (id = "confirmPasswordInput")
	public WebElement SignInNewConfirmPass;
	@FindBy (id = "signupBtn")
	public WebElement newSignUpBttn;
	
}
