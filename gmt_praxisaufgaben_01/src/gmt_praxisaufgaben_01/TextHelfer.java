package gmt_praxisaufgaben_01;

import java.io.*;

public class TextHelfer {

	// Hier wird der eingelesene Text gespeichert
	public static String text;

	// Der Name der zu lesenden Textdatei
	public static String eingabeDatei;

	// Der Name der zu schreibenden Textdatei
	public static String ausgabeDatei;

	// Konstruktor 1 mit Standard-Dateinamen
	public TextHelfer() {
		text = "";
		eingabeDatei = "src/input.txt";
		ausgabeDatei = "src/output.txt";
	}

	// Konstruktor 2 mit selbstgewählten Dateinamen
	public TextHelfer(String dateiName) {
		text = "";
		eingabeDatei = dateiName;
		ausgabeDatei = "src/output.txt";
	}

	// Konstruktor 3 mit selbstgewählten Dateinamen
	public TextHelfer(String dateiName1, String dateiName2) {
		text = "";
		eingabeDatei = dateiName1;
		ausgabeDatei = dateiName2;
	}

	// Methode zum Einlesen aus einer Textdatei
	public static void lese_text() {

		// Hilfsvariable zum Speichern von einzelnen Zeilen
		String line = "";

		try {
			// Dateizugriff starten
			FileReader fileReader = new FileReader(eingabeDatei);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				// Eingelesene Zeile ausgeben
				System.out.println(line);
				// Eingelesene Zeile speichern
				text += line.toString();
			}

			// Dateizugriff beenden
			bufferedReader.close();

			// System.out.println(text);
		}
		// Fehlernachricht, falls die Datei nicht gefunden wird
		catch (FileNotFoundException ex) {
			System.out.println("Kann Datei '" + eingabeDatei + "' nicht �ffnen!");
		}
		// Fehlernachricht beim Lesen der Datei
		catch (IOException ex) {
			System.out.println("Kann Datei '" + eingabeDatei + "' nicht lesen!");
		}
	}

	// Methode zum Schreiben in einer Textdatei
	public static void schreibe_text() {

		try {
			// Dateizugriff starten
			FileWriter fileWriter = new FileWriter(ausgabeDatei);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			// Inhalt der String-Variablen speichern
			bufferedWriter.write(text);

			// Dateizugriff beenden
			bufferedWriter.close();
		}
		// Fehlernachricht beim Schreiben der Datei
		catch (IOException ex) {
			System.out.println("Error writing to file '" + ausgabeDatei + "'");
		}
	}
}
