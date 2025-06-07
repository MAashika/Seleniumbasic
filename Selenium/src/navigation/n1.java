package navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class n1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.google.co.in/");
		obj.manage().window().maximize();
		
		obj.findElementByXPath("/html/body/div[1]/div[1]/div/div/header/div[1]/div[2]/a").click();
		Thread.sleep(3000);
		obj.navigate().back();
		Thread.sleep(3000);
		obj.navigate().forward();
		obj.close();
		

	}

}

