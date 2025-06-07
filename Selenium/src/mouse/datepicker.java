package mouse;

import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://jqueryui.com/datepicker/");
		
		obj.switchTo().frame(0);
		obj.findElementById("datepicker").click();
		for(int i=0;i<5;i++)
		{
			obj.findElementByXPath("/html/body/div/div/a[2]").click();
		}
		obj.findElementByXPath("/html/body/div/table/tbody/tr[3]/td[4]/a").click();
		

	}

}
