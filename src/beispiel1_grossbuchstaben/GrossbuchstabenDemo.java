package beispiel1_grossbuchstaben;

public class GrossbuchstabenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grossbuchstaben letters = new Grossbuchstaben("Wörter starten mit Großbuchstaben");
		letters.setGrossbuchstaben();
		
		System.out.println(" ");
		Grossbuchstaben letters1 = new Grossbuchstaben("Du kannst alles klein schreiben und trotzdem wird es groß");
		letters1.setGrossbuchstaben();
	}

}
