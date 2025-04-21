import java.util.ArrayList;
import java.util.Scanner;

public class BoxingAssistant {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Boxer> boxers = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nIzvēlies darbību:");
            System.out.println("1. Pievienot bokseri");
            System.out.println("2. Trenēt bokseri");
            System.out.println("3. Rādīt visus bokserus");
            System.out.println("4. Meklēt bokseri pēc vārda");
            System.out.println("5. Dzēst bokseri");
            System.out.println("6. Saglabāt un iziet");

            int choice = scanner.nextInt();
            scanner.nextLine(); // attīra buferi

            switch (choice) {
                case 1: addBoxer(); break;
                case 2: trainBoxer(); break;
                case 3: displayBoxers(); break;
                case 4: searchBoxer(); break;
                case 5: deleteBoxer(); break;
                case 6: System.out.println("Uz redzēšanos!"); return;
                default: System.out.println("Nepareiza izvēle. Mēģini vēlreiz.");
            }
        }
    }

    private static void addBoxer() {
        System.out.print("Ievadi vārdu: ");
        String name = scanner.nextLine();
        System.out.print("Ievadi vecumu: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        boxers.add(new Boxer(name, age));
        System.out.println(name + " pievienots!");
    }

    private static void trainBoxer() {
        System.out.print("Ievadi boksera vārdu: ");
        String name = scanner.nextLine();
        Boxer boxer = findBoxer(name);
        if (boxer != null) {
            System.out.print("Ievadi treniņu dienas: ");
            int days = scanner.nextInt();
            scanner.nextLine();
            boxer.train(days);
            System.out.println("Treniņi pievienoti!");
        } else {
            System.out.println("Bokseris nav atrasts.");
        }
    }

    private static void displayBoxers() {
        if (boxers.isEmpty()) {
            System.out.println("Nav neviena boksera.");
        } else {
            System.out.println("Bokseri:");
            for (Boxer b : boxers) {
                System.out.println(b);
            }
        }
    }

    private static void searchBoxer() {
        System.out.print("Ievadi meklējamo vārdu: ");
        String name = scanner.nextLine();
        Boxer boxer = findBoxer(name);
        if (boxer != null) {
            System.out.println("Atrasts: " + boxer);
        } else {
            System.out.println("Bokseris nav atrasts.");
        }
    }

    private static void deleteBoxer() {
        System.out.print("Ievadi dzēšamā boksera vārdu: ");
        String name = scanner.nextLine();
        Boxer boxer = findBoxer(name);
        if (boxer != null) {
            boxers.remove(boxer);
            System.out.println(name + " ir izdzēsts.");
        } else {
            System.out.println("Bokseris nav atrasts.");
        }
    }

    private static Boxer findBoxer(String name) {
        for (Boxer b : boxers) {
            if (b.name.equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }
}