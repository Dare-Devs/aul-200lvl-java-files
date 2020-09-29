class Factorial {
    int fac(int a){
        if(a < 0){
            System.err.println("The factorial of a negative number doesn't exist");
        } else if (a == 1){
            return a;
        } else {
            fac(a - 1);
        }
    }
    public static void main(String[] args) {
        
    }
}
