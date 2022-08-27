package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mainjava.PimPage;

public class PimTest extends BaseTest {

	@BeforeClass
	public void launching() {
		loginpage.loginmethod();
	}
	
	@Test(priority=4)
	public void verifytextonpimpage() {
		AssertJUnit.assertEquals(pimpage.textonpage(), "PIM");
	}
	
	@Test(priority=5)
	public void verifycheckboxselection() {
		pimpage.checkboxselection();
		AssertJUnit.assertEquals(pimpage.selectionOfcheckbox(), false);
	}
}
