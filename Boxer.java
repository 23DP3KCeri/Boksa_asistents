public class Boxer {
    String name;
    int age;
    int trainingDays = 0;
    int skillLevel = 1;

    public Boxer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void train(int days) {
        trainingDays += days;
        skillLevel = 1 + trainingDays / 5;
    }

    @Override
    public String toString() {
        return name + " | Vecums: " + age + " | Treniņi: " + trainingDays + " | Līmenis: " + skillLevel;
    }
}