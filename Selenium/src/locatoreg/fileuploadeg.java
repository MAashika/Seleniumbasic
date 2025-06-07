package locatoreg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadeg {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://practice.expandtesting.com/upload");
		 Set<Cookie> s=obj.manage().getCookies();
	        System.out.println("Number of cookies are:" + s.size());
	        
	        obj.manage().deleteAllCookies();
	        obj.manage().window().maximize();
	        

	obj.findElement(By.xpath("//*[@id=\'fileInput\']")).sendKeys("C:\\Users\\maash\\OneDrive\\Documents\\Aashika mock resume23.pdf");
	
	
		/*StringSelection file=new StringSelection("C:\\Users\\maash\\OneDrive\\Documents\\Aashika mock resume23.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		Robot res=new Robot();
		res.keyPress(KeyEvent.VK_CONTROL);
		res.keyPress(KeyEvent.VK_V);
		res.keyRelease(KeyEvent.VK_CONTROL);
		res.keyRelease(KeyEvent.VK_V);
		res.keyPress(KeyEvent.VK_ENTER);
		res.keyRelease(KeyEvent.VK_ENTER);*/
		
	}

}
