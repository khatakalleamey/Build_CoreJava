package test;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Page_Grid;
import pageObjects.Page_Login;

public class Test_GridFilter extends Test_Base {

	@Test(description = "Login Page Verification")
	public void VerifyloginPage() throws InterruptedException {
		// login page
		Page_Login pl = new Page_Login(driver);

		Thread.sleep(5000);
		pl.removeIcon();
		logger.info("Window Closed");

		Thread.sleep(5000);
		pl.setUN(Username);
		logger.info("Username Entered");

		Thread.sleep(5000);
		pl.setPWD(Password);
		logger.info("Password Entered");

		Thread.sleep(2000);
		pl.ClickLGbtn();
		logger.info("Logged in ");

		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Title after Login is " + title);
		if (title.contains("Dashboard")) {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleIs(title));
			logger.info("title invoked is " + title);
		} else {
			logger.warn("Invoking incorrect title FAILED");
		}
	}

	@Test(description = "Verify Grid P title - redirected")
	public void VerifyGridPTitle() throws InterruptedException {
		// Page Grid Filter
		Page_Grid pg = new Page_Grid(driver);

		Thread.sleep(3000);
		pg.ClickDDN1();

		Thread.sleep(3000);
		pg.ClickDDN2();

		Thread.sleep(3000);
		pg.ClickonMinvoice();

		Thread.sleep(5000);
		String MInvtitle = driver.getTitle();
		System.out.println("Title is " + MInvtitle);
		if (MInvtitle.contains("Misc Invoice")) {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleIs(MInvtitle));
			logger.info("title invoked is " + MInvtitle);
		} else {
			logger.warn("Invoking incorrect title FAILED");
		}
	}

	@Test(description = "Verify clinet name filter")
	public void VerifyClientnameFilter() throws InterruptedException {
		pg = new Page_Grid(driver);

		Thread.sleep(5000);
		String ClientName = "ABC INDIA PVT. LTD.";
		pg.carryAutosearchCN(ClientName);

		boolean filterstatusCN = pg.VerifyforCompanyNameFilter(ClientName);

		Assert.assertEquals(filterstatusCN, true);

	}

	@Test(description = "Verify Invoice date filter")
	public void VerifyInvoicedateFilter() throws InterruptedException {
		pg = new Page_Grid(driver);

		Thread.sleep(5000);
		pg.carryAutosearchIDate();

		boolean filterstatusID = pg.VerifyforInvoiceD();
		Assert.assertEquals(filterstatusID, false);
	}

	@Test(description = "Verify Invoice number filter")
	public void VerifyInvoicenumberFilter() throws InterruptedException {
		pg = new Page_Grid(driver);

		Thread.sleep(5000);
		pg.carryAutosearchIN();

		boolean filterstatusIN = pg.VerifyforInvoiceN();
		Assert.assertEquals(filterstatusIN, false);

		System.gc();
		Runtime.getRuntime().gc();
	}

}
