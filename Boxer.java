public class Boxer {
    private String name;
    private int age;
    private int trainingDays = 0;
    private int wins = 0;
    private int losses = 0;

    public Boxer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void train(int days) {
        trainingDays += days;
    }

    public int getSkillLevel() {
        return 1 + trainingDays / 5;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWinPercentage() {
        int totalFights = wins + losses;
        if (totalFights == 0) return 0;
        return (wins * 100) / totalFights;
    }

    public void addFightResult(boolean won) {
        if (won) wins++;
        else losses++;
    }

    public String toFileString() {
        return name + ";" + age + ";" + trainingDays + ";" + wins + ";" + losses;
    }

    public static Boxer fromFileString(String line) {
        String[] parts = line.split(";");
        Boxer b = new Boxer(parts[0], Integer.parseInt(parts[1]));
        b.trainingDays = Integer.parseInt(parts[2]);
        b.wins = Integer.parseInt(parts[3]);
        b.losses = Integer.parseInt(parts[4]);
        return b;
    }

    @Override
    public String toString() {
        return name + " | Vecums: " + age + " | Treniņi: " + trainingDays +
                " | Līmenis: " + getSkillLevel() +
                " | Uzvaras: " + wins + " | Zaudējumi: " + losses +
                " | Uzvaru %: " + getWinPercentage() + "%";
    }
}