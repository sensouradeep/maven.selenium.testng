package maven.selenium.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SOURADEEP\\Desktop\\Selenium\\exe Files\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("souradeep.sen701@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		String at = driver.getTitle();
		String et = "Gmail";
		driver.close();
		if(at.equalsIgnoreCase(et))
			System.out.println("Test Successful\n");
		else
			System.out.println("Text Failure\n");
	}

}

