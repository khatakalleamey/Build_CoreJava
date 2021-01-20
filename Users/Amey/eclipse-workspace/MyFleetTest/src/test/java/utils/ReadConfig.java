package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		{
			File src = new File("./Configurations/Config.Properties");

			try {
				FileInputStream fis = new FileInputStream(src);
				pro = new Properties();
				pro.load(fis);
			} catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
			}
		}
	}

	public String getURL() {
		String URl = pro.getProperty("URL");
		return URl;
	}

	public String getUsername() {
		String Username = pro.getProperty("username");
		return Username;
	}

	public String getpassword() {
		String Password = pro.getProperty("password");
		return Password;
	}

	public String getChrpompath() {
		String chrome_Path = pro.getProperty("chromepath");
		return chrome_Path;
	}

}
