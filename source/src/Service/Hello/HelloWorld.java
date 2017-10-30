package Service.Hello;

import Printing.IPrinter;
import Printing.InkPrinter;
import Printing.Printer;

public class HelloWorld {
	public static void main(String[] args) 
	{
//		IPrinter printer = new Printer(true);
//		printer.TurnOff();
		
		IPrinter printer = new InkPrinter(true);
		printer.TurnOn();
	}
}
