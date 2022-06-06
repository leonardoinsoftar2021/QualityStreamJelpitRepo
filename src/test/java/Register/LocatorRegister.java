package Register;

import org.openqa.selenium.By;

public class LocatorRegister {
	//Información para el registro
	public static final By LOCATOR_CLOSE = By.xpath("//*[@id=\"mat-dialog-0\"]/app-modal-register/mat-dialog-content/div/div/div[2]/span/span");
	public static final By LOCATOR_GET_INTO = By.xpath("//*[@id=\"menu-site\"]/app-menu/div/div/div[1]/div[2]/ul/li[1]/a");
	public static final By LOCATOR_CREAT_ACCOUNT = By.linkText("Crea tu cuenta");
	public static final By LOCATOR_NAME = By.id("nameRegister");
	public static final By LOCATOR_NAME1 = By.id("first_name");
	public static final By LOCATOR_LASTNAME = By.id("lastNameRegister");
	public static final By LOCATOR_LASTNAME1 = By.id("last_name");
	public static final By LOCATOR_EMAIL = By.id("mailRegister");
	public static final By LOCATOR_EMAIL1 = By.id("email");
	public static final By LOCATOR_PASSWORD = By.id("passRegister");
	public static final By LOCATOR_MOBILE = By.id("phone");
	public static final By LOCATOR_PASSWORD1 = By.id("password");
	public static final By LOCATOR_CONFIRMATION_PASSWORD = By.id("confirmPassRegister");
	public static final By LOCATOR_BUTTON_REGISTER = By.id("registerBtn");
	public static final By LOCATOR_BUTTON_CREAT_ACCOUNT = By.id("register");
	

}
