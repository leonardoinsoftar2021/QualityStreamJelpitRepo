package Register;

import java.awt.AWTException;
import java.util.Set;

import javax.security.auth.login.AccountException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;

import Base.BasicWarap;



public class ResgisterPage extends BasicWarap {

	public ResgisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void RegisterUser() throws InterruptedException{
		try {
			Thread.sleep(10000);
			click(LocatorRegister.LOCATOR_GET_INTO);
			//new tab
			
		
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
		
	}


}
