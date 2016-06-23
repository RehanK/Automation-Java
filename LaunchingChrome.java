package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {
	 
	public static void main(String[] args) throws InterruptedException {
		String exePath = "C:\\Users\\rkhan\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com in Chrome");
 
        driver.findElement(By.xpath("//button[@id='submit']")).click();
       
        
		//Wait for 5 Sec
		Thread.sleep(2);
		
        // Close the driver
        driver.close();
        

	}

}
