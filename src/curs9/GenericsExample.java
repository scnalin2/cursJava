package curs9;

public class GenericsExample {

	public static void main(String[] args) {

		printDetails(123, true);
		printDetails("Text", 'c');
		printDetails(123.5, 'e');
		
	}
	
	
	public static <T> void printDetails(T obj, T obj1) {           //T data type de tip generic
		System.out.println("Data type pentru obiect " + obj + " este " +  obj.getClass().getName());
		System.out.println("Data type pentru obiect " + obj1 + " este " +  obj1.getClass().getName());
	}
	

}
