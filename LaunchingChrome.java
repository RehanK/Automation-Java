package automationFramework;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {
	 
    public static void main(String[] args) throws InterruptedException {
	String exePath = "C:\\Users\\rkhan\\Downloads\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com in Chrome");
        
        
        driver.findElement(By.name("firstname")).sendKeys("Bob Jones");
        
        //IsDisplayed Command
        boolean status = driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed();
        
        //IsEnabled Command
        WebElement element = driver.findElement(By.name("lastname"));
        boolean status1 = element.isEnabled();
        // Check that if the Text field is enabled, if yes enter value
        if(status1){
            element.sendKeys("ToolsQA");
        }
        
        //IsSelected Command
        boolean status2 = driver.findElement(By.id("Sex-Male")).isSelected();
        
        //getAttribute Command
        WebElement submitName = driver.findElement(By.id("SubmitButton"));
	String attValue = submitName.getAttribute("id"); //This will return "SubmitButton"
	
        //Submit Command
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        
	//Wait for 5 Sec
	Thread.sleep(2);
		
        // Close the driver
        driver.close();
        

	}

}
