package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class xandfullxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.saucedemo.com/v1/");
		
		//1.relative xpath....copy xpath
		//obj.findElementByXPath("//*[@id=\"user-name\"]").sendKeys("problem_user");
		//obj.findElementByXPath("//*[@id=\"password\"]").sendKeys("secret_sauce");
		//obj.findElementByXPath("//*[@id=\"login-button\"]").click();
		
		//2.absolute xpath....copy fullxpath
		obj.findElementByXPath("/html/body/div[2]/div[1]/div/div/form/input[1]").sendKeys("problem_user");
		obj.findElementByXPath("/html/body/div[2]/div[1]/div/div/form/input[2]").sendKeys("secret_sauce");
		obj.findElementByXPath("/html/body/div[2]/div[1]/div/div/form/input[3]").click();
		obj.close();
	}

}
