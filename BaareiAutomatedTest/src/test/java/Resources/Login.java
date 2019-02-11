package Resources;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.LoginObject;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

	// initialize Driver
	public static WebDriver driver;

	// Initialize Property Variable
	static Properties prop;

	public static WebDriver loginBaarei() throws IOException, InterruptedException {

		// Get Global Variables
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"/home/hamza/Desktop/Selenium/Projects/Baarei/LoginCredentials.properties");
		prop.load(fis);

		// Invoke Browser and hit URL
		System.setProperty("webdriver.chrome.driver", prop.getProperty("PropertyPath"));
		driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));

		// Make object for object repository class
		LoginObject obj = new LoginObject(driver);

		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click on SignIn button
		WebElement ele = obj.signInButton();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);

		// Click on SignIn with Google
		ele = obj.signInWithGoogle();
		executor.executeScript("arguments[0].click();", ele);

		// Enter Email
		obj.Email().sendKeys(prop.getProperty("email"));

		// Click Next
		obj.NextButton().click();

		// Enter Password
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
			obj.Password().sendKeys(prop.getProperty("password"));
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
			obj.Password().sendKeys(prop.getProperty("password"));
		}

		// Click
		obj.Next().click();

		// wait until page loaded
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.titleContains("Baarei"));

		// verify Test Case
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.baarei.com/projects/#");

		return driver;

	}

/*	@AfterTest
	public void close() {
		driver.close();
	}
*/
	public void getScreenshot(String filename) throws IOException {

		String openDevTools = Keys.chord(Keys.ALT, Keys.CONTROL, "i");
		driver.findElement(By.tagName("body")).sendKeys(openDevTools);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,
				new File("/home/hamza/Desktop/Selenium/Projects/ScreenShots/" + filename + "screenshot.png"));

	}

}
