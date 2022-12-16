package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy (id = "nameInput")
	public WebElement newUpdateName;
	@FindBy (id = "emailInput")
	public WebElement UpdateEmail;
	
	@FindBy (id = "accountLink")
	public WebElement accountBttn;
	
	@FindBy (id = "nameInput")
	public WebElement newname;
	@FindBy (id = "personalPhoneInput")
	public WebElement UpdatePhonenumber;

	@FindBy (id = "personalUpdateBtn")
	public WebElement UpdateBttn;
	
	
	@FindBy (id = "previousPasswordInput")
	public WebElement PreviousPassword;

	@FindBy (xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement UpdateSuccessMessage;
	@FindBy (id = "newPasswordInput")
	public WebElement NewUpdatePassword;
	@FindBy (id = "confirmPasswordInput")
	public WebElement NewConfirmPasswordUpdate;
	@FindBy (id = "credentialsSubmitBtn")
	public WebElement UpdatePasswordButtonRetail;
	@FindBy (xpath = "//div[text()='Password Updated Successfully']")
	public WebElement  UpdatedPasswordMessage;
	
	//add payment
	
	@FindBy (xpath = "//p[text()='Add a payment method']")
	public WebElement addPaymentMethodLink;
	
	@FindBy (id = "cardNumberInput")
	 public WebElement cardNumberInput;
	@FindBy (id = "nameOnCardInput")
	public WebElement nameONCardInput;
	@FindBy (id = "expirationMonthInput")
	public WebElement expirationMonthInput;
	@FindBy (id = "expirationYearInput")
	public WebElement expirationYear;
	@FindBy (id = "securityCodeInput")
	public WebElement securityCode;
	@FindBy (id = "paymentSubmitBtn")
	public WebElement AddSubmitcardInfoBttn;
	
	@FindBy (xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement PaymentAddedMessege;

	//edit card info
@FindBy (xpath = "//img[@src='/images/master_card.png']")
public WebElement ClickOnCreditCard4338;
	
	@FindBy (xpath = "//button[text()='Edit']")
	public WebElement editYourCard;
	@FindBy (id = "paymentSubmitBtn")
	public WebElement updateCardBttn;

//@FindBy (xpath = "//div[@class= 'account__payment-selected account__payment-item']")
//public WebElement ClickOnCreditCard;
	//this is two of two
//	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button[2]")
//	public WebElement removeCardBttn;
//	
	@FindBy (xpath = "//div[text()= 'Payment Method updated Successfully']")
	public WebElement CardUpdatedMessage;
	@FindBy (xpath = "//button[text()='Remove']")
	public WebElement RemoveUrCardBttn;
	@FindBy (xpath = "//p[text()='Add Address']")
	public WebElement AddAddressBttn;
	
	
	@FindBy (id = "fullNameInput")
	public WebElement fullName;
	@FindBy (id = "countryDropdown")
	public WebElement country;

	@FindBy  (id = "phoneNumberInput")
	public WebElement phoneNumber;
	@FindBy (id = "streetInput")
	public WebElement streetAddress;

	
	@FindBy (id = "cityInput")
	public WebElement city;
	
	
	// need help to write path for state dropdowm box in edit address
	@FindBy (xpath = "//*[@id=\"newForm\"]/div[5]/div[2]/div/div/select")
	public WebElement state;

	@FindBy (id = "zipCodeInput")
	public WebElement zipCode;
	
	@FindBy(id = "countryDropdown")
	public WebElement CountryDropDownMenu;
	@FindBy(id = "apartmentInput")
	public WebElement aptInput;
	@FindBy(id = "addressBtn")
	public WebElement FinalAddAddress;
	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	public WebElement AddressAddedMessege;
	@FindBy (xpath = "//button[text()='Edit']")
	public WebElement EditAddressStart;
@FindBy(xpath = "//div[text()='Address Updated Successfully']")
public WebElement AddressUpdatedSuccesMESSEGE;


	
@FindBy(id = "addressBtn")
public WebElement UpdateAddressBtnFINAL;

@FindBy(xpath = "//button[text()='Remove']")
public WebElement RemoveAddressOPtion;
}
