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
        
        Thread.sleep(2000);
        WebElement value2=obj.findElementById("j_idt87:city_label");
        value2.click();
        Thread.sleep(2000);
        WebElement val2=obj.findElementById("j_idt87:city_2");
        val2.click();
        
        Thread.sleep(2000);
        WebElement choose=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/button");
        choose.click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/span/ul/li[2]").click();
        WebElement choose1=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/button");
        choose1.click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/span/ul/li[6]").click();
        
        Thread.sleep(2000);
        obj.findElementById("j_idt87:lang_label").click();
        Thread.sleep(2000);
        obj.findElementById("j_idt87:lang_2").click();
        
        Thread.sleep(2000);
        obj.findElementById("j_idt87:value_label").click();
        obj.findElementById("j_idt87:value_1").click();
        
        obj.quit();
        
        
        
        
        
	}

}
