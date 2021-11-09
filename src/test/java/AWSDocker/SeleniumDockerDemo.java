//package AWSDocker;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.Reporter;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class SeleniumDockerDemo {
//
//	public static WebDriver driver;
//
//	@Parameters("browser")
//	@BeforeMethod
//	public void setup(String browser) throws MalformedURLException, InterruptedException {
//
//		if (browser.contains("chrome")) {
//			// ChromeOptions chromeOptions = new ChromeOptions();
//			WebDriverManager.chromedriver().setup();
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setCapability("browserName", "chrome");
//			// driver = new ChromeDriver();
//			URL url = new URL("http://172.19.0.2:4444/wd/hub");
//			try {
//				driver = new RemoteWebDriver(url, cap);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		} else if (browser.contains("fireFox")) {
//			WebDriverManager.firefoxdriver().setup();
//			DesiredCapabilities cap = new DesiredCapabilities();
//			cap.setCapability("browserName", "firefox");
//			// driver = new ChromeDriver();
//			URL url = new URL("http://172.19.0.2:4444/wd/hub");
//			try {
//				driver = new RemoteWebDriver(url, cap);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//	@Test
//	public void loginChromeTest() throws InterruptedException {
//		Reporter.log("launch the Application for OHRM page");
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		System.out.println("Chrome browser launched");
//		Reporter.log("Enter Username and Password");
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
//		String pageTitle = driver.getTitle();
//		Thread.sleep(4000);
//		Reporter.log("Page Title is :" + pageTitle);
//		Thread.sleep(4000);
//		// driver.findElement(By.id("welcome")).click();
//
//	}
//
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//		System.out.println("browser closed");
//	}
//}
