package testleafpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/button.xhtml");
        
        obj.findElementById("j_idt88:j_idt90").click();
		obj.navigate().back();
		
		System.out.println(obj.findElementById("j_idt88:j_idt92").isSelected());
		
		WebElement res=obj.findElementById("j_idt88:j_idt94");
		System.out.println(res.getLocation());
		
		WebElement colour=obj.findElementById("j_idt88:j_idt96");
		String val=colour.getCssValue("color");
		System.out.println("colour of the button is:"+ val);
		
        WebElement size=obj.findElementById("j_idt88:j_idt98");
        int height=size.getSize().getHeight();
        int width=size.getSize().getWidth();
        System.out.println("Height of the button is:"+ height);
        System.out.println("Width of the button is:"+ width);
        
        WebElement mouseover=obj.findElementById("j_idt88:j_idt100");
        Actions res1=new Actions(obj);
        res1.moveToElement(mouseover).build().perform();
        
        obj.findElementById("j_idt88:j_idt102:imageBtn").click();
        obj.findElementById("j_idt88:j_idt102:imageBtn").click();
        
        List<WebElement>count=obj.findElements(By.tagName("button"));
        int value=count.size();
        System.out.println("Number of rounded buttons:"+ value);
        
	}

}
