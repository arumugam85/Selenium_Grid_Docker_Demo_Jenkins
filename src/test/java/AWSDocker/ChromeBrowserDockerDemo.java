package AWSDocker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeBrowserDockerDemo {

	static RemoteWebDriver driver;

	@Test
	public void firstTest() throws InterruptedException, MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.CHROME);
		// driver = new ChromeDriver();
		System.out.println("Set remote driver for Chrome");
		URL url = new URL("http://localhost:4445/wd/hub");
		try {
			driver = new RemoteWebDriver(url, cap);
			System.out.println("Remote driver setup is success for chrome");
		} catch (Exception e) {
			System.out.println("Remote driver setup failed for chrome");
		}
		System.out.println("Launch Chrome Browser");
		// driver.manage().window().maximize();
		System.out.println("************Chrome Browser Launch OHRM	 Application**************");
		try {
			driver.get("https://opensource-demo.orangehrmlive.com/");
		} catch (Exception e) {
			System.out.println("Unable to launch OHRM url");
		}
		Thread.sleep(3000);
		System.out.println("************Enter User name************");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		System.out.println("**********Enter password*********");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("************Submitted****************");
		Thread.sleep(4000);
		System.out.println("*********Title of the page is: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		driver.quit();

	}

	// @AfterMethod
	// public void tearDown() {
	// driver.quit();
	// System.out.println("browser closed");
	// }

}
