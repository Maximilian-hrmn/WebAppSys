package uebung1.notendurchschnitt;

import java.util.HashMap;

public class noten {
    private static final java.util.Scanner scanner = new java.util.Scanner(System.in);
    private final HashMap<String, Integer> notenliste = new HashMap<>();
    
    private static int readInt() {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
    
    private static String readString() {
        return scanner.nextLine();
    }

    public void noteneingabe(){
        System.out.println("Geben sie das Fach ein:");
        String fach = readString();
        System.out.println("Geben sie die Note ein:");
        int note = readInt();
        notenliste.put(fach, note);
    }

    public void ausgabe(){
        System.out.println("Drücke 1 um alle Fächer auszugeben, Drücke 2 um alle Noten auszugeben, Drücke 3 um alle Noten und Fächer auszugeben, Drücke 4 um deinen Notendurschnitt auszugeben");
        int eingabe = readInt();
        switch (eingabe) {
            case 1 -> System.out.println(notenliste.keySet());
            case 2 -> System.out.println(notenliste.values());
            case 3 -> System.out.println(notenliste);
            case 4 -> {
                double summe = 0;
                for (Object note : notenliste.values()){
                    summe += (int) note;
                }
                double durchschnitt = summe / notenliste.size();
                System.out.println("Dein Notendurchschnitt ist: " + durchschnitt);
            }
            default -> System.out.println("Ungültige Eingabe");
        }
    }
}
