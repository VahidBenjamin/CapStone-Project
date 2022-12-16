package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	
@FindBy (id = "orderLink")	
public WebElement OrderLink;

@FindBy (xpath = "//div[@class='order__content']")
public WebElement FirstOrderOPtion;
	
@FindBy (id = "cancelBtn")
public WebElement CancelOrderBttn;

@FindBy (id = "reasonInput")
public WebElement ReasonForCancelOrder;

@FindBy (id ="orderSubmitBtn")
public WebElement CancelFinalizeBttn;

@FindBy (xpath = "//p[text()='Your Order Has Been Cancelled']")	
public WebElement OrderCancelledMessege;

@FindBy (xpath = "//option[text()='Bought wrong item']")
public WebElement BoughtWrongItem;
@FindBy (xpath = "//option[text()='Item damaged']")
public WebElement ItemDamaged;

//return item
@FindBy(id = "returnBtn")
public WebElement returnItemBttn;
@FindBy(id = "dropOffInput")
public WebElement DropOffInput;
@FindBy(id = "orderSubmitBtn")
public WebElement SubmitReturn;
@FindBy(xpath = "//p[text()='Return was successfull']")
public WebElement ReturnSuccessMessege;

//write a review
@FindBy(id = "reviewBtn")
public WebElement WriteAreviewBttn;
@FindBy(id = "headlineInput")
public WebElement HeadlineInput;
@FindBy(id = "descriptionInput")
public WebElement ReviewInput;
@FindBy (id = "reviewSubmitBtn")
public WebElement AddReviewBttn;
@FindBy (xpath = "//div[text()='Your review was added successfully']")
public WebElement ReviewAddedSuccessMessege;


















}