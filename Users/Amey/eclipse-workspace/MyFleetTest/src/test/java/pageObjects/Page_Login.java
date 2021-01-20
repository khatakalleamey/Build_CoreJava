package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Login {

	WebDriver ldr;

	public Page_Login(WebDriver gdr) {
		ldr = gdr;
		PageFactory.initElements(gdr, this);
	}

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/img[1]")
	@CacheLookup
	WebElement clo_icon;

	@FindBy(xpath = "//input[@id='myLogin_UserName']")
	@CacheLookup
	WebElement txt_UN;

	@FindBy(xpath = "//input[@id='myLogin_Password']")
	@CacheLookup
	WebElement txt_PWD;

	@FindBy(xpath = "//input[@id='myLogin_LoginButton']")
	@CacheLookup
	WebElement btn_LG;

	@FindBy(xpath = "//span[@id='ctl00_lblusername']")
	@CacheLookup
	WebElement Welc_user;

	@FindBy(xpath = "//a[@id='ctl00_hyLogOut']")
	@CacheLookup
	WebElement btn_logOT;

	public void removeIcon() {
		clo_icon.click();
	}

	public void setUN(String Username) {
		txt_UN.sendKeys(Username);
	}

	public void setPWD(String Password) {
		txt_PWD.sendKeys(Password);
	}

	public void ClickLGbtn() {
		btn_LG.click();
	}

	public void ClickWelcome() {
		Welc_user.click();
	}

	public void ClickLogOut() {
		btn_logOT.click();
	}
}
