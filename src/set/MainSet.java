package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		set.removeIf(x -> x.equalsIgnoreCase("TABLET")); //Lê-se x -> "tal que" x alguma coisa (alguma condição)
		
		for (String p : set) {
			System.out.println(p);
		}

	}

}
