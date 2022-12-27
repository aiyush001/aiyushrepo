package Assignmentsnew;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	/*static
	{
		System.setProperty("WebDriver.chrome.driver","./New folder/chrome.driver.exe");
	}*/
	public static void main(String[] args) throws InterruptedException 
	{
	/*	WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);*/
		
		ArrayList l1=new ArrayList();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		System.out.println(l1);
		ArrayList l2=new ArrayList();
		l2.add("A");
		l2.add("B");
		l2.add("E");
		l2.add("F");
		System.out.println(l2);
		//Additional elements present in l1 list
		//l1.removeAll(l2);
		System.out.println(l1);
		//Missing elements in l1 list can told as the additional elements present in l2 list which is E and F
		//l2.removeAll(l1);
		System.out.println(l2);
		//common elements present in l1 and l2 array list
		l1.retainAll(l2);
		System.out.println(l1);
	}
}


