package getmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class method1 {

	

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob=new ChromeDriver();
	    ob.get("https://www.google.co.in/");
	    
	    ob.close();
	}
	

}
