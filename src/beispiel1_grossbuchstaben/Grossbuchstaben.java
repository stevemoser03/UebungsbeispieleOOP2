package beispiel1_grossbuchstaben;

public class Grossbuchstaben {

	private String grossbuchstaben;
	
	public Grossbuchstaben(String grossbuchstaben) {
		this.grossbuchstaben = grossbuchstaben;
	}

	public String getGrossbuchstaben(){
		return grossbuchstaben;
	}
	
	public int getLength(){
		return grossbuchstaben.length();
	}
	
	public void setGrossbuchstaben(){
		//String in char array umwandeln
				char [] grossbuchstaben = new char [getLength()];
				for(int x = 0; x < getLength();x++){
					grossbuchstaben [x] = getZeichen(x);
					//System.out.print(grossbuchstaben [x]);
				}
				
				//abrufen der char Array
				char aWert = '1';
				for(int x = 0; x < grossbuchstaben.length;x++){
					if(grossbuchstaben[x] == ' '){
						aWert = ' ';
						System.out.print(grossbuchstaben[x]);
					}
					else if(aWert==' '){
						grossbuchstaben[x] = Character.toUpperCase(grossbuchstaben[x]);
						aWert = '1';
						System.out.print(grossbuchstaben[x]);
					}
					else 
					System.out.print(grossbuchstaben [x]);
				}
	}
	
	public char getZeichen(int x){
		return grossbuchstaben.charAt(x);
	}
	
}
