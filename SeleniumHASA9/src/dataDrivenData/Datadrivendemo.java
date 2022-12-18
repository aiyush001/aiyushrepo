package dataDrivenData;

import java.util.ArrayList;
import java.util.HashMap;

public class Datadrivendemo {

	public static void main(String[] args) 
	{
		//ArrayList<String>list=new ArrayList<>();
		//list.add("url http://demo.actitime.com/");
		//list.add("admin");
	   //list.add("manager");//if we add chrome then 2nd index will be chrome and manager will move to next index,so we don't go for arraylist
		//System.out.println(list.get(2));//output will be chrome instead of manager

		
		
		HashMap<String, String> map=new HashMap<>();
		map.put("url", "url http://demo.actitime.com/");
		map.put("username", "admin");
		map.put("password", "manager");
		map.put("browser", "chrome");
		System.out.println(map.get("password"));
	}

}
