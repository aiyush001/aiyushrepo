package basics;
import org.openqa.selenium.chrome.ChromeDriver;
public class getWindowHandle 
{
public static void main(String[] args) 
   {
	System.setProperty("webdriver.chrome.driver","./New folder/chromedriver.exe");
	ChromeDriver refVar=new ChromeDriver();
	refVar.get("https://www.amazon.com");
	System.out.println(refVar.getWindowHandle());
   }
}
