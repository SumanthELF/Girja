package oneBill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy {

	@Test
	public void demo() {
		Assert.fail();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	}

}
