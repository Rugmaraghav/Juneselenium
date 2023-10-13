package firstpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {
	ChromeDriver driver;
	@Before
	public void  setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleverification()
	{
		
	}
	
	@Test
	public void pagesrcpgm()
	{
		
	}


}
