package executescript;

import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		
		obj.executeScript("document.body.style.zoom='150%'");
		Thread.sleep(3000);
		obj.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(3000);
		obj.executeScript("document.body.style.zoom='50%'");
		obj.close();

	}

}
