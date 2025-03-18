import java.io.*;
import java.util.*;

class Boxer {
String name;
int age;
int trainingDays;
int skillLevel;
int wins;
int losses;

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
if (wins + losses == 0) return 0;
return (double) wins / (wins + losses) * 100;
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
return String.format("%-10s | Age: %d | Training: %d | Skill: %d | Wins: %d | Losses: %d | Win%%: %.2f",
name, age, trainingDays, skillLevel, wins, losses, getWinPercentage());
}
}

