package gitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GitDemo {

	public class HomePage {

		WebDriver driver;

		@BeforeTest
		public void startUp() {
			System.setProperty("webdriver.gecko.driver", "E:\\Automation\\software\\drivers\\windows\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser is launched");

			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();
		}

		@Test
		public void homepage() throws InterruptedException {

			driver.get("https://git-scm.com/");

			driver.findElement(By.id("nav-about")).click();
			System.out.println("About page is opened");

			Thread.sleep(1000);

			driver.close();
		}

	}
}
