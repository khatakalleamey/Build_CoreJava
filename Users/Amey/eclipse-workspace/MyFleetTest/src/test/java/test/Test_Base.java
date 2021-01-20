package test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Page_Grid;
import utils.ReadConfig;

public class Test_Base {

	ReadConfig readcon = new ReadConfig();

	public String URl = readcon.getURL();
	public String Username = readcon.getUsername();
	public String Password = readcon.getpassword();
	public static WebDriver driver;
	public static Logger logger;
	public Page_Grid pg;

	@Parameters("browser")
	@BeforeClass
	public void loginSetup(String br) {

		logger = Logger.getLogger("MyFleet");
		PropertyConfigurator.configure("log4j.properties");

		if (br.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", readcon.getChrpompath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		} else {
			System.out.println("Choose another browser supportive");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URl);
	}

	@AfterClass
	public void closeBr() {
		driver.quit();
	}
}
