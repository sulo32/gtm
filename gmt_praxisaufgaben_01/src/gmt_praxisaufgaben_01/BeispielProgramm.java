package gmt_praxisaufgaben_01;

public class BeispielProgramm {

	public static void main(String[] args) {
		TextHelfer textHelfer = new TextHelfer("src/alphabet.txt", "src/ausgabe.txt");
		textHelfer.lese_text();

		StringBuffer rueckwaerts = new StringBuffer(textHelfer.text);
		textHelfer.text = rueckwaerts.reverse().toString();
		System.out.println(textHelfer.text);

		textHelfer.schreibe_text();
	}
}
