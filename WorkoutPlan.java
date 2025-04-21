public class WorkoutPlan {
    private String exercise;
    private int durationMinutes;

    public WorkoutPlan(String exercise, int durationMinutes) {
        this.exercise = exercise;
        this.durationMinutes = durationMinutes;
    }

    public String getExercise() {
        return exercise;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String toString() {
        return "Uzdevums: " + exercise + " (" + durationMinutes + " minūtes)";
    }
}
