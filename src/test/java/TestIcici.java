import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestIcici {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ("user.dir")+"C:\\Users\\91903\\Desktop\\tinku\\j\\MevanProject2\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/");
		

	}

}
