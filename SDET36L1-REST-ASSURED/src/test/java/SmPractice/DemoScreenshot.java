package SmPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	/*	TakesScreenshot t = (TakesScreenshot) driver;
		t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/ss.png");
		FileUtils.copyFile(dest, dest);*/

	}

}
