package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement logo;

	@FindBy(id = "search")
	public WebElement allDepartments;

	@FindBy(id = "searchInput")
	public WebElement searchInputField;

	@FindBy(id = "searchBtn")
	public WebElement searchButton;

	@FindBy(xpath = "//img[@alt='PlayStation 5 Console']")
	public WebElement playStationItem;

	@FindBy(xpath = "//span[text()='All']")
	public WebElement allElement;

	@FindBy(id = "contentHeader")
	public WebElement shopByDepartment;

	@FindBy(id = "cartBtn")
	public WebElement cart;

	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement ElectronicsOPtion;

	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement ComputersOPtion;

	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement SmartHomeOPtion;

	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement SportsOPtion;

	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automativeTab;

	@FindBy(xpath = "//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement kasa;
	@FindBy(xpath = "//div[@class='products']")
	public WebElement productPage;
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement QuantityBttn;

	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement AddtoCartBttn;
	@FindBy(xpath = "//div[text()='cartBtn']")
	public WebElement cartDisplay;
	@FindBy(id = "cartBtn")
	public WebElement CartButton;

	@FindBy(id = "proceedBtn")
	public WebElement ProceedtoCheckOutButton;
	
	@FindBy(id = "addAddressBtn")
	public WebElement NewAddressForShippingBttn;
	
	@FindBy(id = "addPaymentBtn")
	public WebElement AddPaymentForShipping;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement PlaceOrderBttn;
	
	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	public WebElement OrderPlacedSuccessMessege;
	
	@FindBy(xpath = "//p[text()='Apex Legends - 1,000 Apex Coins']")
	public WebElement ApexLegendOPtion;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
