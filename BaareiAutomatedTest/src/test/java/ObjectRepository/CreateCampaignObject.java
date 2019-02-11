package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignObject {
	
	WebDriver driver;

	public CreateCampaignObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//a[@title='Create Campaign']"))
	WebElement CreateEventButton;
	
	@FindBy(xpath=("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
	WebElement Template;
	
	@FindBy(xpath=("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"))
	WebElement CampaignType;
	
	@FindBy(xpath=("//input[@id='id_title']"))
	WebElement CampaignName;
	
	@FindBy(xpath=("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]"))
	WebElement StartCalendarButton;
	
	@FindBy(xpath=("//div[contains(@class,'xdsoft_datetimepicker xdsoft_noselect')]/div[1]/div[1]/button[3]"))
	WebElement NextMonth;
	
	@FindBy(xpath=("//body[@class='subpage modal-open']/div[3]/div[1]/div[1]/div[1]/span[1]/text()"))
	WebElement MonthSelector;
	
	@FindBy(xpath=("//span[@id='end_calendar']"))
	WebElement EndCalendarButton;
	
	@FindBy(xpath=("//div[4]//div[1]//div[1]//button[3]"))
	WebElement ENextMonth;
	
	@FindBy(xpath=("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/span[1]"))
	WebElement EmonthSelector;
	
	@FindBy(xpath=("//button[@id='saveButton']"))
	WebElement CreateButton;
	
	@FindBy(xpath=("//input[@name='location']"))
	WebElement Location;
	
	@FindBy(xpath=("/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]"))
	WebElement Timezone;

	@FindBy(xpath=("//input[@placeholder='Select region...']"))
	WebElement Roles;
	
	@FindBy(xpath=("//input[@id='id_url']"))
	WebElement URL;
	
	public WebElement createEventButton() {
		
		return CreateEventButton;
	}
	
	public WebElement template()
	{
		return Template;
	}
	
	public WebElement campaignType() {
		
		return CampaignType;
	}
	
	public WebElement title() {
		
		return CampaignName;
	}
	
	public WebElement openStartCalendar() {
		
		return StartCalendarButton;
	}
	
	public WebElement startNextMonth() {
		
		return NextMonth;
	}
	
	public WebElement startMonthSelector() {
		
		return MonthSelector;
	}
	
	
	public WebElement openEndcalendar() {
		
		return EndCalendarButton;
	}
	
	public WebElement endNextMonth() {
		
		return ENextMonth;
	}
	
	public WebElement endMonth() {
		return EmonthSelector;
	}
	
	public WebElement createButton() {
		return CreateButton;
	}
	
	public WebElement location() {
		return Location;
	}
	
	public WebElement timeZone() {
		return Timezone;
	}
	
	public WebElement roles() {
		return Roles;
	}
	
	public WebElement Url() {
		return URL;
	}


}
