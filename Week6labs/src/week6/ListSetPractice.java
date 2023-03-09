package week6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListSetPractice {

	public static void main(String[] args) {
	factoryMethods();
	listOfNames();
	}
	public static void factoryMethods() {
		
		String[] myArray = new String[] { "A", "B", "C" };
		List<String> asList = Arrays.asList(myArray);
		asList.add("D");
		System.out.println(asList.addAll(asList));
		List.of();
		List.copyOf(null);
	}
	public static void listOfNames() {
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new LinkedList<>();
		List<String> l3 = new Stack<>();
		
		List<String> myList = new ArrayList<>();
		Collection<String> c2 = new LinkedList<>();
		Collection<String> c3 = new Stack<>();
		
		ArrayList<String> a1 = new ArrayList<>();
		LinkedList<String> a2 = new LinkedList<>();
		Stack<String> a3 = new Stack<>();
		
		myList.add("Amy");
		myList.add("Betty");
		myList.indexOf(a3);
		System.out.println(myList);
		

		
//		myList["Amy","Betty","Doris","Enda","Feena"]
	}
	public static void stacks() {
		
	}
	public static void linkedLists() {
		
	}
	public static void treesets() {
		
	}
	public static void hashSet() {
		
	}
	

}
