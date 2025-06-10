package testleafpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://leafground.com/waits.xhtml;jsessionid=node03upumliw60xk1ph4gotlp5puq1905503.node0");
        
        
        obj.findElementById("j_idt87:j_idt89").click();
        Thread.sleep(8000);
        
        obj.findElementById("j_idt87:j_idt92").click();
        Thread.sleep(8000);
        
        obj.findElementById("j_idt87:j_idt95").click();
        Thread.sleep(8000);
        
        obj.findElementById("j_idt87:j_idt98").click();
        Thread.sleep(4000);
        
        //obj.close();
	}

}

