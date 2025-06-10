package testleafpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/frame.xhtml");
        
        obj.switchTo().frame(0);
        WebElement wb=obj.findElementById("Click");
        wb.click();
        String res=wb.getText();
        System.out.println(res);
        obj.switchTo().defaultContent();
        
        obj.switchTo().frame(2);
        obj.switchTo().frame("frame2");
        WebElement wb1=obj.findElementByXPath("/html/body/button");
        wb1.click();
        String val=wb1.getText();
        System.out.println(val);
        
        obj.switchTo().defaultContent();
        List<WebElement> result=obj.findElements(By.tagName("iframe"));
        int totalframes=result.size();
        System.out.println("Number of frames:" + totalframes);
        obj.close();
	}

}
