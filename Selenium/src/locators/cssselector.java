package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\maash\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		ChromeDriver obj=new ChromeDriver();
		obj.get("https://www.saucedemo.com/v1/");
		
		//1.tagname and id....syntax: tagname#id
		//obj.findElementByCssSelector("input#user-name").sendKeys("Aashika");
		
		//2.tagname and classname...syntax: tagname.classname
		obj.findElementByCssSelector("input.form_input").sendKeys("standard_user");
		
		//3.tagname and attribute....syntax: tagname[attribute='value']
		//obj.findElementByCssSelector("input[placeholder='Password']").sendKeys("Aashi@15");
		
		//4.tagname and prefix of attributes....syntax: tagname[attribute^='prefix value']
		//obj.findElementByCssSelector("input[placeholder^='Pass']").sendKeys("Aashi@15");
		
		//5.tagname and suffix of attributes....syntax: tagname[attribute$='suffixvalue']
		//obj.findElementByCssSelector("input[placeholder$='word']").sendKeys("Aashi@15");
		
		//6.tagname and substring of attributes....syntax: tagname[attributes*='substring value']
		//obj.findElementByCssSelector("input[placeholder*='sswo']").sendKeys("Aashia@15");
		
		//7.tagname,classname and attribute....syntax: tagnmae.classname[attribute='value']
		obj.findElementByCssSelector("input.form_input[placeholder='Password']").sendKeys("secret_sauce");
		
		
		//another type....copy CSSselector
		obj.findElementByCssSelector("#login-button").click();

	}

}