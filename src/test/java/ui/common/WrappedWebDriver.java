package ui.common;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;

public class WrappedWebDriver implements DriverSource {
	
	public static final EnvironmentVariables variables=SystemEnvironmentVariables.createEnvironmentVariables();
	
	String driverName="";

	@Override
	public WebDriver newDriver() {
		WebDriver driver=null;
		driverName= variables.getProperty("setup.driver");
		if(driverName==null||driverName.isEmpty()) {
			driverName="chrome";
		}
		String driverPath=System.getProperty("user.dir");
		File f = new File(driverPath+"//libs");
		if("chrome".equalsIgnoreCase(driverName)&&f.exists()) {
			try {
				System.setProperty("webdriver.chrome.driver", new File(".").getCanonicalPath()+"\\libs\\chromedriver.exe");
				driver=new ChromeDriver();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return driver;
	}

	@Override
	public boolean takesScreenshots() {
		return false;
	}
	
	

}
