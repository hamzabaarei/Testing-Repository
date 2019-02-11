package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject {

	WebDriver driver;

	public LoginObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//nav[@id='nav']//a[@id='signInLink']"))
	WebElement signInButton;

	@FindBy(xpath = ("//*[@id=\"google_login\"]/img"))
	WebElement signInWithGoogle;

	@FindBy(xpath = ("//input[@type='email']"))
	WebElement Email;

	@FindBy(xpath = ("//*[text()='Next']"))
	WebElement NextButton;

	@FindBy(xpath = ("//input[@type='password']"))
	WebElement Password;

	@FindBy(xpath = ("//*[@id=\"passwordNext\"]/content/span"))
	WebElement Next;

	public WebElement signInButton() {
		return signInButton;
	}

	public WebElement signInWithGoogle() {
		return signInWithGoogle;
	}

	public WebElement Email() {
		return Email;
	}

	public WebElement NextButton() {
		return NextButton;
	}

	public WebElement Password() {
		return Password;
	}

	public WebElement Next() {
		return Next;
	}
}
