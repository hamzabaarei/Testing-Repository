package Baarei;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.TaskObject;
import Resources.Login;

public class TaskTest extends Login {

	TaskObject Element;

	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		driver = loginBaarei();

		Element = new TaskObject(driver);

		driver.manage().window().maximize();

		// Select My campaign from drop down
		Select s = new Select(driver.findElement(By.id("events")));
		s.selectByValue("my_upcoming_events");

		// Open Event
		Element.eventName().click();

	}

	@Test
	public void createTask() throws InterruptedException {

		// Add Task
		TimeUnit.SECONDS.sleep(2);
		Element.addTask().click();

		// Enter Task Title
		TimeUnit.SECONDS.sleep(2);
		Element.taskTitle().click();
		Element.taskTitle().sendKeys("Task Created by Selenium");
		TimeUnit.SECONDS.sleep(2);
		Element.taskTitle().sendKeys(Keys.ENTER);

		// Verify if task is created or not
		driver.navigate().refresh();
		String Title = Element.taskTitle().getAttribute("value");
		Assert.assertEquals("Task Created by Selenium", Title);

	}

	@Test(dependsOnMethods = { "createTask" })
	public void assignTask() throws InterruptedException {
		// Assign Task
		Select s1 = new Select(Element.assignTask());
		s1.selectByVisibleText("Raza Nawaz <razanawaz@baarei.com>");

		// Verification
		driver.navigate().refresh();
		String name = s1.getFirstSelectedOption().getText();

		Assert.assertEquals(name, "Raza Nawaz ");

	}

	@Test(dependsOnMethods = { "assignTask" }, alwaysRun = true)
	public void commentTask() throws InterruptedException {

		// Open Comment Modal
		Element.commentTask().click();

		// Add Comment
		Element.commentInput().sendKeys("Comment by Selenium Script");
		Element.commentInput().sendKeys(Keys.ENTER);

		// Close Modal
		Element.closeModal().click();

		// Verify Comment
		TimeUnit.SECONDS.sleep(2);
		Element.commentTask().click();
		String Text = Element.checkInput().getAttribute("value");

		Assert.assertEquals(" Comment by Selenium Script ", Text);

	}

	@Test(dependsOnMethods = { "commentTask" })
	public void deleteComment() throws InterruptedException {

		// Store size for verfication
		TimeUnit.SECONDS.sleep(2);
		int size = driver.findElements(By.tagName("textarea")).size();

		// Delete Comment
		Actions a = new Actions(driver);
		a.moveToElement(Element.checkInput()).build().perform();
		Element.deleteComment().click();

		// Close Modal
		Element.closeModal().click();

		// Verify Delete
		TimeUnit.SECONDS.sleep(2);
		Element.commentTask().click();
		TimeUnit.SECONDS.sleep(2);
		int size1 = driver.findElements(By.tagName("textarea")).size();
		Assert.assertEquals(size - 1, size1);

		// Close Modal
		Element.closeModal().click();

	}

	@Test(dependsOnMethods = { "deleteComment" }, alwaysRun = true)
	public void dueDate() throws InterruptedException {

		TimeUnit.SECONDS.sleep(2);

		// Assign DueDate
		Element.openCalendar().click();

		int count = driver.findElements(By.xpath("//td[contains(@class,'xdsoft_date')]/div")).size();

		for (int i = 0; i < count; i++)

		{
			String text;
			try {
				text = driver.findElements(By.xpath("//td[contains(@class,'xdsoft_date')]/div")).get(i).getText();
			} catch (org.openqa.selenium.StaleElementReferenceException ex) {
				text = driver.findElements(By.xpath("//td[contains(@class,'xdsoft_date')]/div")).get(i).getText();
			}

			if (text.equalsIgnoreCase("22")) {
				driver.findElements(By.xpath("//td[contains(@class,'xdsoft_date')]/div")).get(i).click();
				break;
			}

		}

		// Verification
		driver.navigate().refresh();
		Assert.assertTrue(Element.openCalendar().getAttribute("Value").contains("22"));

	}

	@Test(dependsOnMethods = { "dueDate" }, alwaysRun = true)
	public void reorderTasks() throws InterruptedException {

		// Saving text for verification
		String text = Element.source().getAttribute("value");

		// Reorder
		Actions a = new Actions(driver);
		a.clickAndHold(Element.source()).moveToElement(Element.destination()).release().build().perform();

		// Verification
		String text1 = Element.destination().getAttribute("value");
		Assert.assertEquals(text, text1);

	}

	@Test(dependsOnMethods = { "reorderTasks" }, alwaysRun = true)
	public void searchByTitle() throws InterruptedException {
		Element.searchTask().sendKeys("Add base");
		String Title = Element.taskTitle().getAttribute("value");
		TimeUnit.SECONDS.sleep(1);
		Assert.assertEquals("Add base class and invoke browser and login in it", Title);

	}

	@Test(dependsOnMethods = { "searchByTitle" }, alwaysRun = true)
	public void searchByOwner() throws InterruptedException {
		Element.searchTask().clear();
		Element.searchTask().sendKeys("Raza");
		String Title = Element.taskTitle().getAttribute("value");
		TimeUnit.SECONDS.sleep(1);
		Assert.assertEquals("Task Created by Selenium", Title);

		Element.searchTask().clear();

	}

	@Test(dependsOnMethods = { "searchByOwner" }, alwaysRun = true)
	public void deleteTask() throws InterruptedException {

		// Size of rows on page
		int size = driver.findElements(By.xpath("//table[@id='tasktable']//tbody//tr")).size();

		// Delete Task
		Element.deleteTask().click();

		// Verify Delete
		TimeUnit.SECONDS.sleep(2);
		int size1 = driver.findElements(By.xpath("//table[@id='tasktable']//tbody//tr")).size();
		Assert.assertEquals(size1, size - 1);

	}

	@Test(dependsOnMethods = { "deleteTask" }, alwaysRun = true)
	public void addSection() throws InterruptedException {

		// Add Section
		TimeUnit.SECONDS.sleep(2);
		Element.addSection().click();

		// Enter Section Title
		TimeUnit.SECONDS.sleep(2);
		Element.sectionTitle().click();
		Element.sectionTitle().sendKeys("Section Created by Selenium");
		TimeUnit.SECONDS.sleep(2);
		Element.sectionTitle().sendKeys(Keys.ENTER);

		// Verify if Section is created or not
		driver.navigate().refresh();
		String Title = Element.sectionTitle().getAttribute("value");
		Assert.assertEquals("Section Created by Selenium", Title);
	}

	@Test(dependsOnMethods = { "addSection" })
	public void deleteSection() throws InterruptedException {

		// Size of rows on page
		int size = driver.findElements(By.xpath("//table[@id='tasktable']//tbody//tr")).size();

		// Delete Task
		Element.deleteSection().click();

		// Verify Delete
		TimeUnit.SECONDS.sleep(2);
		int size1 = driver.findElements(By.xpath("//table[@id='tasktable']//tbody//tr")).size();
		Assert.assertEquals(size - 1, size1);

	}

}
