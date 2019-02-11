package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomatedTasksObject {

	WebDriver driver;

	public AutomatedTasksObject(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//table[@id='my_upcoming_events']//a[@title='Selenium Event'][contains(text(),'Selenium Event')]"))
	WebElement EventName;

	public WebElement eventName() {
		return EventName;
	}

	@FindBy(xpath = ("//a[@id='addBotTaskLink']"))
	WebElement SmartTaskButton;

	public WebElement smartTaskButton() {
		return SmartTaskButton;
	}

	@FindBy(xpath = "//select[@name='action']")
	WebElement Actions;

	public WebElement action() {
		return Actions;
	}

	@FindBy(xpath = "//select[@id='s_object']")
	WebElement SubActions;

	public WebElement subAction() {
		return SubActions;
	}

	@FindBy(xpath = "//button[@id='s_settings']")
	WebElement ConfigureButton;

	public WebElement configureButton() {
		return ConfigureButton;
	}

	@FindBy(xpath = "//input[@id='to-selectized']")
	WebElement Recipient;

	public WebElement recipient() {
		return Recipient;
	}

	@FindBy(xpath = "//div[@data-value='hamzaabbas@baarei.com']")
	WebElement SelectRecipient;

	public WebElement selectRecipient() {
		return SelectRecipient;
	}

	@FindBy(xpath = "//button[@id='template-selector']")
	WebElement SelectTemplate;

	public WebElement selectTemplateButton() {
		return SelectTemplate;
	}

	@FindBy(xpath = "//select[@id='uts']")
	WebElement Template;

	public WebElement template() {
		return Template;
	}

	@FindBy(xpath = "//button[@id='utsconfirm']")
	WebElement Confirm;

	public WebElement confirm() {
		return Confirm;
	}

	@FindBy(xpath = "//select[@id='post_selector']")
	WebElement SocialMediaTemplate;

	public WebElement socialMediaTemplate() {
		return SocialMediaTemplate;
	}

	@FindBy(xpath = "//select[@id='file_selector']")
	WebElement SendFile;

	public WebElement sendFile() {
		return SendFile;
	}

	@FindBy(xpath = "//span[@title='Add Item']")
	WebElement AddOrder;

	public WebElement addOrder() {
		return AddOrder;
	}

	@FindBy(xpath = "//input[@value='1']")
	WebElement Quantity;

	public WebElement Quantity() {
		return Quantity;
	}

	@FindBy(xpath = "//button[@id='bot_tasks_config_create']")
	WebElement AddTask;

	public WebElement addTask() {
		return AddTask;
	}

	@FindBy(xpath = "//button[@id='bot_tasks_create']")
	WebElement CreateTask;

	public WebElement CreateTask() {
		return CreateTask;
	}

}
