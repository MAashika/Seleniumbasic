package button;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checklist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://www.letskodeit.com/practice");
        WebElement value=obj.findElementById("multiple-select-example");
        Select res=new Select(value);
        res.selectByValue("apple");
        res.selectByIndex(2);
        res.selectByVisibleText("Orange");
        Thread.sleep(3000);
        res.deselectByVisibleText("Orange");
        obj.quit();
        

	}

}
