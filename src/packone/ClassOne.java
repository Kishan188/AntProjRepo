package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassOne 
{
	
  @Test
  public void methodOneA()
  {
	 System.out.println("Inside methodOneA of ClassOne"); 
	 
	 System.setProperty("webdriver.gecko.driver","E:\\GeckoDriver\\geckodriver.exe");
	 
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.get("http://google.com");
	 
	 driver.close();
  }
}
