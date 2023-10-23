package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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

	
}
