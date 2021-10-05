package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class CreateContract extends ProjectSpecificMethods {
	@Test
	public void runCreateContracts() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickAppLauncher()
		.clickViewAll()
		.clickContracts()
		.clickNewButton()
		.enterAccName()
		.enterNextDay()
		.enterTerm()
		.clickSave();
	}

}
