package Scope;

public class Scope {
	
	public static int age = 50;

	public static void main(String[] args) {
				
		{
			System.out.println("scope1: " + age);	
			int age = 1000;
			System.out.println("scope2: " + age);	
		}
		
		System.out.println(age);

	}

}
