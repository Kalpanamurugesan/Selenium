package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.StaleElementReferenceException;


public class Practice {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","./drivee/chromedriver.exe");
//		ChromeOptions op=new ChromeOptions();
//		op.setHeadless(true);
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://github.com");
		System.out.println(driver.getCurrentUrl());
//		driver.findElement(By.name("login")).sendKeys("2012110@nec.edu.in");
//		driver.findElement(By.name("password")).sendKeys("Kalpana12%");
//		driver.findElement(By.name("commit")).click();
		//find text from  a web page 
		//String s=driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div/div/div/main/div[1]/div/div/div[1]/h3")).getText();
		//System.out.println(s);
	driver.navigate().to("http://172.16.1.1:8090/httpclient.html");
		
		driver.navigate().back();
//		System.out.println(driver.getCurrentUrl());
//		driver.navigate().forward();
//		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();

	}

}
