package navigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class n2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		obj.manage().window().maximize();
		
		obj.executeScript("window.open('https://leafground.com/button.xhtml','_blank');");
		
		String parent=obj.getWindowHandle();//get the parent window datas
		Set<String>s1=obj.getWindowHandles();//get both parent and child window datas
		
		Iterator<String>I1=s1.iterator();
		//hashnext--is the content is there
		//next--read the content
		
		while(I1.hasNext())
		{
			String child=I1.next();
			if(!parent.equals(child))
			{
				obj.switchTo().window(child);
				System.out.println(obj.getTitle());
				Thread.sleep(3000);
				obj.findElementById("j_idt88:j_idt90").click();
				obj.navigate().back();
				
				System.out.println(obj.findElementById("j_idt88:j_idt92").isSelected());
				
				WebElement res=obj.findElementById("j_idt88:j_idt94");
				System.out.println(res.getLocation());
				obj.close();
			
			}
		}
		obj.switchTo().window(parent);
		System.out.println(obj.getTitle());
		Thread.sleep(2000);
		obj.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input").sendKeys("Aashika");
		obj.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input").sendKeys("M");
		obj.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea").sendKeys("Nagercoil");
		obj.findElementByXPath("//*[@id=\"eid\"]/input").sendKeys("aashika@gmail.com");
		obj.findElementByXPath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input").sendKeys("9698162016");
        obj.findElementByXPath("//*[@id=\'basicBootstrapForm\']/div[5]/div/label[2]/input").click();
		obj.close();
	}

}
