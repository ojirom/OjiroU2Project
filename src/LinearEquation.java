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
        return Math.round(toRound * 100) / 100.0;
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
        String sign = " + ";
        String mx = (y2-y1) + "/" + (x2-x1) + "x" + sign;
        if (yIntercept() < 0) {
            sign = " - ";
        }
        return "y = " + mx + Math.abs(yIntercept());
    }
    public String coordinateForX(double x) {
        double y = slope() * x + yIntercept();
        return "(" + x + ", " + y + ")";
    }
    public String lineInfo() {
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" +
                "\nThe equation of the line between these points is: " + equation() +
                "\nThe slope of this line is: " + slope() +
                "\nThe y-intercept of this line is: " + yIntercept() +
                "\nThe distance between these points is " + distance();
    }
}
