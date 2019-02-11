package Baarei;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.AutomatedTasksObject;
import ObjectRepository.TaskObject;
import Resources.Login;

public class SmartTaskTest extends Login {

	// Global
	AutomatedTasksObject Element;

	WebDriverWait wait;

	Select action;

	Select subAction;

	String expected;
	String expected2;
	String expected3;
	String expected4;
	String expected5;
	String expected6;
	String expected7;
	String expected8;
	String expected9;
	String expected10;
	String expected11;
	String expected12;
	String expected13;
	String expected14;

	String Date;

	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		driver = loginBaarei();

		Element = new AutomatedTasksObject(driver);

		// maximize window
		driver.manage().window().maximize();

		// Select My campaign from drop down
		Select s = new Select(driver.findElement(By.id("events")));
		s.selectByValue("my_upcoming_events");

		// Open Event
		Element.eventName().click();

		// Open Smart Task form
		Element.smartTaskButton().click();

		action = new Select(Element.action());
		subAction = new Select(Element.subAction());

		wait = new WebDriverWait(driver, 10);

	}

	@Test
	public void emailTemplateSmartTask() throws InterruptedException {

		// Create Email Template Smart task
		action.selectByValue("Email");

		subAction.selectByValue("Template");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);
		Element.recipient().click();
		Element.selectRecipient().click();

		Element.selectTemplateButton().click();

		Select template = new Select(Element.template());
		template.selectByVisibleText("Sample Email Template");

		Element.confirm().click();

		TimeUnit.SECONDS.sleep(2);
		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='1']//input[@name='task_title']")));

		expected = "Email Template: \"Sample Email Template\" to  hamzaabbas@baarei.com";
		Assert.assertEquals(expected,
				driver.findElement(By.xpath("//div[@id='1']//input[@name='task_title']")).getAttribute("value"));

	}

	@Test(dependsOnMethods = { "emailTemplate" }, alwaysRun = true)
	public void requestInformationSmartTask() throws InterruptedException {
		// Create Request Smart Tasks
		TimeUnit.SECONDS.sleep(2);
		subAction.selectByValue("information on sponsorship costs");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);
		Element.recipient().click();
		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='2']//input[@name='task_title']")));

		expected2 = "Request information on sponsorship costs from hamzaabbas@baarei.com ";
		Assert.assertEquals(expected2,
				driver.findElement(By.xpath("//div[@id='2']//input[@name='task_title']")).getAttribute("value"));

	}

	@Test(dependsOnMethods = { "requestInformationSmartTask" }, alwaysRun = true)
	public void requestSponsorshipSmartTAsk() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		subAction.selectByValue("sponsorship contract");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);
		Element.recipient().click();
		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='3']//input[@name='task_title']")));

		expected3 = "Request sponsorship contract from hamzaabbas@baarei.com ";
		Assert.assertEquals(expected3,
				driver.findElement(By.xpath("//div[@id='3']//input[@name='task_title']")).getAttribute("value"));

	}

	@Test(dependsOnMethods = { "requestSponsorshipSmartTAsk" }, alwaysRun = true)
	public void requestContractSmartTask() throws InterruptedException {

		TimeUnit.SECONDS.sleep(2);
		subAction.selectByValue("countersigned contract from event");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);
		Element.recipient().click();
		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='4']//input[@name='task_title']")));

		expected4 = "Request countersigned contract from event from hamzaabbas@baarei.com ";
		Assert.assertEquals(expected4,
				driver.findElement(By.xpath("//div[@id='4']//input[@name='task_title']")).getAttribute("value"));

	}

	@Test(dependsOnMethods = { "requestContractSmartTask" }, alwaysRun = true)
	public void leadsSmartTask() throws InterruptedException {
		// Create Items Smart Task
		TimeUnit.SECONDS.sleep(2);
		subAction.selectByValue("Leads");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);
		Element.recipient().click();
		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='5']//input[@name='task_title']")));

		expected5 = "Email Leads to hamzaabbas@baarei.com ";
		Assert.assertEquals(expected5,
				driver.findElement(By.xpath("//div[@id='5']//input[@name='task_title']")).getAttribute("value"));

	}

	@Test(dependsOnMethods = { "leadsSmartTask" }, alwaysRun = true)
	public void expensesSmartTask() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		subAction.selectByValue("Expenses");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);
		Element.recipient().click();
		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='6']//input[@name='task_title']")));

		expected6 = "Email Expenses to hamzaabbas@baarei.com ";
		Assert.assertEquals(expected6,
				driver.findElement(By.xpath("//div[@id='6']//input[@name='task_title']")).getAttribute("value"));

	}

	@Test(dependsOnMethods = { "expensesSmartTask" }, alwaysRun = true)
	public void shipmentSmartTask() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		subAction.selectByValue("Shipment");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);
		Element.recipient().click();
		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='7']//input[@name='task_title']")));

		expected7 = "Email Shipment to hamzaabbas@baarei.com ";
		Assert.assertEquals(expected7,
				driver.findElement(By.xpath("//div[@id='7']//input[@name='task_title']")).getAttribute("value"));
	}

	@Test(dependsOnMethods = { "shipmentSmartTask" }, alwaysRun = true)
	public void reminderEventSmartTask() throws InterruptedException {
		// Create Reminder Smart Task
		TimeUnit.SECONDS.sleep(2);
		subAction.selectByValue("pre-event email");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);
		Element.recipient().click();
		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='8']//input[@name='task_title']")));

		expected8 = "Remind hamzaabbas@baarei.com  to schedule pre-event meeting";
		Assert.assertEquals(expected8,
				driver.findElement(By.xpath("//div[@id='8']//input[@name='task_title']")).getAttribute("value"));

	}

	@Test(dependsOnMethods = { "reminderEventSmartTask" }, alwaysRun = true)
	public void reminderHotelsSmartTask() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		subAction.selectByValue("book hotels");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);
		Element.recipient().click();
		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='9']//input[@name='task_title']")));

		expected9 = "Remind hamzaabbas@baarei.com  to book hotels";
		Assert.assertEquals(expected9,
				driver.findElement(By.xpath("//div[@id='9']//input[@name='task_title']")).getAttribute("value"));

	}

	@Test(dependsOnMethods = { "reminderHotelsSmartTask" }, alwaysRun = true)
	public void reminderPresentationSmartTask() throws InterruptedException {

		TimeUnit.SECONDS.sleep(2);
		subAction.selectByValue("submit final presentations");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);
		Element.recipient().click();
		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='10']//input[@name='task_title']")));

		expected10 = "Remind hamzaabbas@baarei.com  to submit final presentations";
		Assert.assertEquals(expected10,
				driver.findElement(By.xpath("//div[@id='10']//input[@name='task_title']")).getAttribute("value"));
	}

	@Test(dependsOnMethods = { "reminderPresentationSmartTask" }, alwaysRun = true)
	public void reminderCollateralSmartTask() throws InterruptedException {

		TimeUnit.SECONDS.sleep(2);
		subAction.selectByValue("ship collaterals");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);
		Element.recipient().click();
		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='11']//input[@name='task_title']")));

		expected11 = "Remind hamzaabbas@baarei.com  to ship collaterals";
		Assert.assertEquals(expected11,
				driver.findElement(By.xpath("//div[@id='11']//input[@name='task_title']")).getAttribute("value"));

	}

	@Test(dependsOnMethods = { "reminderCollateralSmartTask" }, alwaysRun = true)
	public void postSmartTask() throws InterruptedException {
		// Create Post to linkedIn SmartTask
		TimeUnit.SECONDS.sleep(2);
		action.selectByValue("Post to");

		Element.configureButton().click();

		Select socialmedia = new Select(Element.socialMediaTemplate());
		socialmedia.selectByVisibleText("IEEE inductive drive");

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='12']//input[@name='task_title']")));

		expected12 = "Post  'IEEE inductive drive' to LinkedIn";
		Assert.assertEquals(expected12,
				driver.findElement(By.xpath("//div[@id='12']//input[@name='task_title']")).getAttribute("value"));
	}

	@Test(dependsOnMethods = { "postSmartTask" }, alwaysRun = true)
	public void sendFileSmartTask() throws InterruptedException {

		// Create Send File Smart Task
		TimeUnit.SECONDS.sleep(2);
		action.selectByValue("Send File");

		Element.configureButton().click();
		TimeUnit.SECONDS.sleep(2);

		Select file = new Select(Element.sendFile());
		file.selectByValue("Baarei Logo 1024 pink5050.png");

		Element.recipient().click();
		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='13']//input[@name='task_title']")));

		expected13 = "Send File \"Baarei Logo 1024 pink5050.png\" to hamzaabbas@baarei.com ";
		Assert.assertEquals(expected13,
				driver.findElement(By.xpath("//div[@id='13']//input[@name='task_title']")).getAttribute("value"));
	}

	@Test(dependsOnMethods = { "sendFileSmartTask" }, alwaysRun = true)
	public void orderSmartTask() throws InterruptedException {

		// Create Order Smart Task
		TimeUnit.SECONDS.sleep(2);
		action.selectByValue("Order");

		Element.configureButton().click();

		TimeUnit.SECONDS.sleep(2);

		Element.addOrder().click();

		Element.Quantity().sendKeys("15");

		Element.recipient().click();

		Element.selectRecipient().click();

		Element.addTask().click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='14']//input[@name='task_title']")));

		expected14 = "Order items from hamzaabbas@baarei.com ";
		Assert.assertEquals(expected14,
				driver.findElement(By.xpath("//div[@id='14']//input[@name='task_title']")).getAttribute("value"));

		// save date
		Date = driver.findElement(By.xpath("//div[@id='1']//input[@name='task_date']")).getAttribute("value");
	}

	@Test(dependsOnMethods = { "orderSmartTask" }, alwaysRun = true)
	public void createTask() throws InterruptedException {
		// Create All Smart Tasks
		TimeUnit.SECONDS.sleep(2);
	
		Element.CreateTask().click();

		TimeUnit.MINUTES.sleep(5);

		driver.navigate().refresh();
		
		TimeUnit.SECONDS.sleep(2);

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyDateForTimezonCheckInSmartTask() throws InterruptedException {

		String Date2 = driver.findElement(By.xpath("//tr[1]//div[@id='datetimepicker']//input")).getAttribute("value");

		Assert.assertEquals(Date, Date2);
	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyOrderSmartTask() throws InterruptedException {
		Assert.assertEquals(expected14,
				driver.findElement(By.xpath("//tr[1]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[1]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifySendFileSmartTask() throws InterruptedException {

		Assert.assertEquals(expected13,
				driver.findElement(By.xpath("//tr[2]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[2]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyPostSmartTask() throws InterruptedException {

		Assert.assertEquals(expected12,
				driver.findElement(By.xpath("//tr[3]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[3]//td[1]//i[1]"))
						.getAttribute("Style"));
	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyRemindCollateralSmartTask() throws InterruptedException {

		Assert.assertEquals(expected11,
				driver.findElement(By.xpath("//tr[4]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[4]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyRemindPresentationSmartTask() throws InterruptedException {

		Assert.assertEquals(expected10,
				driver.findElement(By.xpath("//tr[5]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[5]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyRemindHotelSmartTask() throws InterruptedException {

		Assert.assertEquals(expected9,
				driver.findElement(By.xpath("//tr[6]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[6]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyRemindMeetingSmartTask() throws InterruptedException {

		Assert.assertEquals(expected8,
				driver.findElement(By.xpath("//tr[7]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[7]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyEmailShipmentSmartTask() throws InterruptedException {

		Assert.assertEquals(expected7,
				driver.findElement(By.xpath("//tr[8]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[8]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyEmailExpensesSmartTask() throws InterruptedException {

		Assert.assertEquals(expected6,
				driver.findElement(By.xpath("//tr[9]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[9]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyEmailLeadsSmartTask() throws InterruptedException {

		Assert.assertEquals(expected5,
				driver.findElement(By.xpath("//tr[10]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[10]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyRequestCounterSignedSmartTask() throws InterruptedException {

		Assert.assertEquals(expected4,
				driver.findElement(By.xpath("//tr[11]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[11]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyRequestSponsorshipContractSmartTask() throws InterruptedException {

		Assert.assertEquals(expected3,
				driver.findElement(By.xpath("//tr[12]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[12]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyRequestInfoSmartTask() throws InterruptedException {

		Assert.assertEquals(expected2,
				driver.findElement(By.xpath("//tr[13]//td[@id='task-title']//span")).getAttribute("title"));
		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[13]//td[1]//i[1]"))
						.getAttribute("Style"));

	}

	@Test(dependsOnMethods = { "createTask" })
	public void verifyEmailTemplateSmartTask() throws InterruptedException {

		Assert.assertEquals(expected,
				driver.findElement(By.xpath("//tr[14]//td[@id='task-title']//span")).getAttribute("title"));

		Assert.assertEquals("color: green;",
				driver.findElement(By.xpath("//div[@class='bhoechie-tab-content active']//tbody//tr[14]//td[1]//i[1]"))
						.getAttribute("Style"));

	}
	
}
