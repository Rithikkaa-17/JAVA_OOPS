import java.util.Scanner;
public class Tri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = input.nextDouble();
        System.out.print("Enter side b: ");
        double b = input.nextDouble();
        System.out.print("Enter side c: ");
        double c = input.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("The area of the triangle is: %.2f\n", area);
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
        input.close();
    }
}
