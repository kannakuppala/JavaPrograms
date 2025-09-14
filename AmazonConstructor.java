package module1.basicjava;

public class AmazonConstructor {

	AmazonConstructor()
	{
		System.out.println("constructor");
		
	}
	AmazonConstructor(int a)
	{
		System.out.println("constructor 1");
	}
	
	public static void main(String[] args) 
	{
		AmazonConstructor a = new AmazonConstructor();
		AmazonConstructor b = new AmazonConstructor(2);

	}

}
