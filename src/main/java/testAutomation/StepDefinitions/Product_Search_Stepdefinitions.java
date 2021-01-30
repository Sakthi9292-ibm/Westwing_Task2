package testAutomation.StepDefinitions;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.memory.Memory.GetDOMCountersResponse;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testAutomation.Pages.HomePage;
import testAutomation.Pages.MobelPage;
import testAutomation.Pages.WishListPage;

public class Product_Search_Stepdefinitions extends WishListPage {

	// HomePage homepage = new HomePage();
	// Mobelpage mobelpage=new Mobelpage();
	WebDriver driver = getwebdriver();

	@When("^I search for \"(.*?)\" in home page$")
	public void i_search_for_in_home_page(String productname) throws Throwable {

		acceptcookies(driver);

		Clicksearchtextbyxpath(driver);

		Entersearchtextbyxpath(driver, productname);

		selectfromthedropdown(driver, productname);

		Utils.takeSnapShot(driver, "target/searchbyproductname_" + productname);

	}

	@Then("^I should see product listing page showing (\\d+)$")
	public void i_should_see_product_listing_page_showing(int items) throws Throwable {

		junit.framework.Assert.assertEquals(items, numberofproductslisted(driver));

	}

	@When("^I click on the wishlist icon of the (\\d+)st/nd/rd found product$")
	public void i_click_on_the_wishlist_icon_of_the_st_nd_rd_found_product(int product) throws Throwable {

		addtowishlistByProductNumber(driver, product);

		String product_name = GetItemNameByProductNumber(driver, product);

		propertySet("Product_name", product_name);

		Utils.takeSnapShot(driver, "target/addingtowishlist");
	}

	@Then("^I should see the login form of overlay$")
	public void i_should_see_the_login_form_of_overlay() throws Throwable {

		CheckNewCustomerPopUPOpened(driver);

		Utils.takeSnapShot(driver, "target/loginoverlay");
	}

}