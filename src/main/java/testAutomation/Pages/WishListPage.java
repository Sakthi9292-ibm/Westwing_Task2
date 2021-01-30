package testAutomation.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import testAutomation.StepDefinitions.Abstract_Step_Definition;

public class WishListPage extends MobelPage {

	public void Verify_Product_added_in_the_wishlist(WebDriver driver, String product_name, Boolean Presentornot)
			throws IOException {

		List<WebElement> products = driver.findElements(By.xpath(propertyload("WishListPageProductName")));

		Boolean flag = false;

		for (WebElement webElement : products) {

			if (product_name.equals(webElement.getText())) {
				flag = true;

			}

		}
		Assert.assertEquals(Presentornot, flag);
	}

	public void remove_product_item_from_wishlist(WebDriver driver, String product_name) throws IOException {

		List<WebElement> products = driver.findElements(By.xpath(propertyload("WishListPageProductName")));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		for (int i = 0; i < products.size(); i++) {

			String webel = products.get(i).getText();

			if (webel.equals(product_name)) {

				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath((propertyload("WishListPageDeleteButton") + "[" + String.valueOf(i + 1) + "]"))));

				String xpath = propertyload("WishListPageDeleteButton") + "[" + String.valueOf(i + 1) + "]";

				driver.findElement(By.xpath(xpath)).click();

			}

		}

	}
}