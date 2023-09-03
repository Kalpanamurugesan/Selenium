package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

    public static void main(String[] args) {
        // Set the path to your Chrome WebDriver executable
    	System.setProperty("webdriver.chrome.driver",
				"./drivee/chromedriver.exe");
        
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open WhatsApp Web
        driver.get("https://web.whatsapp.com/");
        
        // Wait for the user to scan the QR code and log in manually
        // You can add a WebDriverWait here to ensure the QR code is scanned
        
        // Locate the chat input field and message box
        WebElement chatInput = driver.findElement(By.xpath("//div[@contenteditable='true']"));
        
        // Enter the name of the contact you want to send a message to (replace 'Contact Name')
        chatInput.sendKeys("Contact Name");
        
        // Wait for the contact to load in the chat list
        // You can add a WebDriverWait here to ensure the contact is loaded
        
        // Select the contact by clicking on it
        WebElement contact = driver.findElement(By.xpath("//span[@title='Contact Name']"));
        contact.click();
        
        // Locate the message input field and type your message
        WebElement messageInput = driver.findElement(By.xpath("//div[@contenteditable='true']"));
        messageInput.sendKeys("Hello, this is an automated message.");
        
        // Locate the send button and click it to send the message
        WebElement sendButton = driver.findElement(By.xpath("//span[@data-icon='send']"));
        sendButton.click();
        
        // Close the WebDriver
        driver.quit();
    }
}
