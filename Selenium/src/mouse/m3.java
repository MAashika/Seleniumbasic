package mouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://jqueryui.com/slider/");
		
		//drag and dropby
		obj.switchTo().frame(0);
		WebElement wb1=obj.findElementByXPath("//*[@id=\'slider\']/span");
		Actions res=new Actions(obj);
		res.dragAndDropBy(wb1, 70, 0).build().perform();
		obj.close();

	}

}
