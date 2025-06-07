package mouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.mycontactform.com/");
		
		//1.click
		//2.double click
		//3.right click or context click
		//4.mouse overring
		//5.click hold and release
		//6.drag and drop
		//7.drag and drop by
		
		//create an object for action class
		//pass obj instance as input
		
		
		WebElement mouse=obj.findElementByName("btnSubmit");
		Actions click=new Actions(obj);
		//click.click(mouse).build().perform();
		
		//click.doubleClick(mouse).build().perform();
		
		//click.contextClick(mouse).build().perform();
		
		//click.moveToElement(mouse).build().perform();
		
		click.clickAndHold(mouse).build().perform();
		Thread.sleep(3000);
		click.release(mouse).build().perform();
		
		obj.close();
		
		
		
		
		
		
	}

}
