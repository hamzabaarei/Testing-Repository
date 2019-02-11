package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskObject {

	WebDriver driver;

	public TaskObject(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//table[@id='my_upcoming_events']//a[@title='Selenium Event'][contains(text(),'Selenium Event')]"))
	WebElement EventName;

	public WebElement eventName() {
		return EventName;
	}

	@FindBy(xpath = ("//div[@class='bhoechie-tab-content active']//div[@class='panel-heading']//a[1]"))
	WebElement AddTask;

	public WebElement addTask() {
		return AddTask;
	}

	@FindBy(xpath = "//table[@id=\"tasktable\"]//tbody//tr[1]//input")
	WebElement TaskRow;

	public WebElement taskTitle() {
		return TaskRow;
	}

	@FindBy(xpath = ("//div[@class='bhoechie-tab-content active']//div[@class='panel-heading']//a[2]"))
	WebElement AddSection;

	public WebElement addSection() {
		return AddSection;
	}

	@FindBy(xpath = "//table[@id=\"tasktable\"]//tbody//tr[1]//input")
	WebElement SectionTitle;

	public WebElement sectionTitle() {
		return SectionTitle;
	}

	@FindBy(xpath = "//tbody//tr[1]//td[6]//div[1]//span[2]//a[1]")
	WebElement CommentTask;

	public WebElement commentTask() {
		return CommentTask;
	}

	@FindBy(xpath = "//input[@id='commentAction']")
	WebElement CommentInput;

	public WebElement commentInput() {
		return CommentInput;
	}

	@FindBy(xpath = "//div[@id='view_comments']//button[@type='button'][contains(text(),'×')]")
	WebElement CloseModal;

	public WebElement closeModal() {
		return CloseModal;
	}

	@FindBy(xpath = "//textarea[@class='comments-input']")
	WebElement CheckInput;

	public WebElement checkInput() {
		return CheckInput;
	}

	@FindBy(xpath = "//div[@class='delete']//a[@title='Delete']")
	WebElement DeleteComment;

	public WebElement deleteComment() {
		return DeleteComment;
	}

	@FindBy(xpath = "//tbody//tr[1]//td[6]//div[1]//span[3]//a[1]")
	WebElement DeleteTask;

	public WebElement deleteTask() {
		return DeleteTask;
	}

	@FindBy(xpath = "//tr[@class='generated task-section odd']//i[@class='fa fa-trash-o fa-lg fa-fw iconclass']")
	WebElement DeleteSection;

	public WebElement deleteSection() {
		return DeleteSection;
	}

	@FindBy(xpath = "//table[@id='tasktable']//tbody//tr[1]//td[6]//div[1]//span[4]//a//i[@class='fa fa-arrows fa-lg fa-fw grabbable iconclass']")
	WebElement SourceDrag;

	public WebElement source() {
		return SourceDrag;
	}

	@FindBy(xpath = "//table[@id='tasktable']//tbody//tr[2]")
	WebElement DestDrag;

	public WebElement destination() {
		return DestDrag;
	}

	@FindBy(xpath = "//tbody//tr[1]//td[3]//select")
	WebElement AssignTask;

	public WebElement assignTask() {
		return AssignTask;
	}

	@FindBy(xpath = "//tbody//tr[1]//td[4]//div[1]//input[1]")
	WebElement OpenCalendar;

	public WebElement openCalendar() {
		return OpenCalendar;
	}

	@FindBy(xpath = "//div[@class='table-responsive']//input[@type='search']")
	WebElement SearchTask;

	public WebElement searchTask() {
		return SearchTask;
	}
}
