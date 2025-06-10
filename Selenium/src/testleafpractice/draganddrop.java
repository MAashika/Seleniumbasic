package testleafpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/drag.xhtml");
        
       
        WebElement res=obj.findElementById("form:conpnl");
        Actions val=new Actions(obj);
        val.clickAndHold(res);
        val.moveByOffset(300,0);
        val.pause(1);
        val.release();
        val.perform();
        
        WebElement wb=obj.findElementById("form:j_idt94:j_idt97");
        WebElement wb1=obj.findElementById("form:j_idt94:j_idt95");
        Actions res1=new Actions(obj);
        res1.dragAndDrop(wb, wb1).build().perform();
        
        WebElement wb2=obj.findElementById("form:j_idt94:j_idt99");
        WebElement wb3=obj.findElementById("form:j_idt94:j_idt95");
        Actions res2=new Actions(obj);
        res2.dragAndDrop(wb2, wb3).build().perform();
        
       /* obj.manage().window().maximize();

        WebElement drag=obj.findElementById("form:logo");
        Actions size=new Actions(obj); 
        size.clickAndHold(drag);
        size.moveByOffset(300, 300);
        size.release();
        size.perform();*/
      
        WebElement wb4=obj.findElementById("form:drag");
        WebElement wb5=obj.findElementById("form:drop");
        Actions res4=new Actions(obj);
        res4.dragAndDrop(wb4, wb5).build().perform();
        
        Thread.sleep(2000);
        WebElement wb6=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/table/tbody/tr[9]/td[3]");
        WebElement wb7=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/table/tbody/tr[10]/td[3]");
        Actions res5=new Actions(obj);
        res5.clickAndHold(wb7);
        res5.moveToElement(wb6);
        //res5.moveByOffset(0, 10);
        res5.release();
        res5.perform();
        
        obj.findElementById("form:j_idt119").click();
        Thread.sleep(5000);
        
        WebElement right=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[4]/table/tbody/tr[3]/td/div/span[2]");
        WebElement left=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[4]/table/tbody/tr[3]/td/div/span[1]");
        Actions act=new Actions(obj);
        act.clickAndHold(left).moveByOffset(-105, 0).release().perform();
        act.clickAndHold(right).moveByOffset(100, 0).release().perform();
          
        obj.quit();
	}

}
