package module1.basicjava;

abstract class Flipcart
{
	abstract void login();
	abstract void logout();
	
}

public class Amazonabstract extends Flipcart {

	public static void main(String[] args) 
	{
		Amazonabstract a = new Amazonabstract();
		a.login();
		a.logout();
	}
	
	void login() 
	{
		System.out.println("confirm");
		
	}

	
	void logout() 
	{
		
		System.out.println("confirm 1");
	}
}