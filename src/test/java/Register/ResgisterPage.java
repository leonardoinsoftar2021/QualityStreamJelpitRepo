package Register;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Base.BaseData;
import Base.BasicWarap;



public class ResgisterPage extends BasicWarap {

	public ResgisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void RegisterUser() throws InterruptedException{
		try {
			Thread.sleep(5000);
			click(LocatorRegister.LOCATOR_CLOSE);
			Thread.sleep(5000);
			click(LocatorRegister.LOCATOR_GET_INTO);
			Thread.sleep(5000);
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			WebElement element = driver.findElement(LocatorRegister.LOCATOR_CREAT_ACCOUNT);
			js.executeScript("arguments[0].scrollIntoView();", element);
	        Thread.sleep(5000);
			click(LocatorRegister.LOCATOR_CREAT_ACCOUNT);
			 Thread.sleep(5000);
			type(BaseData.NAME, LocatorRegister.LOCATOR_NAME);
			type(BaseData.LASTNAME, LocatorRegister.LOCATOR_LASTNAME);
			type(BaseData.EMAIL, LocatorRegister.LOCATOR_EMAIL);
			type(BaseData.PASSWORD, LocatorRegister.LOCATOR_PASSWORD);
			type(BaseData.CONFIRMATION_PASSWORD, LocatorRegister.LOCATOR_CONFIRMATION_PASSWORD);
			  Thread.sleep(5000);
			  JavascriptExecutor js1 = ((JavascriptExecutor) driver);
				WebElement element1 = driver.findElement(LocatorRegister.LOCATOR_BUTTON_CREAT_ACCOUNT);
				js1.executeScript("arguments[0].scrollIntoView();", element1);
				  Thread.sleep(5000);
			click(LocatorRegister.LOCATOR_BUTTON_CREAT_ACCOUNT);
		
			
		
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
		
	}

}
