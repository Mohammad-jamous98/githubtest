package githubtetsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myclass {

	WebDriver driver = new EdgeDriver();
	
	
	@BeforeTest
	public void mysetup() {
		
		driver.get("https://www.google.com/");
		
	}
	
	
	@Test
	
	public void mytest() {
		
		System.out.println(driver.getTitle());
	}
	
}
