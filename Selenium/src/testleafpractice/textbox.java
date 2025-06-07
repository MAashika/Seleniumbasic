package testleafpractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class textbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/input.xhtml");
        
       obj.findElementById("j_idt88:name").sendKeys("Aashika.M");
        WebElement ans=obj.findElementById("j_idt88:j_idt91");
        ans.sendKeys(" follow");
       WebElement res=obj.findElementById("j_idt88:j_idt93");
       System.out.println(res.isEnabled());
       WebElement val=obj.findElementById("j_idt88:j_idt95");
       val.clear();
       String val1=obj.findElementById("j_idt88:j_idt97").getAttribute("value");
       System.out.println(val1);
       obj.findElementById("j_idt88:j_idt99").sendKeys("aashi@gmail.com");
       obj.findElementById("j_idt88:j_idt99").sendKeys(Keys.TAB);
       Thread.sleep(2000);
       obj.findElementById("j_idt88:j_idt101").sendKeys("My name is Aashika.I'm from nagercoil.currently I am doing software testing course in Alo educational hub.");
       //obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[8]/div/div/div[2]/div[1]").sendKeys("My name is Aashika.");
       obj.findElementById("j_idt106:thisform:age").sendKeys(Keys.ENTER);
       obj.findElementById("j_idt106:float-input").click();
       WebElement val2=obj.findElementById("j_idt106:auto-complete_input");
       val2.sendKeys("Aashika");
       Thread.sleep(2000);
      obj.findElementByXPath("//*[@id=\'j_idt106:auto-complete_panel\']/ul/li[3]").click();
      
      
      
        
       
        obj.findElementByName("j_idt106:j_idt116_input").click();
        Thread.sleep(3000);
        for(int i=0;i<6;i++)
        {
        	obj.findElementByCssSelector("#j_idt106\\:j_idt116_panel > div > div.ui-datepicker-header.ui-widget-header.ui-helper-clearfix.ui-corner-all > a.ui-datepicker-next.ui-corner-all").click();
        }
        obj.findElementByXPath("/html/body/div[6]/div/div[2]/table/tbody/tr[2]/td[6]/a").click();
       /* obj.findElementById("j_idt106:j_idt118_input").sendKeys("5");
        for(int i=0;i<2;i++)
        {
        	obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/div/div[2]/div/span[3]/a[1]").click();
        }*/
       obj.findElementById("j_idt106:j_idt118_input").sendKeys("5");
        for(int i=5;i>2;i--)
        {
        	obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/div/div[2]/div/span[3]/a[2]").click();
        }
        obj.findElementById("j_idt106:slider").sendKeys("50");
        obj.findElementById("j_idt106:j_idt122").click();
        
        
	}

}
