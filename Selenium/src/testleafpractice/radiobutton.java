package testleafpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/radio.xhtml");
        
        
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/table/tbody/tr/td[1]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/table/tbody/tr/td[2]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/table/tbody/tr/td[3]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/table/tbody/tr/td[4]/div/div[2]").click();
        
        WebElement b1=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]");
        Boolean r1=b1.isSelected();
        System.out.println(r1);
        WebElement b2=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/div/div[2]/div/div[2]");
        Boolean r2=b2.isSelected();
        System.out.println(r2);
        WebElement b3=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/div/div[3]/div");
        Boolean r3=b3.isSelected();
        System.out.println(r3);
        
        
        WebElement c1=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[1]/div/div[2]");
        Boolean n1=c1.isSelected();
        System.out.println(n1);
        Thread.sleep(2000);
        WebElement c2=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[2]/div/div[2]");
        Boolean n2=c2.isSelected();
        System.out.println(n2);
        Thread.sleep(2000);
        WebElement c3=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[3]/div/div[2]");
        Boolean n3=c3.isEnabled();
        System.out.println(n3);
        Thread.sleep(2000);
        WebElement c4=obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[4]/div/div[2]");
        Boolean n4=c4.isSelected();
        System.out.println(n4);
        
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]").click();
        
        obj.close();
        
        
	}

}
