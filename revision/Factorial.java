import java.util.Scanner;
class Factorial {
    // recursive method
    static int facRec(int n){
        if(n < 0){
            System.err.println("Factorial of negative doesnt exist");
        }
        if(n == 1 || n == 0){
            return 1;
        }
        return n * facRec(n - 1);
    }
    // non recursive method
    static int facNonRec(int n){
        if(n < 0){
            System.err.println("Factorial of negative doesnt exist");
        }
        int start = n;
        int value = 1;
        while(start > 1){
            value *= start;
            --start;
        }
        return value;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        System.out.println(facRec(num));
        System.out.println(facNonRec(num));
    }
}
