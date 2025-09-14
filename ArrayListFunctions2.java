package module1.basicjava;

import java.util.ArrayList;

public class ArrayListFunctions2 {

	public static void main(String[] args) 
	{

		ArrayList <String> a = new ArrayList <String> ();
		a.add("kanna");
		a.add("gopi");
		a.add("ramu");
		a.add("ranga");
		a.add("rahul");
		a.add("anu");
		System.out.println(a);
		boolean b = a.contains("gopi");
		System.out.println(b);
		ArrayList <String> a1 = new ArrayList <String> ();
		a1.addAll(a);
		boolean b1 = a1.containsAll(a);
		System.out.println(b1);
		a1.add("suji");
		a1.remove(2);
		System.out.println(a1);
		a1.removeAll(a);
		System.out.println(a1);
		String c = a1.get(0);
		System.out.println(c);
		  
		
	}

}
