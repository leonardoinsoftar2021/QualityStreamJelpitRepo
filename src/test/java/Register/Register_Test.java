package Register;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;





public class Register_Test {
	
	private WebDriver driver;
	ResgisterPage registerpage;

	@Before
	public void setUp() throws Exception {
		registerpage = new ResgisterPage(driver);
		driver = registerpage.chromeDriverConnection();
		registerpage.visit("https://dev.jelpit.com");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		registerpage.RegisterUser();
	}

}
