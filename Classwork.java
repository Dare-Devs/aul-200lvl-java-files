import java.util.Scanner;

public class Classwork{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double r = scan.nextFloat();
		double circumfrence =  2*3.142*r;

		System.out.println("The circumferce of the circle is: " + circumfrence);

	}
}
