package testleafpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/checkbox.xhtml;jsessionid=node0y0fsd6vx9alc2514zlrcm4xx1901727.node0");
        
        obj.findElementById("j_idt87:j_idt89").click();
        obj.findElementById("j_idt87:j_idt91").click();
        
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[1]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[2]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[3]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[4]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[5]/div/div[2]").click();
        
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div/div/div[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div/div/div[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div/div/div[2]").click();
        
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div[2]").click();
        
        WebElement check=obj.findElementById("j_idt87:j_idt102");
        Boolean checking= check.isSelected();
        System.out.println(checking);
        
        obj.findElementById("j_idt87:multiple").click();
        obj.findElementByXPath("/html/body/div[7]/div[2]/ul/li[1]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[7]/div[2]/ul/li[2]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[7]/div[2]/ul/li[3]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[7]/div[2]/ul/li[4]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[7]/div[2]/ul/li[5]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[7]/div[2]/ul/li[6]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[7]/div[2]/ul/li[7]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[7]/div[2]/ul/li[8]/div/div[2]").click();
        obj.findElementByXPath("/html/body/div[7]/div[2]/ul/li[9]/div/div[2]").click();
        
        Thread.sleep(3000);
        obj.quit();

	}

}