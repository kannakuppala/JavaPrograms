package module1.basicjava;

import java.util.ArrayList;

public class ArrayListFunctions1 {

	public static void main(String[] args)
	{
		
		ArrayList <String> a = new ArrayList <String> ();
		a.add("kanna");
		a.add("kanna");
		a.add("kanna");
		a.add("kanna");
		a.add("kanna");
		a.add("kanna");
		System.out.println(a);
		ArrayList <String> a1 = new ArrayList <String> ();
		a1.addAll(a);
		System.out.println(a1);
		 boolean b =a1.equals(a);
		 System.out.println(b);
		 a1.add("kuppala");
		 System.out.println(a1);
		 a1.clear();
		 System.out.println(a1);
		 boolean b1 = a1.isEmpty();
		 System.out.println(b1);

	}

}
