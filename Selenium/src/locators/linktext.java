package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://www.google.co.in/");
        //linktext
        //obj.findElementByLinkText("Images").click();
        
        //partial linktext
        obj.findElementByPartialLinkText("Ima").click();
        
        obj.quit();
        
	}

}
