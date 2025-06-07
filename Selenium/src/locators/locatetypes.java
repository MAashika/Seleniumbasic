package locators;



import org.openqa.selenium.Alert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locatetypes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://www.saucedemo.com/v1/");
       
        
        WebElement a=obj.findElementById("user-name");
        a.sendKeys("standard_user");
        
        WebElement b=obj.findElementById("password");
        b.sendKeys("secret_sauce");
        WebElement c=obj.findElementByClassName("btn_action");
        c.click();
     

                Alert t=obj.switchTo().alert();
        t.accept();
        
        
        //obj.manage().window().maximize();
       // obj.findElementByXPath("//*[@id=\'item_4_title_link\']/div").click();
        //Thread.sleep(3000);
        //obj.findElementByClassName("inventory_details_back_button").click();
        
        //Alert t=obj.switchTo().alert();
       // t.accept();
        
        
       /*obj.findElementByClassName("btn_primary btn_inventory").click();
       obj.findElementByCssSelector("#menu_button_container > div > div:nth-child(3) > div > button").click();*/
		
	



	}
	

}