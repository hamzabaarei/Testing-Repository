package Baarei;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;
import java.awt.RenderingHints.Key;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.CreateCampaignObject;
import Resources.Login;

public class CreateEventTest extends Login {

	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		driver = loginBaarei();
	}

	@Test
	public void createEvent() throws InterruptedException {

		CreateCampaignObject Element = new CreateCampaignObject(driver);

		// Open Create Event Form
		Element.createEventButton().click();

		// Add Template
		Element.template().sendKeys("Auto");
		Element.template().sendKeys(Keys.ENTER);
		Thread.sleep(1500);

		// Add Campaign Type
		Element.campaignType().sendKeys("Draft");
		Element.campaignType().sendKeys(Keys.ENTER);
		Thread.sleep(1500);

		// Add title
		Element.title().sendKeys("Selenium Event");
		Thread.sleep(1500);

		// Start Date Calendar

		Element.openStartCalendar().click();

		int count = driver.findElements(By.xpath("//td[contains(@class,'xdsoft_date')]/div")).size();

		for (int i = 0; i < count; i++)

		{
			String text;
			try {
				text = driver.findElements(By.xpath("//td[contains(@class,'xdsoft_date')]/div")).get(i).getText();
			} catch (org.openqa.selenium.StaleElementReferenceException ex) {
				text = driver.findElements(By.xpath("//td[contains(@class,'xdsoft_date')]/div")).get(i).getText();
			}

			if (text.equalsIgnoreCase("18")) {
				driver.findElements(By.xpath("//td[contains(@class,'xdsoft_date')]/div")).get(i).click();
				break;
			}

		}

		// End Date Calendar

		Element.openEndcalendar().click();

		for (int i = 0; i < count; i++)

		{
			String text = driver.findElements(By.xpath("//td[contains(@class,'xdsoft_date')]/div")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.xpath("//td[contains(@class,'xdsoft_date')]/div")).get(i).click();
				break;
			}

		}

		// Enter Location
		Element.location().sendKeys("Chicago");

		// Verify Timezone change
		Element.location().sendKeys(Keys.TAB);
		Thread.sleep(2000);

		AssertJUnit.assertEquals("America/Chicago", Element.timeZone().getAttribute("value"));

		// Add Roles
		Element.roles().sendKeys("APJ");
		Element.roles().sendKeys(Keys.ENTER);
		Thread.sleep(1500);

		// Add URL
		Element.Url().sendKeys("www.facebook.com");

		// Press create button
		Element.createButton().click();

		// Verify Test Cases Passed
		AssertJUnit.assertTrue(driver.findElement(By.cssSelector("#addTaskLink")).isDisplayed());

	}

}
