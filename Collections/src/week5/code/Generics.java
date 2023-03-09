package week5.code;

import java.util.ArrayList;
import java.util.List;

public class Generics {
public static void main(String[] args) {
	List myList = new ArrayList();
	myList.add("Fred");
	myList.add(43);
	
	String s1 = (String) myList.get(0);
	System.out.println(myList);
	String s2 = (String)myList.get(1);
	Integer s3 = (Integer)myList.get(0);
	Integer s4 = (Integer)myList.get(1);
	
	System.out.print(s1 + " " + s2);
	System.out.print(s3 + " " + s4);
	
	}
	
}
