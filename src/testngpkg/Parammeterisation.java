package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parammeterisation {
	
	@Parameters({"a"})
	@Test
	public void test(String a)
	{
		System.out.println(a);
	}

}
