package week5.code;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCard {
	
	public static void showList(List<Object> list) {
		
		for(Object o:list) {
			System.out.println(o);
		}
		list.add("test");
	}

	public static void main(String[] args) {
		List<Double> doubles = new ArrayList<Double>();
		doubles.add(12.2);
		
		List<String> names = new ArrayList<String>();
		names.add("Sean");
//		showList(names);
//		showList(doubles);
	}

}
