import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ab {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Properties p=new Properties();
		p.load(new FileInputStream("./abc.properties"));
		String s = p.getProperty("url");
		driver.get(s);
		driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));

	}

}
