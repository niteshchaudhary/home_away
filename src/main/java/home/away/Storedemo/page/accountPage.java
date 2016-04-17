package home.away.Storedemo.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class accountPage {
	
	@FindBy(how = How.XPATH, using = ".//*[@id='menu-item-33']/a")
	public static WebElement productcategory;

	@FindBy(how = How.XPATH, using = ".//*[@id='menu-item-37']/a")
	public static WebElement iPhones;
 
	@FindBy(how = How.XPATH, using = ".//*[@id='default_products_page_container']/div[4]/div[2]/h2/a")
 	public static WebElement AppleiPhone;

	@FindBy(how = How.XPATH, using = ".//*[@id='single_product_page_container']/div[1]/div[2]/form/div[2]/div[1]")
 	public static WebElement Addtocart;

	@FindBy(how = How.XPATH, using = ".//*[@id='fancy_notification_content']/a[1]")
 	public static WebElement gotocheckout;

	@FindBy(how = How.XPATH, using = ".//*[@id='checkout_page_container']/div[1]/a")
 	public static WebElement Continue;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[4]")
 	public static WebElement price;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='wpsc_shopping_cart_container']/form/div[4]/div/div")
 	public static WebElement purchase;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='post-30']/header/h1")
 	public static WebElement text;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='post-31']/div/div/div/a[2]")
 	public static WebElement yourdetails;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='wpsc_checkout_form_3']")
 	public static WebElement lastname;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='meta']/ul/li[2]/a")
 	public static WebElement logout;

	@FindBy(how = How.XPATH, using = ".//*[@id='post-31']/div/div/form/table[3]/tbody/tr/td/input[2]")
 	public static WebElement saveprofile;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[6]/form/input[4]")
 	public static WebElement remove;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='post-29']/div")
 	public static WebElement message;


}
