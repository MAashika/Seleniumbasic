package locatoreg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gmaillogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://mail.google.com/mail/u/0/");
		
		obj.manage().window().maximize();
		obj.findElementByXPath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span").click();
        obj.findElementByXPath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]").click();
        obj.findElementById("firstName").sendKeys("Aashika");
        obj.findElementByXPath("//*[@id=\"collectNameNext\"]/div/button/span").click();
       // WebElement value=obj.findElementByXPath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[1]/div[1]/div");
        //value.click();
        //WebElement val=obj.findElementByXPath("//*[@id=\"month\"]/div/div[2]/ul/li[3]");
        //val.click();
        obj.findElement(By.className("VfPpkd-TkwUic VfPpkd-ksKsZd-mWPk3d-OWXEXe-AHe6Kc-XpnDCe VfPpkd-ksKsZd-mWPk3d")).click();
        obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[2]/div[1]/div[1]/div/div[2]/ul/li[1];")).click();
	}

}
