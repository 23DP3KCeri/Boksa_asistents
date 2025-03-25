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

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addBoxer(); break;
                case 2: trainBoxer(); break;
                case 3: manager.displayBoxers(); break;
                case 4: searchBoxer(); break;
                case 5: deleteBoxer(); break;
                case 6: manager.sortBoxers(); break;
                case 7: manager.saveData(); System.out.println("Dati saglabāti. Uz redzēšanos!"); return;
                default: System.out.println("Nepareiza izvēle. Mēģini vēlreiz.");
        }
    }
}

private static void addBoxer() {
    System.out.print("\nIevadi vārdu: ");
    String name = scanner.nextLine();
    System.out.print("Ievadi vecumu: ");
    int age = scanner.nextInt();
    scanner.nextLine();
    manager.addBoxer(name, age);
}

private static void trainBoxer() {
    System.out.print("\nIevadi boksera vārdu: ");
    String name = scanner.nextLine();
    System.out.print("Ievadi treniņa dienu skaitu: ");
    int days = scanner.nextInt();
    scanner.nextLine();
    manager.trainBoxer(name, days);
}

private static void searchBoxer() {
    System.out.print("\nIevadi boksera vārdu: ");
    String name = scanner.nextLine();
    Boxer boxer = manager.findBoxer(name);
    if (boxer != null) {
        System.out.println("\nAtrasts bokseris:");
        System.out.println(boxer);
    } else {
        System.out.println("Bokseris nav atrasts.");
    }
}

private static void deleteBoxer() {
        System.out.print("\nIevadi boksera vārdu dzēšanai: ");
        String name = scanner.nextLine();
        manager.deleteBoxer(name);
}
}

