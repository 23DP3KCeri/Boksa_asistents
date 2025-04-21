public class TechniqueTip {
    private String tip;

    public TechniqueTip(String tip) {
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }

    @Override
    public String toString() {
        return "Tehnikas padoms: " + tip;
    }
}
