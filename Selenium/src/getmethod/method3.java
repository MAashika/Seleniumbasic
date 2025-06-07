package getmethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class method3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\maash\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://mail.google.com/mail/");
		
		Thread.sleep(4000);
		Point pt=new Point(200,300);
        obj.manage().window().setPosition(pt);
        
        obj.close();
		
	}

}

