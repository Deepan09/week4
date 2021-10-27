package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTableERail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://erail.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElementByXPath("//button[contains(text(),'Advanced')]").click();
driver.findElementByLinkText("Proceed to erail.in (unsafe)").click();
WebElement stationFrom = driver.findElementById("txtStationFrom");
stationFrom.clear();
stationFrom.sendKeys("Ms" + "\n");
WebElement stationTo = driver.findElementById("txtStationTo");
stationTo.clear();
stationTo.sendKeys("Mdu" +"\n");
driver.findElementById("chkSelectDateOnly").click();
WebElement webtable = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
List<WebElement> trainList = webtable.findElements(By.tagName("tr"));
//WebElement webTable = driver.findElement(By.className("DataTable TrainList TrainListHeader"));

//List<WebElement> rowList = webTable.findElements(By.tagName("tr"));
int size = trainList.size();
System.out.println("the number of trains= " +size );

	}

}
