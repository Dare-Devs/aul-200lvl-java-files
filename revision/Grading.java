import java.util.Scanner;
class Grading {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = scan.nextInt();

        System.out.print("The point for the score is: ");
        if(score < 45){
            System.out.println(0);
        } else if (score < 50){
            System.out.println(1);
        } else if (score < 60){
            System.out.println(2);
        } else if (score < 70){
            System.out.println(3);
        } else {
            System.out.println(4);
        }

    }
}
