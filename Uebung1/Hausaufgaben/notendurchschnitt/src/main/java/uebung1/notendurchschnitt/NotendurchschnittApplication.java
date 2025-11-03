package uebung1.notendurchschnitt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotendurchschnittApplication {

	private static int readInt(java.util.Scanner scanner) {
		while (true) {
			try {
				// Lies die gesamte Zeile und versuche sie als Zahl zu parsen
				String input = scanner.nextLine().trim();
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Bitte gib eine gültige Zahl ein!");
			}
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(NotendurchschnittApplication.class, args);
		noten noten = new noten();
		
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			System.out.println("Willkommen zum Notendurchschnittsrechner!");
			
			boolean isRunning = true;
			while (isRunning) {
				System.out.println("Wähle 1 wenn du eine Note eingeben möchtest, wähle 2 um eine Ausgabe zu machen, wähle 3 um das Programm zu beenden");
				int eingabe = readInt(scanner);

				if (eingabe != 1 && eingabe != 2 && eingabe != 3) {
					System.out.println("Ungültige Eingabe, bitte wähle 1, 2 oder 3.");
					continue;
				}
				
				switch (eingabe) {
					case 1 -> noten.noteneingabe();
					case 2 -> noten.ausgabe();
					case 3 -> {
						System.out.println("Programm wird beendet.");
						isRunning = false;
					}
					default -> System.out.println("Ungültige Eingabe");
				}
			}
		}
	}
}
