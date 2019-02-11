package Baarei;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.Point;

import ObjectRepository.ParticipantObject;
import Resources.Login;
import org.openqa.selenium.Keys;

public class ParticipantTest extends Login {

	ParticipantObject Element;

	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		driver = loginBaarei();

		Element = new ParticipantObject(driver);

		driver.manage().window().maximize();

		// Select My campaign from drop down
		Select s = new Select(driver.findElement(By.id("events")));
		s.selectByValue("my_upcoming_events");

		// Open Event
		Element.eventName().click();

		// Open Participant Tab
		Element.openParticipantTab().click();

	}
/*
	@Test
	public void addSingleParticipant() {

		// Click on Add
		Element.addSingleParticipant().click();

		// Enter Name
		Select name = new Select(Element.nameOfParticipant());
		name.selectByVisibleText("Hamza Abbas   (hamzaabbas@baarei.com)");

		// Enter role
		Element.cancelRoleDropDown().click();
		Element.openRoleDropDown().click();
		Element.selectRole().click();

		// Notify
		Element.inviteParticipant().click();

		// Save Participant
		Element.saveSlot().click();

		// Verification

		Assert.assertEquals(
				driver.findElement(By.xpath("//table[@id='participantstable']//tbody//tr[3]//td[2]")).getText(),
				"Hamza Abbas");

		Assert.assertEquals(driver
				.findElement(By.xpath("//table[@id='participantstable']//tbody//tr[3]//td[4]//div/div/div/input[1]"))
				.getAttribute("value"), "Vendor");

	}

	@Test(dependsOnMethods = { "addSingleParticipant" }, alwaysRun = true)
	public void deleteParticipant() throws InterruptedException {

		int size = driver.findElements(By.xpath("//table[@id='participantstable']//tbody//tr")).size();

		Element.deleteParticiapnt().click();

		driver.navigate().refresh();

		TimeUnit.SECONDS.sleep(2);

		int size1 = driver.findElements(By.xpath("//table[@id='participantstable']//tbody//tr")).size();

		Assert.assertEquals(size1, size - 2);
	}

	@Test(dependsOnMethods = { "deleteParticipant" }, alwaysRun = true)
	public void cancelSlotParticipant() throws InterruptedException {

		int size = driver.findElements(By.xpath("//table[@id='participantstable']//tbody//tr")).size();

		// Click on Add
		Element.addSingleParticipant().click();

		// Click on Cancel
		Element.cancelSlot().click();

		// verify
		int size1 = driver.findElements(By.xpath("//table[@id='participantstable']//tbody//tr")).size();

		TimeUnit.SECONDS.sleep(2);

		Assert.assertEquals(size1, size);
	}

	@Test(dependsOnMethods = { "cancelSlotParticipant" }, alwaysRun = true)
	public void addMultipleParticipant() throws InterruptedException {

		// Click add Multiple Participant Button
		Element.multipleParticipantButton().click();

		// Scroll Down TimeUnit.SECONDS.sleep(2);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Element.goOnSecondPage());
		// Go on second page of Participant
		Element.goOnSecondPage().click();
		TimeUnit.SECONDS.sleep(2);

		// Select Participant
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				Element.checkBoxOnSecondPage());
		Element.checkBoxOnSecondPage().click();

		// Search for Participant Element.searchMultipleParticipant().clear();
		Element.searchMultipleParticipant().sendKeys("hamzaabbas@baarei.com");
		TimeUnit.SECONDS.sleep(2);

		// Select Participant
		Element.selectMultipleParticpant().click();

		// Press add button
		Element.addMultipleParticpant().click();

		// Verify
		Assert.assertEquals(
				driver.findElement(By.xpath("//table[@id='participantstable']//tbody//tr[3]//td[2]")).getText(),
				"Hamza Abbas");

		Assert.assertEquals(
				driver.findElement(By.xpath("//table[@id='participantstable']//tbody//tr[5]//td[2]")).getText(),
				"Raza Nawaz");

	}

	@Test(dependsOnMethods= {"addMultipleParticipant"}, alwaysRun=true)
	public void addReservations() throws InterruptedException {

		// Click Hotel Reservation Button
		Element.hotelReservationButton().click();

		// Add Reservation
		Element.addReservationButton().click();

		// Give Reservation Number
		Element.reservationNum().sendKeys("123456");

		TimeUnit.SECONDS.sleep(1);

		// Hotel Name
		Element.hotelName().sendKeys("PC");

		Element.reservationNum().click();
		// Verify
		driver.navigate().refresh();
		Element.hotelReservationButton().click();

		Assert.assertEquals(Element.reservationNum().getAttribute("value"), "123456");
		Assert.assertEquals(Element.hotelName().getAttribute("value"), "PC");
		
		Element.closeModal().click();

	}
	
	@Test(dependsOnMethods="addReservations", alwaysRun=true)
	public void associateReservation() throws InterruptedException{
		
		//Click on drop down button
		Element.firstRowDropDown().click();
		
		//Click on Associate reservation button
		Element.associateReservationButton().click();
		
		//Confirm Association
		Element.confirmAssociation().click();
		TimeUnit.SECONDS.sleep(2);
		
		//Verify
		Assert.assertEquals(Element.formReservation1().getAttribute("value"), "123456");
		Assert.assertEquals(Element.formHotelName1().getAttribute("value"), "PC");
	}
*/
}
