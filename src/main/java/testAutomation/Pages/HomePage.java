package testAutomation.Pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testAutomation.StepDefinitions.Abstract_Step_Definition;

public class HomePage extends Abstract_Step_Definition {

	public void Entersearchtextbyxpath(WebDriver driver, String Data) throws IOException {

		driver.findElement(By.xpath(propertyload("HomePageSearchbox"))).sendKeys(Data);

	}

	public void selectfromthedropdown(WebDriver driver, String Data) throws IOException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> dropdown = driver.findElements(By.xpath(propertyload("HomePageDropdown")));

		System.err.println("Lenghth =" + dropdown.size());
		for (WebElement webElement : dropdown) {

			System.out.println("printing the webelement text " + webElement.getText());

			System.out.println("printing the data text " + propertyload(Data).toString());
			if (propertyload(Data).toString().contains(webElement.getText())) {

				webElement.click();
				break;
			}

		}

	}

	public void Clicksearchtextbyxpath(WebDriver driver) throws IOException {

		driver.findElement(By.xpath(propertyload("HomePageSearchbox"))).click();

	}

	public void acceptcookies(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.id(propertyload("HomePageCookie"))));

			driver.findElement(By.id(propertyload("HomePageCookie"))).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block

			try {
				driver.findElement(By.xpath(propertyload("HomePageExistingUser"))).click();

				WebElement element = wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(propertyload("HomePageNewUserclosebutton"))));

				driver.findElement(By.xpath(propertyload("HomePageNewUserclosebutton"))).click();
			} catch (Exception e1) {

				System.out.println("Ignoring the popup menu and starting ");
			}

		}

	}

}
