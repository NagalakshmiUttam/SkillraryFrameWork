package Scripts;

import java.io.IOException;
import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.SkillraryLoginpage;
import pomPages.WishListpage;
import pomPages.corejavapage;

public class TestCase3 extends BaseClass{
	@Test
	public void Tc3() throws IOException, InterruptedException {
		SkillraryLoginpage s=new SkillraryLoginpage(driver);
		s.searchtextbox(p.getpropertyfiledata("name"));
		s.searchbutton();
				
		corejavapage c=new corejavapage(driver);
		c.corejavaselenium();
		
		Thread.sleep(5000);
		
		WishListpage w=new WishListpage(driver);
		driverutilities.switchframes(driver);
		w.playbutton();
		Thread.sleep(3000);
		w.pausebutton();
		driverutilities.switchbackframes(driver);
		w.addtowishlistbtn();
		
	}
}
