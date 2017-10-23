package Service.Hello;

import Printing.InkPrinter;

public class HelloWorld {
	public static void main(String[] args) 
	{
		InkPrinter inkPrinter = new InkPrinter(false);
		inkPrinter.taComo();
		inkPrinter.taLigada();
		inkPrinter.taDesligada();
		
	}
//		Printer printer = new Printer();
//		printer.isOn = true;
//		printer.model = "930C";
//		
//		System.out.println("Impressora " + printer.model + " dando uma boa impressão.");	
//		int inti = 1;
//		switch(inti)
//		{
//		case 1:
//			System.out.println("Case1");
//		case 2:
//			System.out.println("Case2");
//			break;
//		case 3:
//			System.out.println("Case3");
//			default:
//				System.out.println("Default");
//		}
//		
//		loop();
//		printer.whileEx(10);
//	}
//	
//	private static void loop()
//	{
//		String[] cores = new String[] { "branco", "preto", "cinza" };
//		
//		System.out.println("For normal:");
//		for(int i = 0; i < cores.length; i++)
//		{
//			if(cores[i] == "preto") 
//			{
//				continue;
//			}
//			System.out.println(cores[i]);
//		}
//		
//		System.out.println("Foreach:");
//		for(String cor : cores)
//		{
//			if(cor == "preto")
//			{
//				break;
//			}
//			System.out.println(cor);
//		}		
//	}
}
