package testleafpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class dashboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/dashboard.xhtml");
        
        obj.findElementById("j_idt107").click();
        obj.findElementById("j_idt109").click();
        obj.findElementById("j_idt111").click();
        obj.findElementById("j_idt113").click();
        obj.findElementById("j_idt115").click();
        obj.findElementById("j_idt117").click();
        obj.findElementById("j_idt119").click();
        
        obj.findElementById("email").sendKeys("aashika03@gmail.com");
        obj.findElementById("message").sendKeys("Hiii,How are you...");
        obj.findElementById("j_idt130").click();
       obj.executeScript("window.scrollBy(0,1200)");
        
        obj.findElementByXPath("//*[@id=\'schedule\']/div[1]/div[1]/div/button[1]").click();
        Thread.sleep(3000);
        obj.findElementByXPath("//*[@id=\'schedule\']/div[1]/div[1]/button").click();
        Thread.sleep(3000);
        obj.findElementByXPath("//*[@id=\'schedule\']/div[1]/div[1]/div/button[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("//*[@id=\'schedule\']/div[1]/div[3]/div/button[3]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("//*[@id=\'schedule\']/div[1]/div[3]/div/button[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("//*[@id=\'schedule\']/div[1]/div[3]/div/button[1]").click();
        
        obj.executeScript("window.scrollBy(0,1900)");
        obj.findElementById("productsTable:j_idt198").click();
        Thread.sleep(2000);
        obj.findElementById("productsTable:j_idt200").click();
        Thread.sleep(2000);
        obj.findElementById("productsTable:j_idt202").click();
        Thread.sleep(2000);
        obj.findElementById("productsTable:j_idt204").click();
        
        Thread.sleep(3000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/div/div/div[13]/div/div[2]/div/div[2]/span/a[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/div/div/div[13]/div/div[2]/div/div[2]/span/a[3]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/div/div/div[13]/div/div[2]/div/div[2]/span/a[4]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/div/div/div[13]/div/div[2]/div/div[2]/span/a[5]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/div/div/div[13]/div/div[2]/div/div[2]/span/a[6]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/div/div/div[13]/div/div[2]/div/div[2]/span/a[1]").click();
        
        obj.findElementById("layout-config-button").click();
        obj.findElementByXPath("/html/body/div[1]/div[4]/form/table[1]/tbody/tr[1]/td/div/div[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[4]/form/table[1]/tbody/tr[2]/td/div/div[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[4]/form/table[1]/tbody/tr[3]/td/div/div[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[4]/form/table[1]/tbody/tr[4]/td/div/div[2]").click();
        
        obj.findElementByXPath("/html/body/div[1]/div[4]/form/table[2]/tbody/tr[1]/td/div/div[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[4]/form/table[2]/tbody/tr[2]/td/div/div[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[4]/form/table[2]/tbody/tr[3]/td/div/div[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[4]/form/table[3]/tbody/tr[2]/td/div").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[4]/form/table[3]/tbody/tr[1]/td/div/div[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[4]/form/table[4]/tbody/tr[1]/td/div/div[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[4]/form/table[4]/tbody/tr[2]/td/div/div[2]").click();
        obj.close();
        
	}

}
