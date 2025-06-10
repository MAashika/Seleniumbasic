package testleafpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class hyperlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/link.xhtml");
        
        WebElement link=obj.findElement(By.partialLinkText("Go to"));
        link.click();
        obj.navigate().back();
        
        WebElement findurl=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/a");
        String value=findurl.getAttribute("href");
        System.out.println(value);
        
        WebElement broken=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/a");
        broken.click();
        String res=obj.getTitle();
        if(res.contains("404"))
        {
        	System.out.println("Link is broken");
        }
        obj.navigate().back();
        
        WebElement link1=obj.findElement(By.partialLinkText("Go to"));
        link1.click();
        obj.navigate().back();
        
       List<WebElement> count=obj.findElements(By.tagName("a"));
        int val=count.size();
        System.out.println("Number of links in the page:" + val);
        
        WebElement wb=obj.findElementByCssSelector("#j_idt87 > div > div:nth-child(2) > div:nth-child(3) > div > div > a");
       List< WebElement> links=wb.findElements(By.tagName("a"));
       int totalcount=links.size();
       System.out.println("Number of links in this layout:" + totalcount);
       
       obj.close();
        

	}

}

