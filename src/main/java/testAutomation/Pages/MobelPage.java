package testAutomation.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import testAutomation.StepDefinitions.Abstract_Step_Definition;

public class MobelPage extends HomePage {

	public int numberofproductslisted(WebDriver driver) throws InterruptedException, IOException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String products = driver.findElement(By.xpath(propertyload("MobelPageNumberofProducts"))).getText();

		System.err.println("Avaialbe items before split " + products);
		System.err.println("Avaialbe items split " + products.split(" ")[0]);
		int listed_items = Integer.parseInt((products.split(" ")[0]));

		System.err.println("Avaialbe items " + listed_items);

		return listed_items;

	}

	public void numberofpages(WebDriver driver) throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String label = driver.findElement(By.xpath(propertyload("MobelPageNumberofPages"))).getText();

		System.err.println("Labels---" + label);
	}

	public void SelectItemsByProductNumber(WebDriver driver, int itemid) throws IOException {

		String xpath = propertyload("MobelPageProductSelection") + "[" + String.valueOf(itemid) + "]";

		driver.findElement(By.xpath(xpath)).click();

	}

	public String GetItemNameByProductNumber(WebDriver driver, int itemid) throws IOException {

		String xpath = propertyload("MobelPageProductName") + "[" + String.valueOf(itemid) + "]";

		String productname = driver.findElement(By.xpath(xpath)).getAttribute("innerText");
		;
		System.err.println("Xpath --> " + xpath);
		System.out.println("Product_name ====> " + productname);

		propertySet("Product_name", productname);

		return productname;
	}

	public void addtowishlistByProductNumber(WebDriver driver, int itemid) throws IOException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath(propertyload("MobelPageWishlistIcon") + "[" + String.valueOf(itemid) + "]")));
		} catch (Exception e) {

			acceptcookies(driver);
		}

		String xpath = propertyload("MobelPageWishlistIcon") + "[" + String.valueOf(itemid) + "]";

		driver.findElement(By.xpath(xpath)).click();

	}

	@SuppressWarnings("deprecation")
	public void CheckNewCustomerPopUPOpened(WebDriver driver) throws IOException {

		Assert.assertEquals("Neukunde?",
				driver.findElement(By.xpath(propertyload("MobelPageRegistrationOverLay"))).getText());

	}

	public void select_existing_user_in_wishlist_popup(WebDriver driver) throws IOException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath(propertyload("MobelPageExistingUserSelection"))));

		try {
			driver.findElement(By.xpath(propertyload("MobelPageExistingUserSelection"))).click();
		} catch (Exception e) {
			driver.findElement(By.xpath(propertyload("HomePageExistingUser"))).click();

			WebElement element2 = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(propertyload("HomePageNewUserclosebutton"))));

		}

	}

	public void Enter_email_in_existing_user_wishlist_popup(WebDriver driver, String email) throws IOException {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(propertyload("MobelPageLoginEmail"))));

		driver.findElement(By.xpath(propertyload("MobelPageLoginEmail"))).sendKeys(email);

	}

	public void Enter_password_in_existing_user_wishlist_popup(WebDriver driver, String password) throws IOException {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(propertyload("MobelPageLoginEmail"))));

		driver.findElement(By.xpath(propertyload("MobelPageLoginPassword"))).sendKeys(password);

	}

	public void Click_login_in_existing_user_wishlist_popup(WebDriver driver) throws IOException, InterruptedException {

		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			driver.findElement(By.xpath(propertyload("MobelPageLoginSubmit"))).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			driver.findElement(By.xpath(propertyload("HomePageExistingUser"))).click();

		}

	}

	public void go_to_wishlist_from_mobel_page(WebDriver driver) throws IOException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(propertyload("MobelPageToWishList"))));

		driver.findElement(By.xpath(propertyload("MobelPageToWishList"))).click();

	}

}