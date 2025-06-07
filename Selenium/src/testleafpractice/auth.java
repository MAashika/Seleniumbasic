package testleafpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class auth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/auth.xhtml");
        
        obj.findElementById("j_idt88:j_idt90").click();
        
	}

}
