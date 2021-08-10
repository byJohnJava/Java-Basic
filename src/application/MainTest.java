package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("João");
		list.add("Pablo");
		list.add("Gabriela");
		list.add("Vanda");
		list.add("Victor");
		list.add(2, "José");
		
		System.out.println(list.size());
		
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("------------------------");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'J');
		
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("------------------------");
		System.out.println("Index of Gabriela: " + list.indexOf("Gabriela"));
		
		System.out.println("------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList());
		
		for(String name : result) {
			System.out.println(name);
		}
		
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
		System.out.println(name);
	}

}
