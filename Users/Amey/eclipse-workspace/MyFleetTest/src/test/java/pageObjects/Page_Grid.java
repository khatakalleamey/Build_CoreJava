package pageObjects;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Grid {

	WebDriver grdr;

	public Page_Grid(WebDriver gdr) {
		grdr = gdr;
		PageFactory.initElements(gdr, this);
	}

	@FindBy(xpath = "//body/form[@id='aspnetForm']/div[3]/div[1]/a[2]/i[1]")
	@CacheLookup
	WebElement Ddown1;

	@FindBy(xpath = "//a[@id='ctl00_rptMenu_ctl06_masters']")
	@CacheLookup
	WebElement Ddown2;

	@FindBy(xpath = "//a[@id='ctl00_rptMenu_ctl06_rptSubMenu_ctl01_HyperLink1']")
	@CacheLookup
	WebElement btnMInvoice;

	@FindBy(xpath = "//input[@id='txt_ClientName']")
	@CacheLookup
	public WebElement autoSearchCN;

	@FindBy(xpath = "//tbody/tr/td/span[contains(text(),'ABC INDIA PVT. LTD.')]")
	@CacheLookup
	public List<WebElement> Autosearchresult;

	@FindBy(xpath = "//input[@id='txt_InvoiceDate']")
	@CacheLookup
	public WebElement autoSearchIDate;

	@FindBy(xpath = "//tbody/tr/td/span[contains(text(),'Jan-2020')]")
	@CacheLookup
	public List<WebElement> AutosearchresultID;

	@FindBy(xpath = "//input[@id='txt_InvoiceNo']")
	@CacheLookup
	public WebElement autoSearchIN;

	@FindBy(xpath = "//tbody/tr/td/span[contains(text(),'20-21')]")
	@CacheLookup
	public List<WebElement> AutosearchresultIN;

//	@FindBy(xpath = "//input[@id='txt_PONumber']")
//	@CacheLookup
//	WebElement autoSearchPON;
//
//	@FindBy(xpath = "//input[@id='txt_NetAmt']")
//	@CacheLookup
//	WebElement autoSearchNA;
//
//	@FindBy(xpath = "//input[@id='txt_TotalTaxAmt']")
//	@CacheLookup
//	WebElement autoSearchTTA;
//
//	@FindBy(xpath = "//input[@id='txt_TotalBillAmt']")
//	@CacheLookup
//	WebElement autoSearchTBA;
//
//	@FindBy(xpath = "//input[@id='txt_RoundUp']")
//	@CacheLookup
//	WebElement autoSearchRu;
//
//	@FindBy(xpath = "//input[@id='txt_FinalBillAmt']")
//	@CacheLookup
//	WebElement autoSearchFBA;
//
//	@FindBy(xpath = "//input[@id='txt_ReceivedAmt']")
//	@CacheLookup
//	WebElement autoSearchRA;

	public void ClickDDN1() {
		Ddown1.click();
	}

	public void ClickDDN2() {
		Ddown2.click();
	}

	public void ClickonMinvoice() {
		btnMInvoice.click();
	}

	public void carryAutosearchCN(String shrtClientn) throws InterruptedException {
		autoSearchCN.sendKeys(shrtClientn.substring(0, 3));
		Thread.sleep(3000);
		autoSearchCN.clear();
	}

	public boolean VerifyforCompanyNameFilter(String AssociatedAutosearesults) {

		boolean checkFilterCN = false;

		List<String> Autosearchedresults = Autosearchresult.stream().map(Cname -> Cname.getText())
				.collect(Collectors.toList());
		HashSet<String> hashset = new HashSet<String>(Autosearchedresults);
		System.out.println(Autosearchedresults.size());
		System.out.println(hashset);

		if (hashset.contains(AssociatedAutosearesults)) {
			checkFilterCN = true;
		}

		/*
		 * if (hashset.contains(AssociatedAutosearesults)) {
		 * Assert.assertEquals(AssociatedAutosearesults, false);
		 * System.out.println("Returning Invalid value . " + AssociatedAutosearesults +
		 * " filters not working"); } else { pg.autoSearchCN.clear();
		 * Thread.sleep(5000); System.out.println("Returning Valid Value"); }
		 */
		return checkFilterCN;

	}

	public void carryAutosearchIDate() throws InterruptedException {
		autoSearchIDate.sendKeys("jan");
		Thread.sleep(5000);
		autoSearchIDate.clear();
	}

	public boolean VerifyforInvoiceD() {

		boolean checkFilterID = false;

		List<Object> AutosearchedresultsID = AutosearchresultID.stream().map(Idate -> Idate.getText())
				.collect(Collectors.toList());
		HashSet<Object> hashsetID = new HashSet<Object>(AutosearchedresultsID);
		System.out.println(AutosearchedresultsID.size() + " No's of Total invoice found");
		Object AssociatedAutosearesultsID = "23-oct-2020";
		if (hashsetID.contains(AssociatedAutosearesultsID)) {
			checkFilterID = false;
		}
		return checkFilterID;
		/*
		 * if (hashsetID.contains(AssociatedAutosearesultsID)) {
		 * Assert.assertEquals(AssociatedAutosearesultsID, false);
		 * System.out.println("Returning Invalid value . " + AssociatedAutosearesultsID
		 * + " filters not working"); } else { pg.autoSearchIDate.clear();
		 * Thread.sleep(5000); System.out.println("Returning Valid Value"); }
		 */
	}

	public void carryAutosearchIN() throws InterruptedException {
		autoSearchIN.sendKeys("20-21");
		Thread.sleep(3000);
		autoSearchIN.clear();
	}

	public boolean VerifyforInvoiceN() {

		boolean checkFilterIN = false;

		List<Object> AutosearchedresultsIN = AutosearchresultIN.stream().map(Inumber -> Inumber.getText())
				.collect(Collectors.toList());
		HashSet<Object> hashsetIN = new HashSet<Object>(AutosearchedresultsIN);
		System.out.println(hashsetIN);
		System.out.println(AutosearchedresultsIN.size() + " No's of Total invoice number ");
		Object AssociatedAutosearesultsIN = "SSS/19-20/00076";
		// Object checkIndx = "SSS/00268/20-21";

		for (int i = 0; i < AutosearchedresultsIN.size(); i++) {
			Object IdentifiedRsult = AutosearchedresultsIN.get(i);
			int IdentifiedIndex = AutosearchedresultsIN.indexOf(IdentifiedRsult);
			System.out.println("Value Found " + IdentifiedRsult + " and its index is " + IdentifiedIndex);
		}

		if (hashsetIN.contains(AssociatedAutosearesultsIN)) {
			checkFilterIN = false;
		}
		return checkFilterIN;
	}

}