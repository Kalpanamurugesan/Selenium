package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"./drivee/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		driver.findElement(By.name("login")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("commit")).click();
		String at="GitHu";
		String t=driver.getTitle();
		if(at.equals(t)) {
			System.out.println("login successfully");
		}
		else {
			System.out.println("failed");
		}
		driver.close();
		

	}

}
