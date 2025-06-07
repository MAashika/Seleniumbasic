package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class cook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://www.google.co.in/");
        
        Set<Cookie> s=obj.manage().getCookies();
        System.out.println("Number of cookies are:" + s.size());
        
        obj.manage().deleteAllCookies();
        
        Set<Cookie>r=obj.manage().getCookies();
        System.out.println("Number of cookies after deletion:" + r.size() );
        
        obj.close();

	}

}
