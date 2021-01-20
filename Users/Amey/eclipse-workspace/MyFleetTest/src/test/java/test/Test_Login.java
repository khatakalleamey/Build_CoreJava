package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.Page_Login;

public class Test_Login extends Test_Base {

	@Test(description = "Login")
	public void login() throws InterruptedException {

		logger.info("URL is opened");

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

		Thread.sleep(5000);
		pl.ClickWelcome();

		Thread.sleep(5000);
		pl.ClickLogOut();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
