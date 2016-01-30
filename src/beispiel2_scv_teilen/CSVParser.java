package beispiel2_scv_teilen;

public class CSVParser {

	private String csvline;
	
	public CSVParser(String csvline){
		this.csvline=csvline;
	}
	
	public int countComma(){
		int count=0;
		for(int i = 0; i < csvline.length();i++){
			if(csvline.charAt(i) == ','){
				count++;
			}
		}
		return count;
	}
	public String [] parse(){
		
		String [] csv = new String [countComma()+1];
		
		String temp = "";
		
		int count = 0;
					
		for(int i = 0; i < csvline.length(); i++){
			if(csvline.charAt(i) != ','){
				temp = temp + csvline.charAt(i);
			}
			else{
				csv[count] = temp;
				count++;
				temp = "";
			}
		}
		csv[count] = temp;
		return csv;
	}	
}