import java.io.Serializable;

public class Boxer implements Serializable {
    private String name;
    private int age;
    private int trainingDays;
    private int skillLevel;
    private int wins;
    private int losses;

    // Shift + Alt + F

    public Boxer(String name, int age) {
        this.name = name;
        this.age = age;
        this.trainingDays = 0;
        this.skillLevel = 1;
        this.wins = 0;
        this.losses = 0;
    }

    public void train(int days) {
        trainingDays += days;
        skillLevel = 1 + trainingDays / 5;
    }

    public double getWinPercentage() {
        return (wins + losses == 0) ? 0 : (double) wins / (wins + losses) * 100;
    }

    public String toFileString() {
        return name + "," + age + "," + trainingDays + "," + skillLevel + "," + wins + "," + losses;
    }

    public static Boxer fromFileString(String line) {
        String[] data = line.split(",");
        Boxer b = new Boxer(data[0], Integer.parseInt(data[1]));
        b.trainingDays = Integer.parseInt(data[2]);
        b.skillLevel = Integer.parseInt(data[3]);
        b.wins = Integer.parseInt(data[4]);
        b.losses = Integer.parseInt(data[5]);
        return b;
    }

    @Override
    public String toString() {
        return String.format(
                "%-10s | Vecums: %d | Treniņi: %d | Līmenis: %d | Uzvaras: %d | Zaudējumi: %d | Uzvaru %%: %.2f",
                name, age, trainingDays, skillLevel, wins, losses, getWinPercentage());
    }

    public String getName() {
        return name;
    }
}