package gmt_praxisaufgaben_01;

public class RLE {

	public static void main(String[] args) {
		
		TextHelfer textHelfer = new TextHelfer("src/text.txt", "src/ausgabe.txt");
		textHelfer.lese_text();
		
	
		StringBuffer test = new StringBuffer(textHelfer.text);
	
		
		textHelfer.text = encode(test).toString();
		System.out.println(textHelfer.text);
		textHelfer.schreibe_text();
	}
	
	public static String encode(StringBuffer test) {
	    StringBuffer dest = new StringBuffer();
	    for (int i = 0; i < test.length(); i++) {
	        int runLength = 1;
	        while (i+1 < test.length() && test.charAt(i) == test.charAt(i+1)) {
	            runLength++;
	            i++;
	        }
	        dest.append(runLength);
	        dest.append(test.charAt(i));
	    }
	    return dest.toString();
	}
}
