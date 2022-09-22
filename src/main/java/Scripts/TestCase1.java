package Scripts;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.AddtoCart;
import pomPages.SkillraryDemoApplication;
import pomPages.SkillraryLoginpage;

public class TestCase1 extends BaseClass {
	@Test
	public void Tc1() throws InterruptedException {
		SkillraryLoginpage s=new SkillraryLoginpage(driver);
		s.gearsbutton();
		s.skillraryDemoApp();
		
		SkillraryDemoApplication d=new SkillraryDemoApplication(driver);
		driverutilities.switchtabs(driver);
		driverutilities.MouseHover(driver, d.getCoursetab());
		d.seleniumtrainingtab();
		
		Thread.sleep(3000);
		
		AddtoCart a=new AddtoCart(driver);
		driverutilities.DoubleClick(driver, a.getAddbutton());
		a.addtocartbutton();
		Thread.sleep(3000);
		driverutilities.alertpopup(driver);

		
	}

	

}
