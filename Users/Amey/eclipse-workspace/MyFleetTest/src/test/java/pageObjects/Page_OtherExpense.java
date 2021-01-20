package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Page_OtherExpense {

	WebDriver oedr;

	public Page_OtherExpense(WebDriver ldr) {
		oedr = ldr;
		PageFactory.initElements(ldr, this);
	}

	@FindBy(xpath = "//body/form[@id='aspnetForm']/div[3]/div[1]/a[2]/i[1]")
	@CacheLookup
	WebElement Ddown1;

	@FindBy(xpath = "//body/form[@id='aspnetForm']/div[@id='container']/div[@id='sidebar']/div[1]/div[1]/ul[1]/li[13]/a[1]/span[1]")
	@CacheLookup
	WebElement Ddown2;

	@FindBy(xpath = "//a[@href='ExpenseTransMaster.aspx']")
	@CacheLookup
	WebElement btnOExpnse;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ucBranchMaster1$btnNewAdd']")
	@CacheLookup
	WebElement btnAddNoe;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ucBranchMaster1$lnkAddToMaster']")
	@CacheLookup
	WebElement btnaddNExpenstype;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ucBranchMaster1$UcVehicleIssues1$txtExpenseType']")
	@CacheLookup
	WebElement txtExpensetype;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ucBranchMaster1$UcVehicleIssues1$txtTallyGroupName']")
	@CacheLookup
	WebElement txttallyGName;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder1$ucBranchMaster1$UcVehicleIssues1$btnsubmit']")
	@CacheLookup
	WebElement btnSubmitEType;

	@FindBy(xpath = "//select[@name='ctl00$ContentPlaceHolder1$ucBranchMaster1$ddlCompany']")
	@CacheLookup
	WebElement chooseComapnyname;

	public void ClickDDN1() {
		Ddown1.click();
	}

	public void ClickDDN2() {
		Ddown2.click();
	}

	public void ClickotherEpense() {
		btnOExpnse.click();
	}

	public void ClickedaddNExpensetype() {
		String btnValue = btnaddNExpenstype.getAttribute("value");
		if (btnValue.equals("Add New")) {
			btnaddNExpenstype.click();
		} else {
			System.out.println("unable redirect to add new expense Page");
		}
	}

	public void setExpensetype() {
		txtExpensetype.sendKeys("");
	}

	public void settallygroupname() {
		txttallyGName.sendKeys("");
	}

	public void ClickSubmitET() {
		btnSubmitEType.click();
	}

	public void acceptalert() {
		String alert = oedr.switchTo().alert().getText();
		boolean Alertstatus = oedr.getPageSource().contains(alert);
		Assert.assertEquals(Alertstatus, true);
		if (Alertstatus == true) {
			oedr.switchTo().alert().accept();
		} else {
			String Notifiedalert = oedr.switchTo().alert().getText();
			System.out.println("Invalid issue " + Notifiedalert);
		}

	}

	public void setComapanyname() {
		Select Companyname = new Select(chooseComapnyname);
		Companyname.selectByVisibleText("");

	}
}
