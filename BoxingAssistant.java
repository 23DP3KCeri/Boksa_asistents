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
