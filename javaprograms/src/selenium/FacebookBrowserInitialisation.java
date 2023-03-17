package selenium;
/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookBrowserInitialisation {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kasir\\eclipse-workspace\\Selenium -Workspace\\javaprograms\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//To launch the website of facebook we need to enter the url of the facebook, We can navigate or get to launch the website
		//driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.facebook.com/");
		
		// use string to store the current url and then print it by using the url reference;
		String url =driver .getCurrentUrl();
		System.out.println( "URl of the page :"+ url);
		
		//getTitle is used to get the title of the current page
		String title =driver.getTitle();
		System.out.println("Title of the page is :"+ title);
		
		
		//Navigate is used to navigate the page either forward or  backward
		driver .navigate().back();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver .navigate().forward();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//PageSource is used to get the source of the Facebook page
		String pageSource =driver.getPageSource();
		System.out.println("Page Source of the facebook :" + pageSource);
		
		// Maximise the window by using the manage method 
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		// To close the launch window we use the close method
		driver.close();
	 
	}
}*/