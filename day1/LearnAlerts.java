package week4.day1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Alert.html");
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("//button[contains(text(),'Alert Box')]").click();
Alert alert = driver.switchTo().alert();
String text1 = alert.getText();
System.out.println( "simple alert box text: " +text1);
alert.accept();

driver.findElementByXPath("//button[contains(text(),'Confirm Box')]").click();

String text2 = alert.getText();
System.out.println( "simple alert box text: " +text2);
alert.accept();
String textmsg = driver.findElementById("result").getText();
String str="You pressed OK!";
if (textmsg.equals(str)) {
	System.out.println("hi you have pressed ok button");
} else {
System.out.println("hi you have pressed the cancel button");
}

driver.findElementByXPath("//button[contains(text(),'Prompt Box')]").click();
alert.sendKeys("TestLeaf");
alert.accept();
String textmsg2 = driver.findElementById("result1").getText();
System.out.println(textmsg2);


	}

}
