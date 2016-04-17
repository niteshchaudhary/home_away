package home.away.Storedemo.stepdefs;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import java.util.Iterator;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStepDef {

	static Class pageObjectClass = null;
	public static WebDriver driver;
	public static String pagename = null;
	public static Object currentPage = null;
    static HashMap <Integer,String> parentHandle = new HashMap<Integer,String>();
    
    @Given("^I log in to the application$")
	public void i_log_in_to_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://store.demoqa.com");
        //demoPage dp = PageFactory.initElements(driver, demoPage.class);
        getElementbyId("account").click();
        getElementbyId("log").sendKeys("nitesh");
        getElementbyId("pwd").sendKeys("Newuser$1");
        getElementbyId("login").click();
	}

	@When("^I place cursor on \"(.*?)\" link$")
	public void i_place_cursor_on_link(String elementNm) throws Throwable {
	    Actions action = new Actions(driver);
	    WebElement webElement = getElement(elementNm); //gets the webelement using the page object
	    Thread.sleep(10000);
	    action.moveToElement(webElement).perform(); //moves focus on the element
	    Thread.sleep(10000);
	}
	
	@And("^I am on the \"(.*?)\" page$")
	public void i_am_on_the_page(String pagevalue) throws Throwable {
	    pagename = pagevalue.replaceAll(" ", "") + "Page";
	    String pkg = "home.away.Storedemo.page";
	    currentPage = PageFactory.initElements(driver, Class.forName(pkg + "." + pagename)); //initializes the page objects of the page
	    Thread.sleep(2000);
	    pageObjectClass = Class.forName(pkg + "." + pagename);
	    Thread.sleep(2000);
	    System.out.println("Inside the page  " +pageObjectClass);
	}
	
	@And("^I click on \"(.*?)\" (?:button|link)$")
	public void i_click_on_link(String elementNm) throws Throwable {
	    WebElement element = getElement(elementNm);
	    Thread.sleep(10000);
	    System.out.println("The element is" +element);
	    element.click();
	}

	@And("^My focus is set on the body frame$")
	public static void switchto_iFrame() throws InterruptedException {
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); //move focus to the child window
		Thread.sleep(10000);
	
	}
		
	@Then("^I verify that the \"(.*?)\" text field is \"(.*?)\"$")
	public void i_verify_the_text_field(String element, String value) throws Throwable {
		WebElement elementNm = getElement(element);
		String actualdata = elementNm.getAttribute("value");
		System.out.println(actualdata);
		Assert.assertEquals(value, actualdata); //verifies whether the actual data is meeting the expected
		
	}

	

	@Then("^I verify that the \"(.*?)\" is \"(.*?)\"$")
	public void i_verify_that_the_label(String element, String value) throws Throwable {
		WebElement elementNm = getElement(element);
		String actualdata = elementNm.getText();
		System.out.println(actualdata);
		Assert.assertEquals(value, actualdata);
		
	}
	
	@And("^I enter \"(.*?)\" in the \"(.*?)\" (?:text field|field)$")
    public static void enter_text(String value, String elementNm) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InterruptedException{
		WebElement webElement = getElement(elementNm);
		webElement.clear();
		webElement.sendKeys(value);
	}
	
//function to get webelement using the page object
    public static WebElement getElement(String elementNm) 
    		throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InterruptedException{
		
    	String elementName = elementNm.replaceAll(" ", "");
    	Field field = pageObjectClass.getField(elementName);
    	System.out.println("Field 1" +field);
    	Thread.sleep(10000);
    	WebElement webElement = (WebElement) field.get(elementName);
    	System.out.println("Webelement" +webElement);
    	return webElement;
    	
    }
	
    public static WebElement getElementbyId(String id){
    	return driver.findElement(By.id(id));
    }
    
}