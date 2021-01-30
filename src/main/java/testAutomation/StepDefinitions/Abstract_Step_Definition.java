package testAutomation.StepDefinitions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abstract_Step_Definition extends Utils {

	protected static WebDriver webdriver;
	Properties p = new Properties();

	String filelocation = "src/main/resources/Test.properties";
	String PROPERTIES_FILE_PATH = "src/main/resources/Runtimetest.properties";

	public String propertyload(String parameter) throws IOException {
		FileReader reader = new FileReader(PROPERTIES_FILE_PATH);
		Properties p = new Properties();
		p.load(reader);
		String pramvalue = p.getProperty(parameter);
		return pramvalue;
	}

	public void propertySet(String parameter, String value) throws IOException {

		FileInputStream in = new FileInputStream(PROPERTIES_FILE_PATH);
		Properties props = new Properties();
		props.load(in);
		in.close();

		FileOutputStream out = new FileOutputStream(PROPERTIES_FILE_PATH);
		props.setProperty(parameter, value);
		props.store(out, null);
		out.close();

	}

	protected WebDriver getwebdriver() {
		try {
			System.setProperty("webdriver.chrome.driver", this.propertyload("chromerdriverlocation"));

		} catch (IOException e) {

			e.printStackTrace();
		}
		if (webdriver == null) {
			webdriver = new ChromeDriver();
		}
		return webdriver;
	}

	protected WebDriver getwebdriver(boolean data) {
		try {
			System.setProperty("webdriver.chrome.driver", this.propertyload("chromerdriverlocation"));
			webdriver = new ChromeDriver();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return webdriver;
	}

}
