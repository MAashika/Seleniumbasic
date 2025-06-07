package locators;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tags {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://www.google.co.in/");
        
        //tag names:
        //1. image=img
        //2. links=a
        //3.elements=input,div,select
        
       List<WebElement> a= obj.findElements(By.tagName("img"));
        System.out.println("number of images:" + a.size());
        
        List<WebElement> b= obj.findElements(By.tagName("a"));
        System.out.println("Number of links:" + b.size());
        
        List<WebElement> c= obj.findElements(By.tagName("input"));
        System.out.println("Number of elements with input tag:" + c.size());
        
        List<WebElement> d=obj.findElements(By.tagName("select"));
        System.out.println("Number of elements with select tag:" + d.size());
        
        List<WebElement> e=obj.findElements(By.tagName("div"));
        System.out.println("Number of elements with div tag:" + e.size());
        
        List<WebElement> f=obj.findElements(By.tagName("path"));
        System.out.println("Number of elements with path tag:" + f.size());
        
        List<WebElement> g=obj.findElements(By.tagName("iframe"));
        System.out.println("Number of elements with iframe tag:" + g.size());
        
        List<WebElement> h=obj.findElements(By.tagName("script"));
        System.out.println("Number of elements with script tag:" + h.size());
        
        List<WebElement> i=obj.findElements(By.tagName("body"));
        System.out.println("Number of elements with body tag:" + i.size());
        
        List<WebElement> j=obj.findElements(By.tagName("head"));
        System.out.println("Number of elements with head tag:" + j.size());
        
        List<WebElement> k=obj.findElements(By.tagName("style"));
        System.out.println("Number of elements with style tag:" + k.size());
        
        
        obj.quit();
			
		
        
	}

}
