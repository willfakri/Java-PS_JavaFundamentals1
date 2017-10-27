package Printing;

public class PaperTray {
	int totalPapers = 0;
	
	public void addPapers(int papers) {
		totalPapers += papers;
	}
	
	public void usePapers() {
		totalPapers --;
	}
	
	public boolean isEmpty() {
		return totalPapers > 0;
	}
}
