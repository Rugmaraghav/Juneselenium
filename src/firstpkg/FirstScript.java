package firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		
//		chromedriver
//		firefoxdriver
//		edgedriver
		
		
		ChromeDriver driver=new ChromeDriver(); //browser launch
		driver.get("https://www.google.com"); //open application
		
		String actualtitle =driver.getTitle();
		String exp="google";
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}

}
