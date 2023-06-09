package curs10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("zero", "unu", "doi", "trei", "patru"));
		
		System.out.println(list.size());
		
		for(String nr: list) {
			System.out.println(nr);
				}
		
		list.subList(1, 3).clear();          //a sters elementele de pe index 1 si 2 si la 3 se opreste
		
		System.out.println("------------------------------------------");
		
		
        System.out.println(list.size());
		
		for(String nr: list) {
			System.out.println(nr);
				}
		
		System.out.println("------------------------------------------");
		
		System.out.println(list.contains("opt"));
		System.out.println(list.contains("zero"));
		
		System.out.println("------------------------------------------");
		
		list.set(0, "noua");
		
		for(String nr: list) {
			System.out.println(nr);
	    }
		
		
		
	}

}
