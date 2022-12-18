package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowserChrome 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./New folder/chromedriver.exe");
	ChromeDriver refvar=new ChromeDriver();
		refvar.get("https://www.youtube.com/c/NaveenAutomationLabs/playlists");
	}

}
