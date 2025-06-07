package executescript;

import org.openqa.selenium.chrome.ChromeDriver;

public class e1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		
		System.out.println(obj.executeScript("return document.title" ));
		System.out.println(obj.executeScript("return document.URL"));

	}

}
