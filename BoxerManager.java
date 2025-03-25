import java.io.*;
import java.util.*;

public class BoxerManager {
    private List<Boxer> boxers = new ArrayList<>();
    private final String FILE_NAME = "boxers.txt";

    public void addBoxer(String name, int age) {
        boxers.add(new Boxer(name, age));
        System.out.println(name + " pievienots!");
    }

    public Boxer findBoxer(String name) {
        return boxers.stream().filter(b -> b.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public void trainBoxer(String name, int days) {
        Boxer boxer = findBoxer(name);
        if (boxer != null) {
            boxer.train(days);
            System.out.println("Treniņi atjaunināti!");
        } else {
            System.out.println("Bokseris nav atrasts.");
        }
    }

public void displayBoxers() {
    if (boxers.isEmpty()) {
        System.out.println("\nSistēmā nav bokseru.");
        return;
    }
    System.out.println("\nBokseri:");
    System.out.println("--------------------------------------------------------------");
    boxers.forEach(System.out::println);
    System.out.println("--------------------------------------------------------------");
}

public void deleteBoxer(String name) {
    Boxer boxer = findBoxer(name);
    if (boxer != null) {
        boxers.remove(boxer);
        System.out.println("Bokseris dzēsts.");
    } else {
        System.out.println("Bokseris nav atrasts.");
    }
}

public void sortBoxers() {
    boxers.sort(Comparator.comparingInt(b -> -b.getWinPercentage()));
    System.out.println("Bokseri sakārtoti pēc uzvaru procenta!");
    displayBoxers();
}

public void saveData() {
    try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
        for (Boxer b : boxers) {
            writer.println(b.toFileString());
        }
    } catch (IOException e) {
        System.out.println("Kļūda saglabājot datus.");
    }
}

public void loadData() {
    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
        String line;
        while ((line = reader.readLine()) != null) {
            boxers.add(Boxer.fromFileString(line));
        }
    } catch (FileNotFoundException e) {
        System.out.println("Nav saglabātu datu. Sākam no nulles.");
    } catch (IOException e) {
        System.out.println("Kļūda ielādējot datus.");
    }
}
}
