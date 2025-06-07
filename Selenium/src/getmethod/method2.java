package getmethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class method2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://mail.google.com/mail/");
		
		System.out.println(obj.getTitle());
		System.out.println(obj.getCurrentUrl());
		
		
		System.out.println(obj.manage().window().getSize());//height and width of the window
		System.out.println(obj.manage().window().getPosition());//x and y value of the window
		
		obj.close();
	}

}
