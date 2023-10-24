package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Final {
      
	
	 WebDriver driver;
	
	@Given("I am on amazon home page")
	public void i_am_on_amazon_home_page() {
		
		System.out.println("welcome to the home page");
		
	    
	}
   @Before
	@When("I click the url")
	public void i_click_the_url() {
		
		driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
	  
		
	}

	@Then("I click one login link")
	public void i_click_one_login_link() {
		
		WebElement e1 = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		//hover over the account page
		
		Actions action = new Actions(driver);
		
		action.moveToElement(e1).perform();
		
		
		driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]")).click();
		
		
		
	  
	}

	@Then("enter the credentail {string} in username")
	public void enter_the_credentail_in_username(String string) {
	    
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

	@Then("enter the credential {string} in password")
	public void enter_the_credential_in_password(String string) {
	   
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(string);
		

	}

	@Then("click on login button")
	public void click_on_login_button() {
	   
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

	}
	
	
	@Given("I am on another page")
	public void i_am_on_another_page() {
	     System.out.println(" i am one another page");	}

	@When("i click on search button")
	public void i_click_on_search_button() {
		System.out.println("click on the search button");
		
	}

	@Then("write mobile on search")
	public void write_mobile_on_search() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
	}
	
	    

	@Then("click on search button")
	public void click_on_search_button() {
	   
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
	}

	@Then("click on one mobile")
	public void click_on_one_mobile() throws InterruptedException {
	   
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
	}

	@Then("add to card")
	public void add_to_card() {
	  
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
         System.out.println("add to the cart mobile");
	}

@Then("close the window")
public void close_the_window() {
    driver.quit();
}


	
}
