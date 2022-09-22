package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginpage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbutton;
	
	@FindBy (xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoApp;
	
	@FindBy (name="q")
	private WebElement searchTab;
	
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbutton;
	
	public SkillraryLoginpage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	
	public void gearsbutton(){
		gearsbutton.click();
	}
	
	public void skillraryDemoApp(){
		skillraryDemoApp.click();
	}
	
	public void searchtextbox(String name){
		searchTab.sendKeys(name);
	}
	
	public void searchbutton() {
		searchbutton.click();
	}
	
	
		{
	}

	 
	}


