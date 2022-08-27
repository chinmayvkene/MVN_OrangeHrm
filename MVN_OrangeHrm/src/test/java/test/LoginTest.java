package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(priority=1)
	public void verifyurl() {
		AssertJUnit.assertEquals(loginpage.urlofpage(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=2)
	public void verifytextonpage() {
		AssertJUnit.assertEquals(loginpage.textonpage(), "Login");
	}
	
	@Test(priority=3)
	public void runlogin() {
		loginpage.loginmethod();
	}
}
