package ObjectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParticipantObject {

	WebDriver driver;

	public ParticipantObject(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//table[@id='my_upcoming_events']//a[@title='Selenium Event'][contains(text(),'Selenium Event')]"))
	WebElement EventName;

	public WebElement eventName() {
		return EventName;
	}

	@FindBy(xpath = "//a[@id='participantTab']")
	WebElement ParticipantTab;

	public WebElement openParticipantTab() {
		return ParticipantTab;
	}

	@FindBy(xpath = "//a[@title='Add participant']")
	WebElement AddSingle;

	public WebElement addSingleParticipant() {
		return AddSingle;
	}

	@FindBy(xpath = "//select[@id='id_contact']")
	WebElement Name;

	public WebElement nameOfParticipant() {
		return Name;
	}

	@FindBy(xpath = "//span[@class='glyphicon glyphicon-remove']")
	WebElement CancelDropdownButton;

	public WebElement cancelRoleDropDown() {
		return CancelDropdownButton;
	}

	@FindBy(xpath = "//span[@class='input-group-addon dropdown-toggle']")
	WebElement RoleDropdownButton;

	public WebElement openRoleDropDown() {
		return RoleDropdownButton;
	}

	@FindBy(xpath = "//li[@data-value='Vendor']")
	WebElement SelectRole;

	public WebElement selectRole() {
		return SelectRole;
	}

	@FindBy(xpath = "//label[@for='invite']")
	WebElement Invite;

	public WebElement inviteParticipant() {
		return Invite;
	}

	@FindBy(xpath = "//i[@class='fa fa-floppy-o fa-lg fa-fw']")
	WebElement Save;

	public WebElement saveSlot() {
		return Save;
	}

	@FindBy(xpath = "//a[@id='cancelParticipantLink']")
	WebElement Cancel;

	public WebElement cancelSlot() {
		return Cancel;
	}

	@FindBy(xpath = "//i[@class='fa fa-times fa-lg fa-fw']")
	WebElement Delete;

	public WebElement deleteParticiapnt() {
		return Delete;
	}

	@FindBy(xpath = "//a[@title='Add multiple participants']")
	WebElement addBulkButton;

	public WebElement multipleParticipantButton() {
		return addBulkButton;
	}

	@FindBy(xpath = "//div[@class='modal-body']//a[contains(@class,'paginate_button')][contains(text(),'2')]")
	WebElement secondPage;

	public WebElement goOnSecondPage() {
		return secondPage;
	}

	@FindBy(xpath = "//div[@id='bulk_add_participants']//tbody//tr[8]//td[1]")
	WebElement CheckBox;

	public WebElement checkBoxOnSecondPage() {
		return CheckBox;
	}

	@FindBy(xpath = "//div[@id='contactsTable_filter']//input[@type='search']")
	WebElement searchMultiple;

	public WebElement searchMultipleParticipant() {
		return searchMultiple;
	}

	@FindBy(xpath = "//td[contains(@class,'select-checkbox')]")
	WebElement SelectMultiple;

	public WebElement selectMultipleParticpant() {
		return SelectMultiple;
	}

	@FindBy(xpath = "//button[@id='saveButton']")
	WebElement addParticipant;

	public WebElement addMultipleParticpant() {
		return addParticipant;
	}

	@FindBy(xpath = "//a[@title='Manage hotel reservations']")
	WebElement HotelReservationButton;

	public WebElement hotelReservationButton() {
		return HotelReservationButton;
	}

	@FindBy(xpath = "//a[@id='addHotelLink']")
	WebElement AddReservationButton;

	public WebElement addReservationButton() {
		return AddReservationButton;
	}
	
	@FindBy(xpath="//input[@class='reservation_number']")
	WebElement ReservationNo;
	
	public WebElement reservationNum() {
		return ReservationNo;
	}
	
	@FindBy(xpath="//input[@class='hotel_name']")
	WebElement HotelName;
	
	public WebElement hotelName() {
		return HotelName;
	}
	
	@FindBy(xpath="//div[@id='hotelReservationsContent']//button[@type='button'][contains(text(),'×')]")
	WebElement closeModal;
	
	public WebElement closeModal() {
		return closeModal;
	}
	
	@FindBy(xpath="//table[@id='participantstable']//tr[3]//td[1]//span")
	WebElement FirstRow;
	
	public WebElement firstRowDropDown() {
		return FirstRow;
	}
	
	@FindBy(xpath="//tr[4]//form[@class='reservation-form']//button[@title='Associate existing hotel reservation.']")
	WebElement AssociateReservation;
	
	public WebElement associateReservationButton() {
		return AssociateReservation;
	}
	
	@FindBy(xpath="//i[@class='fa fa-share-square fa-lg iconclass']")
	WebElement ConfirmAssociation;
	
	public WebElement confirmAssociation() {
		return ConfirmAssociation;
	}

	@FindBy(xpath="//table[@id='participantstable']//tr[5]//td[1]//span")
	WebElement SecondRow;
	
	public WebElement secondRowDropDown() {
		return FirstRow;
	}	
	
	@FindBy(xpath="//tr[6]//form[@class='reservation-form']//button[@title='Associate existing hotel reservation.']")
	WebElement AddReservation;
	
	public WebElement addReservationInDropDownButton() {
		return AddReservation;
	}
	
	@FindBy(xpath="//table[@id='participantstable']//tbody//tr[4]//td[1]//form//input[@class='reservation-number']")
	WebElement FormReservation1;
	
	public WebElement formReservation1() {
		return FormReservation1;
	}
	
	@FindBy(xpath="//table[@id='participantstable']//tbody//tr[4]//td[1]//form//input[@class='hotel-name']")
	WebElement FormHotelName1;
	
	public WebElement formHotelName1() {
		return FormHotelName1;
	}
	
	@FindBy(xpath="//table[@id='participantstable']//tbody//tr[4]//td[1]//form//input[@class='hotel-location']")
	WebElement FormHotelLocation1;
	
	public WebElement formHotelLocation1() {
		return FormHotelLocation1;
	}
	
	@FindBy(xpath="//table[@id='participantstable']//tbody//tr[4]//td[1]//form//input[@class='start-date']")
	WebElement FormStartDate1;
	
	public WebElement formStartDate1() {
		return FormStartDate1;
	}
	
	@FindBy(xpath="//table[@id='participantstable']//tbody//tr[4]//td[1]//form//input[@class='end-date']")
	WebElement FormEndDate1;
	
	public WebElement formEndDate1() {
		return FormEndDate1;
	}
	
	@FindBy(xpath="//table[@id='participantstable']//tbody//tr[4]//td[1]//form//input[@class='check-in-time']")
	WebElement FormCheckInTime1;
	
	public WebElement formCheckInTime1() {
		return FormCheckInTime1;
	}
	
	@FindBy(xpath="//table[@id='participantstable']//tbody//tr[4]//td[1]//form//input[@class='check-out-time']")
	WebElement FormCheckOutTime;
	
	public WebElement formCheckOutTime() {
		return FormCheckOutTime;
	}
	
	@FindBy(xpath="//table[@id='participantstable']//tbody//tr[4]//td[1]//form//input[@class='cancel-by']")
	WebElement FormCancel;
	
	public WebElement formCancel() {
		return FormCancel;
	}

	
}
