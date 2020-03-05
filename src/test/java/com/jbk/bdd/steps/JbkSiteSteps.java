package com.jbk.bdd.steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JbkSiteSteps {
	WebDriver driver;

	@Given("^open a browser$")
	public void open_a_browser() throws Throwable {
	//	driver = new FirefoxDriver();
	}

	@When("^I open a jbksite$")
	public void i_open_a_jbksite() throws Throwable {
	//	driver.get("https://www.javabykiran.com/");
	}
	
	/*@When("^I open a jbksite \"(.*?)\"$")
	public void i_open_a_jbksite(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/

	@Then("^career menu should appears$")
	public void career_menu_should_appears() throws Throwable {
	//	String actLabel = driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[4]/a")).getText();
		assertEquals("dfdffd", "Selenium Testing8");
	}

}











