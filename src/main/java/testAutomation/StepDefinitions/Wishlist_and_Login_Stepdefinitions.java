package testAutomation.StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.memory.Memory.GetDOMCountersResponse;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testAutomation.Pages.MobelPage;
import testAutomation.Pages.WishListPage;

public class Wishlist_and_Login_Stepdefinitions extends WishListPage {

		WebDriver driver = getwebdriver();

	@Then("^I log in with First Name Last Name and Email$")
	public void i_log_in_with_First_Name_Last_Name_and_Email(DataTable logindata) throws Throwable {

		List<List<String>> data = logindata.raw();
		String email = propertyload(data.get(3).get(1));
		String password = propertyload(data.get(2).get(1));
		CheckNewCustomerPopUPOpened(driver);
		select_existing_user_in_wishlist_popup(driver);
		Enter_email_in_existing_user_wishlist_popup(driver, email);
		Enter_password_in_existing_user_wishlist_popup(driver, password);
		takeSnapShot(driver, "target/loginpage");

		Click_login_in_existing_user_wishlist_popup(driver);

	}

	@Then("^product should be visible on the wishlist$")
	public void product_should_be_visible_on_the_wishlist() throws Throwable {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String product = propertyload("Product_name");
		System.out.println("Product name " + product);

		go_to_wishlist_from_mobel_page(driver);
		takeSnapShot(driver, "target/wishlistpage");
		Verify_Product_added_in_the_wishlist(driver, product, true);

	}

	@When("^I go to the worklist$")
	public void i_go_to_the_worklist() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		go_to_wishlist_from_mobel_page(driver);
	}

	@Then("^I should be able to delete product from wishlist$")
	public void i_should_be_able_to_delete_product_from_wishlist() throws Throwable {
		String product = propertyload("Product_name");
		System.out.println("Product name " + product);

		remove_product_item_from_wishlist(driver, product);

	}

}
