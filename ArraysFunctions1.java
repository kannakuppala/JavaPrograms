package module1.basicjava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFunctions1 {

	public static void main(String[] args) 
	{
		
      Scanner a=new Scanner(System.in);
      System.out.println("Please enter the size of an array");
	  int b[] = new int[a.nextInt()];
	  
	  for(int i=0;i<b.length;i++)
	  {
		  System.out.println("Please enter the valure of index i");
		  b[i] = a.nextInt();  
	  }
		
	  
	  System.out.println(Arrays.toString(b));
	  a.close();
	}

}
