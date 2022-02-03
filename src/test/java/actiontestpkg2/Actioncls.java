package actiontestpkg2;

import propertiespkg.propcls;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import propertiespkg.propcls;

public class Actioncls {
	
	public static final CharSequence productName = null;
	public static WebDriver driver;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void navigate() throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(propcls.getDataFromProp("url"));
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void searchFunc(String searchData) throws Exception {
		WebElement element1 = driver.findElement(By.xpath("//input[@name='field-keywords']"));

		element1.sendKeys(searchData);
	}

	public static void clickSearchBtn() {
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	public static void waitFor() throws Exception {
		Thread.sleep(2000);
	}

	public static void verifyTitle(String searchStr) {

		Assert.assertEquals(driver.getTitle(), "Amazon.com : " + searchStr);
		Reporter.log("Title Verified: " + driver.getTitle(), true);
	}

	public static void closeBrowser() {
		driver.quit();
	}

}
