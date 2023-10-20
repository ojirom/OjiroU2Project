import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner scan = new Scanner(System.in);
    public LinearEquationLogic () {}
    public int parseX(String coords) {
        return Integer.parseInt(coords.substring(1,coords.indexOf(",")));
    }
    public int parseY(String coords) {
        return Integer.parseInt(coords.substring(coords.indexOf(",") + 2, coords.length() - 1));
    }
    public void start () {
        System.out.println("Welcome to Linear Equation Calculator 1.0");
        String cont = "y";
        while (cont.equals("y")) {
            System.out.print("Enter coordinate 1: ");
            String coord1 = scan.nextLine();
            System.out.print("Enter coordinate 2: ");
            String coord2 = scan.nextLine();
            int x1 = parseX(coord1);
            int y1 = parseY(coord1);
            int x2 = parseX(coord2);
            int y2 = parseY(coord2);
            System.out.println();
            LinearEquation line1 = new LinearEquation(x1, y1, x2, y2);
            if (x1 != x2) {
                System.out.println(line1.lineInfo());
                System.out.println();
                System.out.print("Enter a value for x: ");
                System.out.println("The point on the line is " + line1.coordinateForX(scan.nextDouble()));
                String reset = scan.nextLine();
            } else {
                System.out.println("These points are on line x = " + x1);
            }
            System.out.println();
            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            cont = scan.nextLine();
            System.out.println();
        }
        System.out.println("Thank you for using the Linear Equation Calculator 1.0");
    }
}