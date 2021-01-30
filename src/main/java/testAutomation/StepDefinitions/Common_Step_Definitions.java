package testAutomation.StepDefinitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testAutomation.Pages.HomePage;

public class Common_Step_Definitions extends Abstract_Step_Definition {

	WebDriver driver = getwebdriver();

	@Before
	public void set() {

		driver = getwebdriver(true);

	}

	@After
	public void fls() {

		driver.quit();
		driver = null;

	}

	@Given("^I am on the WestWing page$")
	public void i_am_on_the_WestWing_page(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		String url = propertyload(data.get(1).get(0));
		driver.navigate().to(url);
		takeSnapShot(driver, "target/Homepage");
	}

}
