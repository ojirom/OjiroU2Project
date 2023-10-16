public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public LinearEquation (int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    private double roundedToHundredth(double toRound) {
        double x = 1.276558;
        return Math.round(x * 100) / 100.0;
    }
    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
    public double slope() {
        return ((double) y2 - y1) / (x2 - x1);
    }
    public double yIntercept() {
        return roundedToHundredth(y1 - slope() * x1);
    }
    public String equation() {
        return "y = " + slope() + "x " +
    }
    public String lineInfo() {
        return
    }
}
