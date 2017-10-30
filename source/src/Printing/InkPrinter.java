package Printing;

public class InkPrinter implements IPrinter {

	Printer printer;
	
	public InkPrinter(boolean isOn)
	{
		printer = new Printer(isOn);
	}
	
	@Override
	public void TurnOn() {
		printer.TurnOn();
		System.out.println("Classe FILHA, InkPrinter");
	}
		
	@Override
	public void TurnOff() {
		printer.TurnOff();
		System.out.println("Classe FILHA, InkPrinter");
	}
}
