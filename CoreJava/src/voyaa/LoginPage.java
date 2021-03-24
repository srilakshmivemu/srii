package voyaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	@Test
	public void run() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sv21045\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.voyaah.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
