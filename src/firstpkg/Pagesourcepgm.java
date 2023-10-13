package firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Pagesourcepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		 String src =driver.getPageSource();
		 if(src.contains("Gmail"))
		 {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 
		 
		
		
	}

}
