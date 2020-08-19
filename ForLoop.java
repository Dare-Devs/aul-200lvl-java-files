import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // for (int i = 0; i < 5; i++) {
        // System.out.println(i);
        // }

        // Testing input
        // System.out.println("Enter your name: ");
        // String name = scan.nextLine();
        // System.out.println("Hi " + name);

        // System.out.println("Enter your age: ");
        // int age = Integer.valueOf(scan.nextLine());

        // System.out.println(age);

        // Find the area of a circle

        double pi = 3.142;
        double r = 6.5;
        // System.out.println("Enter the radius: ");
        // double r = Double.valueOf(scan.nextLine());
        double area = pi * r * r;

        System.out.println("The area of the circle is " + area);
    }
}