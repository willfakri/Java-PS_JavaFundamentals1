package Printing;

public class Printer {
	protected boolean isOn;
	
	public Printer(boolean isOn)
	{
		this.isOn = isOn;
	}
	
	public void TurnOn()
	{
		this.isOn = true;
	}
	
	public void TurnOff()
	{
		this.isOn = false;
	}
}
