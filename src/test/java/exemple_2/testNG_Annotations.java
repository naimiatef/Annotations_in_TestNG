package exemple_2;
import org.testng.annotations.Test;

public class testNG_Annotations {
	 

	@Test(priority = 1)
	public void CloseBrowser() {
		 
		System.out.println("Test priority 1");
	}

	@Test(priority = 0)
	public void OpenBrowser() {
		System.out.println("Test priority 0");

	}
	
	@Test (priority = 1)
	public void AccountTest(){
		System.out.println("Some tests for Customer Account");
	}

}
