package com.jbk.bdd.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TableTest {
	@Given("^open users page \"(.*?)\"$")
	public void open_users_page(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("table testing111");
	}

	@When("^table is displayed$")
	public void table_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("table testing222");
	}
//HOOKS
	@Then("^verify users data$")
	public void verify_users_data(DataTable dataTable) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("table testin3333");
	}
}










