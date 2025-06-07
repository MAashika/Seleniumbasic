package button;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://www.letskodeit.com/practice");
        
        WebElement drop=obj.findElementById("carselect");
        Select res=new Select(drop);
        res.selectByIndex(2);
        //res.selectByVisibleText("Benz");
        //res.selectByValue("honda");
        obj.close();
	}

}
