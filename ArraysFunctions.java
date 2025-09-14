package module1.basicjava;

import java.util.Arrays;

public class ArraysFunctions {

	public static void main(String[] args) 
	
	{
		String a[]= new String[4];
		a[0]="kanna";
		a[1]="gopal";
		a[2]="mani";
		a[3]="kumar";
		
		
        System.out.println(Arrays.toString(a));
         
         int b[]=new int[4];
         b[0]=10;
         b[1]=20;
         b[2]=30;
         b[3]=40;
         System.out.println(Arrays.toString(b));
         
         for(int i=0;i<a.length;i++) 
         {
        	 
        	 System.out.println(a[i]+" age is "+b[i]);
         }
         
	}

}
