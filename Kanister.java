import java.io.Console;

public class Kanister {
	/**
 	* Ermittele das minimum
	* 
	* @param float a erster Wert
	* @param float b zweiter Wert
	* @return float das minimum
	*/
	public static float min(float a, float b) {
		if (a > b) return b;
		else return a;	
	} 
	public static void giessen(float kanister[], float kapazitaet[], int von, int nach) {
			float wieviel = min(kanister[von], kapazitaet[nach] - kanister[nach]);
			kanister[von] -= wieviel;
			kanister[nach] += wieviel;
	}

	public static void main(String[] args) {
		Console cons = System.console();
		float aktuelle_befuellung = 0;
		float[] kanister = {8.0f, 0.0f, 0.0f};
		float[] kapazitaet = {8.0f, 5.0f, 3.0f};
		int counter = 1;
		while(kanister[0] != 4.0f) {
			System.out.printf("Aus welchem der drei Kanister wollen sie Wasser ausschütten?\n");
			String quelle = cons.readLine();
			int von = Integer.parseInt(quelle) - 1;
			System.out.printf("In welchem Kanister möchten sie das Wasser einschütten?\n");
			String ziel = cons.readLine();
			int nach = Integer.parseInt(ziel) - 1;
			System.out.printf("%nRunde %d%n%n", counter);
			System.out.println("Davor\n");
			for(float a : kanister) {
				System.out.println(a);			
			}
			giessen(kanister, kapazitaet, von, nach);
			System.out.println("Danach\n");
			for(float a : kanister) {
				System.out.println(a);			
			}
			++counter;
		}
		System.out.println("Ergebnis\n");
		for(float a : kanister) {
			System.out.println(a);			
		}	
	}
}
