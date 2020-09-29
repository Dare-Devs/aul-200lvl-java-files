class Overloading {
    Overloading(String name){
        System.out.println("My name is " + name);
    }
    Overloading(String name, int age){
        System.out.println("My name is " + name + "\nI am " + age + " years old.");
    }

    // :wString name = "sdflads";
    static void summation(int a, int b){
        System.out.println(a + b);
    }
    static void summation(int a, int b, int c){
        System.out.println(a + b + c);
    }
    static void summation(int a, int b, String c){
        System.out.println(c + (a + b));
    }
    static int f(int x){
        return x * x * x; // returns the cube
    }
    public static void main(String[] args){
        Overloading teks = new Overloading("Tekena", 17);
        Overloading judith = new Overloading("Judith");
        System.out.println("6 cube is " + f(6) );
        // method overloading;
        summation(7, 9);
        summation(5, 5, "This is the sum of 5 and 5 is: ");
        summation(4, 4, 4);

    }
}
