package week4.day1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("home").click();
		String title = driver.getTitle();
		System.out.println(title);
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandlesList= new ArrayList<String>(windowHandlesSet);
		windowHandlesList.get(1);
		driver.switchTo().window(windowHandlesList.get(1));
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		System.out.println(windowHandlesList.size());
		
		
		
	
	}

}
