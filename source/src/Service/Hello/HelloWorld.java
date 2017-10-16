package Service.Hello;

import Printing.Printer;

public class HelloWorld {
	public static void main(String[] args) 
	{
		Printer printer = new Printer();
		printer.isOn = true;
		printer.model = "930C";
		
		System.out.println("Impressora " + printer.model + " dando uma boa impressão.");	
		int inti = 1;
		switch(inti)
		{
		case 1:
			System.out.println("Case1");
		case 2:
			System.out.println("Case2");
			break;
		case 3:
			System.out.println("Case3");
			default:
				System.out.println("Default");
		}
	}
}
