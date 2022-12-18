package basics;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTitleMethod 
{

	private static final Object ExpectedTitle = null;

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver","./New folder/chromedriver.exe");
	  ChromeDriver refVar=new ChromeDriver();
	  refVar.get("https://www.amazon.com");
       String ExpectedTitle="Amazon.com. Spend less. Smile more";
       String titleofwebpage=refVar.getTitle();
       System.out.println(titleofwebpage);
      if (ExpectedTitle.equals(titleofwebpage))
    	  System.out.println("Test Case Passed");
      else
    	  System.out.println("Test Case Failed");
    	   
    	   
	}

}
