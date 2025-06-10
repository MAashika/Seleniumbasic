package teatleafpart2;

import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/table.xhtml");
        
        obj.findElementById("form:j_idt89:j_idt92").click();
        obj.findElementById("form:j_idt89:j_idt94").click();
        obj.findElementById("form:j_idt89:j_idt97").click();
        obj.findElementById("form:j_idt89:j_idt100").click();
        obj.findElementById("form:j_idt89:j_idt102").click();
        obj.findElementById("form:j_idt89:j_idt104").click();
        
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div/div/div/div[5]/span/a[1]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div/div/div/div[5]/span/a[2]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div/div/div/div[5]/span/a[3]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div/div/div/div[5]/span/a[4]").click();
        Thread.sleep(2000);
        obj.findElementByXPath("/html/body/div[1]/div[5]/div[2]/form/div/div/div/div/div[5]/span/a[5]").click();
        
        obj.findElementById("form:j_idt89:globalFilter").sendKeys("India");

	}

}
