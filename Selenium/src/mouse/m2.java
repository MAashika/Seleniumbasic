package mouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://jqueryui.com/droppable/");
		
		//switch your control to that frame
		//frame or index or name
		
		obj.switchTo().frame(0);
		WebElement wb1=obj.findElementByXPath("//*[@id=\'draggable\']");
		WebElement wb2=obj.findElementByXPath("//*[@id=\'droppable\']");
		
		Actions res=new Actions(obj);
		res.dragAndDrop(wb1,wb2).build().perform();
		
		obj.close();
		
		
	}

}
