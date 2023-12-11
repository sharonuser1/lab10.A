import java.util.Random;
import java.util.Scanner;

public class Question1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Q1();
        scan.close();
    }

    public static void Q1() {
        while (true) {
            System.out.println("Pick a shape: square, rectangle, circle (or 'q' to quit)");
            String input = scan.nextLine();
            if (input.equals("q")) {
                return;
            }

            if (input.equals("square")) {
                double a;
                System.out.println("Enter the length of side a: ");
                a = Double.parseDouble(scan.nextLine());
                System.out.println("The circumference of the square is: " + a * 4);
                System.out.println("The area of the square is: " + a * a);

            } else if (input.equals("rectangle")) {
                double a, b;
                System.out.println("Enter the length of side a: ");
                a = Double.parseDouble(scan.nextLine());
                System.out.println("Enter the length of side b: ");
                b = Double.parseDouble(scan.nextLine());
                System.out.println("The circumference of the rectangle is: " + (2 * a + 2 * b));
                System.out.println("The area of the rectangle is: " + (a * b));
            } else if (input.equals("circle")) {
                double r;
                System.out.println("Enter the radius: ");
                r = Double.parseDouble(scan.nextLine());
                System.out.println("The circumference of the circle is: " + (Math.PI * r * 2));
                System.out.println("The area of the circle is: " + (Math.PI * r * r));
            }
        }
    }
}


    

  


    

