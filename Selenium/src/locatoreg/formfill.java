package locatoreg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class formfill {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");

	

		obj.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input").sendKeys("Aashika");
		obj.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input").sendKeys("M");
		obj.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea").sendKeys("Nagercoil");
		obj.findElementByXPath("//*[@id=\"eid\"]/input").sendKeys("aashika@gmail.com");
		obj.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input").sendKeys("9698162016");
        obj.findElementByXPath("//*[@id=\'basicBootstrapForm\']/div[5]/div/label[2]/input").click();
        obj.findElementById("checkbox1").click();
        obj.findElementById("checkbox2").click();
        obj.findElementById("checkbox3").click();
        
      
        
        WebElement value=obj.findElementByXPath("/html/body/section/div/div/div[2]/form/div[8]/div/select");
        Select select=new Select(value);
        select.selectByIndex(4);
        
        
       

    
      
        
        WebElement value2=obj.findElementByXPath("//*[@id=\'yearbox\']");
        Select res1=new Select(value2);
        res1.selectByVisibleText("2003");
        
        WebElement value3=obj.findElementByXPath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select");
        Select month=new Select(value3);
        month.selectByIndex(5);
        
        WebElement value4=obj.findElementByXPath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select");
        Select date=new Select(value4);
        date.selectByIndex(5);
        
        obj.findElementById("firstpassword").sendKeys("Aashi@15");
        obj.findElementById("secondpassword").sendKeys("Aashi@15");
       // obj.findElementById("submitbtn").click();
        obj.manage().window().maximize();
        
        
       obj.findElement(By.xpath("//*[@id=\'imagesrc\']")).sendKeys("C:\\\\Users\\\\maash\\\\OneDrive\\\\Documents\\\\Aashika mock resume23.pdf");
       
		/*mouse.click();
Actions click=new Actions(obj);
click.doubleClick(mouse).build().perform();
Thread.sleep(3000);

	StringSelection file=new StringSelection("C:\\Users\\maash\\OneDrive\\Documents\\download.xls");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
	Robot res=new Robot();
	res.keyPress(KeyEvent.VK_CONTROL);
	res.keyPress(KeyEvent.VK_V);
	res.keyRelease(KeyEvent.VK_CONTROL);
	res.keyRelease(KeyEvent.VK_V);
	res.keyPress(KeyEvent.VK_ENTER);
	res.keyRelease(KeyEvent.VK_ENTER);*/
	
	
	
	
        
       
        
        
        
        
        
	}
}
