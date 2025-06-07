package executescript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		
		//to craete alert
		obj.executeScript("alert('timeout')");
        Thread.sleep(3000);
		Alert res=obj.switchTo().alert();
		res.accept();
		Thread.sleep(3000);
		obj.close();
		
	}

}
