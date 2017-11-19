package gmt_praxisaufgaben_01;

// Süleyman Coskun, Eugen Ljavin
public class RLE {

	public static void main(String[] args) {
		
		
		
		TextHelfer textHelfer = new TextHelfer("src/text_alternativ.txt", "src/ausgabe_alternative.txt");
		textHelfer.lese_text();
		
	
		StringBuffer string = new StringBuffer(textHelfer.text);
	
		
		textHelfer.text = encode(string).toString();
		System.out.println(textHelfer.text);
		textHelfer.schreibe_text();
	}
	
	//method for the encode
	public static String encode(StringBuffer string) {
	    StringBuffer dest = new StringBuffer();
	    for (int i = 0; i < string.length(); i++) {
	        int runLength = 1;
	        while (i+1 < string.length() && string.charAt(i) == string.charAt(i+1)) {
	            runLength++;
	            i++;
	        }
	        dest.append(runLength);
	        dest.append(string.charAt(i));
	    }
	    return dest.toString();
	}
}
