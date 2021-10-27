package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.switchTo().frame("iframeResult");
driver.findElementByXPath("//button[text()='Try it']").click();
//driver.switchTo().defaultContent();
Alert alert = driver.switchTo().alert();
alert.accept();


	}

}
