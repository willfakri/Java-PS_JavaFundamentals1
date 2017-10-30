package Printing;

public class InkPrinter extends Printer {

	public InkPrinter(boolean isOn)
	{
		super(isOn);
	}
	
	public void taComo()
	{
		mensagem(isOn);
	}
	
	public void taLigada()
	{
		TurnOn();
		mensagem(isOn);
	}
	
	@Override
	public void TurnOn() {
		super.TurnOn();
		System.out.println("Classe FILHA, InkPrinter");
	}
	
	public void taDesligada()
	{
		TurnOff();
		mensagem(isOn);
	}
	
	public void mensagem(Object msg)
	{
		System.out.println(msg);
	}
	
	public void print(int copies, String text)
	{
		super.print(copies, text);
	}
}
