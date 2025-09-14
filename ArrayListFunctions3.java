package module1.basicjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListFunctions3 {

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
		ArrayList <String> a1 = new ArrayList <String> ();
		a1.addAll(a);
		Iterator<String> i1 = a1.iterator();
		while(i1.hasNext()) 
		{
			System.out.println(i1.next());
		}
		ListIterator<String> i2 = a1.listIterator();
		while(i2.hasNext()) 
		{
			System.out.println(i2.next());
		}
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}

}
