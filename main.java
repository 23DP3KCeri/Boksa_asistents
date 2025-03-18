
class Boxer {
String name;
int age;
int trainingDays;
int skillLevel;

public Boxer(String name, int age) {
this.name = name;
this.age = age;
this.trainingDays = 0;
this.skillLevel = 1;
}

public void train(int days) {
    trainingDays += days;
    skillLevel = 1 + trainingDays / 5;
    }
    
    @Override
    public String toString() {
    return name + ", Age: " + age + ", Training days: " + trainingDays + ", Skill level: " + skillLevel;
    }
    }