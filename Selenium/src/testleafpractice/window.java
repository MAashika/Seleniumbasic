package testleafpractice;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/window.xhtml");
        
        String old=obj.getWindowHandle();
        WebElement wb=obj.findElementById("j_idt88:new");
        wb.click();
        
        Set<String>handle=obj.getWindowHandles();
        for (String string : handle) {
        	obj.switchTo().window(string);
			
		}
        obj.findElementById("email").sendKeys("aashi@gmail.com");
        obj.findElementById("message").sendKeys("Welcome to testleaf....");
        obj.close();
        obj.switchTo().window(old);
        
        Thread.sleep(2000);
        obj.findElementById("j_idt88:j_idt91").click();
        int count=obj.getWindowHandles().size();
        System.out.println("Number of windows opened:" + count);
        Set<String>windows1=obj.getWindowHandles();
        for (String string : windows1) {
        	if(!string.equals(old))
        	{
        		obj.switchTo().window(string);
        		obj.close();
        	}
			
		}
        
        
        Thread.sleep(2000);
        obj.switchTo().window(old);
        String oldwindow=obj.getWindowHandle();
        obj.findElementById("j_idt88:j_idt93").click();
        Set<String>windows=obj.getWindowHandles();
        for (String string : windows) {
        	if(!string.equals(oldwindow))
        	{
        		obj.switchTo().window(string);
        		obj.close();
        	}
			
		}
        
        
        obj.switchTo().window(old);
        String oldwindow2=obj.getWindowHandle();
        obj.findElementById("j_idt88:j_idt95").click();
        Thread.sleep(2000);
        Set<String>windows2=obj.getWindowHandles();
        for (String string : windows2) {
        	if(!string.equals(oldwindow2))
        	{
        		obj.switchTo().window(string);
        		obj.close();
        	}
			
		}
        
        obj.quit();

	}

	
	}
	


