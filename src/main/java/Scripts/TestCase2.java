package Scripts;


import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.SkillraryDemoApplication;
import pomPages.SkillraryLoginpage;
import pomPages.Testingpage;

public class TestCase2 extends BaseClass{
	
	@Test
	public void Tc2() throws IOException, InterruptedException {
		SkillraryLoginpage s=new SkillraryLoginpage(driver);
		s.gearsbutton();
		s.skillraryDemoApp();
		
		SkillraryDemoApplication sd=new SkillraryDemoApplication(driver);
		driverutilities.switchtabs(driver);
		driverutilities.DropDown(sd.getCoursedd(),p.getpropertyfiledata("coursedd"));
		
		Testingpage t=new Testingpage(driver);
		driverutilities.dragdrop(driver,t.getSeleniumtraining(),t.getCart());
	     Point fb = t.getFacebookicon().getLocation();
	     int x = fb.getX();
		 int y = fb.getY();
		 
		 Thread.sleep(3000);
		 
		 driverutilities.scrollbar(driver, x, y);
		 t.facebook();
		
		
	
		}
	
	
	
	

}
