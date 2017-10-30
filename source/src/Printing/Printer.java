package Printing;

public class Printer {
	protected boolean isOn;
	private PaperTray paperTray = new PaperTray();
	
	public Printer(boolean isOn)
	{
		this.isOn = isOn;
	}
	
	public void TurnOn()
	{
		this.isOn = true;
		System.out.println("Classe PAI, Printer");
	}
	
	public void TurnOff()
	{
		this.isOn = false;
	}
	
	public void loadTray(int papers)
	{
		paperTray.addPapers(papers);
	}
	
	public void print(int copies, String text) {
		if(!this.isOn) {
			System.out.println("Printer is off, your asshole!");
		}
		
		while(copies > 0) {
			if(!paperTray.isEmpty()) {
				System.out.println("Copie #" + copies + " sucess. Do you want a medal for this?");
				paperTray.usePapers();
			} else {
				System.out.println("Paper tray is empty, your idiot!");
			}
		}
	}
}
