package testleafpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerteg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/alert.xhtml");
        
        obj.findElementById("j_idt88:j_idt91").click();
        Alert a1= obj.switchTo().alert();
        a1.accept();
        
        obj.findElementById("j_idt88:j_idt93").click();
        Alert a2= obj.switchTo().alert();
        a2.dismiss();
        
        obj.findElementById("j_idt88:j_idt95").click();
        obj.findElementById("j_idt88:j_idt98").click();
        
        obj.findElementById("j_idt88:j_idt100").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div[1]/a").click();
        
        WebElement wb=obj.findElementById("j_idt88:j_idt104");
        wb.click();
        Alert a3=obj.switchTo().alert();
        a3.sendKeys("Aashi");
        a3.accept();
        
        WebElement wb1=obj.findElementById("j_idt88:j_idt106");
        wb1.click();
        Thread.sleep(2000);
        obj.findElementById("j_idt88:j_idt108").click();
        
        obj.findElementById("j_idt88:j_idt111").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[3]/div/div[1]/a[2]").click();
        Thread.sleep(2000);
        obj.close();
	}


	}


