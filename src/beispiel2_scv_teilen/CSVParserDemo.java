package beispiel2_scv_teilen;

public class CSVParserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSVParser csvline = new CSVParser("Hallo,Melanie,ich,liebe,dich,!");
		
		String [] a = csvline.parse();
		for(int i = 0; i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}

}
