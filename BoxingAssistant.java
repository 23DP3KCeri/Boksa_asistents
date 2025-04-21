import java.util.Scanner;

public class BoxingAssistant {
    private static Scanner scanner = new Scanner(System.in);
    private static BoxerManager manager = new BoxerManager();

    public static void main(String[] args) {
        manager.loadData();
        while (true) {
            System.out.println("\nIzvēlies darbību:");
            System.out.println("1. Pievienot bokseri");
            System.out.println("2. Trenēt bokseri");
            System.out.println("3. Rādīt visus bokserus");
            System.out.println("4. Meklēt bokseri pēc vārda");
            System.out.println("5. Dzēst bokseri");
            System.out.println("6. Sakārtot pēc uzvaru procenta");
            System.out.println("7. Saglabāt un iziet");

            int choice = getIntInput("Tava izvēle: ");

            switch (choice) {
                case 1 -> addBoxer();
                case 2 -> trainBoxer();
                case 3 -> manager.displayBoxers();
                case 4 -> searchBoxer();
                case 5 -> deleteBoxer();
                case 6 -> manager.sortBoxers();
                case 7 -> {
                    manager.saveData();
                    System.out.println("Dati saglabāti. Uz redzēšanos!");
                    return;
                }
                default -> System.out.println("Nepareiza izvēle. Mēģini vēlreiz.");
            }
        }
    }

    private static void addBoxer() {
        System.out.print("Ievadi vārdu: ");
        String name = scanner.nextLine();
        int age = getIntInput("Ievadi vecumu: ");
        manager.addBoxer(name, age);
    }

    private static void trainBoxer() {
        System.out.print("Ievadi boksera vārdu: ");
        String name = scanner.nextLine();
        int days = getIntInput("Cik dienas trenējies? ");
        manager.trainBoxer(name, days);
    }

    private static void searchBoxer() {
        System.out.print("Ievadi vārdu, ko meklēt: ");
        String name = scanner.nextLine();
        Boxer boxer = manager.findBoxer(name);
        if (boxer != null) {
            System.out.println("Atrasts bokseris: " + boxer);
        } else {
            System.out.println("Bokseris nav atrasts.");
        }
    }

    private static void deleteBoxer() {
        System.out.print("Ievadi dzēšamā boksera vārdu: ");
        String name = scanner.nextLine();
        manager.deleteBoxer(name);
    }

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lūdzu ievadi skaitli.");
            }
        }
    }
}