package week5.code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CollectionsPractice {

	public static void main(String[] args) {
		try {
			listOfNames();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void listOfNames() throws IOException {
		List<String> myList = new ArrayList<>();
		myList.add("Amy");
		myList.add("Betty");
		myList.add("Doris");
		myList.add("Enda");
		myList.add("Feena");
		System.out.println(myList);
		myList.add(myList.indexOf("Doris"),"Conor");
		System.out.println(myList);
		System.out.println(myList.size());
		System.out.println(myList.contains("Marry"));
		System.out.println(myList.contains("Conor"));
		System.out.println(myList.remove("Betty"));
		System.out.println(myList);
		System.out.println(myList.isEmpty());
		
		System.out.println(myList.set(myList.indexOf("Feena"), "Ivan"));
		System.out.println(myList);
	
	}
	
	public static void listOfFruits() {
		
	}

}
