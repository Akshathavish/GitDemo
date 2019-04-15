package qaclickacademy;

import org.testng.annotations.Test;

public class seleniumTest {
	/*Create testNG  xml file by passing details of seleniumTest,appiumTest,restAPiTest.java so that triggering that xml file automatically all these test will be executed
	Trigger that TestNG xml file from Maven Test folder with command mvn Test 
	*/
	@Test
	public void BrowserAutomation()
	{
		System.out.println("BrowserAutomation");
	}
	
	@Test
	public void elementUi()
	{
		System.out.println("elementUi");
	}

}
