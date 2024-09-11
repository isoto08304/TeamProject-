import java.util.Scanner;

public class CalculateQuadratic {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    double a;
    double b;
    double c;
    double x;

    a = scnr.nextDouble();
    b = scnr.nextDouble();
    c = scnr.nextDouble();

    x = -b + Math.sqrt(Math.pow(b,2)-(4*a*b))/(2*a);

    }
}