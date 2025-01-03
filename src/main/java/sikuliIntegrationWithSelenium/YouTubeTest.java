package sikuliIntegrationWithSelenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class YouTubeTest {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Chrome webdriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// custom wait:
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://www.ebay.com/");
		
		Screen screen = new Screen();
		System.out.println(new File("C:/Users/2160843/OneDrive - Cognizant/Desktop/Sikuli images for selenium/Catagory.png").exists());
		
//		//Catagories:
		Pattern pattern = new Pattern("C:\\Users\\2160843\\OneDrive - Cognizant\\Desktop\\Sikuli images for selenium\\Catagory.png").similar(0.8);
		Thread.sleep(2000); // Wait for 2 seconds
		Region region = new Region(150, 40, 1100, 400); // Adjust the region as needed
		region.highlight(2); // Highlights the region for 2 seconds
		System.out.println("Image path: " + pattern.getFilename());
		region.wait(pattern, 10); // Wait for up to 10 seconds for the image to appear
		region.click(pattern);
		region.click(pattern);
	
//		//pause:
//		Pattern pauseImg=new Pattern("");
//		s.wait(pauseImg,2000);
//		s.click();
//		s.click();
//		s.click();
//		
//		//Play
//		Pattern playImg=new Pattern("");
//		s.wait(playImg,2000);
//		s.click();
//		s.click();
		
		driver.quit();
		
		
		
	}

}
