import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner scan = new Scanner(System.in);
    public LinearEquationLogic () {}
    public int parseX(String coords) {
        return Integer.parseInt(coords.substring(1,coords.indexOf(",")));
    }
    public int parseY(String coords) {
        return Integer.parseInt(coords.substring(coords.indexOf(",") + 1, coords.length() - 1));
    }
    public void start () {
        System.out.println("Welcome to Linear Calculator 1.0");
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
    }
}
