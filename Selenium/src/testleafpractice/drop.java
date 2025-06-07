package testleafpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/select.xhtml");
        
        WebElement value=obj.findElementByXPath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select");
        Select res=new Select(value);
        res.selectByIndex(2);
        
        WebElement value1=obj.findElementById("j_idt87:country_label");
        value1.click();
        Thread.sleep(2000);
        WebElement val=obj.findElementById("j_idt87:country_2");
        val.click();
        
       /* WebElement value2=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/div");
        value2.click();
        Thread.sleep(2000);
        WebElement val2=obj.findElementByXPath("//*[@id=\'j_idt87:city_1\']//li");
        val2.click();*/
        obj.findElementById("j_idt87:auto-complete").sendKeys("React");
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/span/ul/li[5]").click();
        
        obj.findElementById("j_idt87:lang_label").click();
        Thread.sleep(2000);
        obj.findElementById("j_idt87:lang_2").click();
        
        
        
        
        
	}

}
