public class Methods {

    static Boolean increment(int x) {
        return x > 10;
    }

    void shout() {
        System.out.println("I am shouting");
    }

    public static void main(String[] args) {

        Methods tekena = new Methods();

        tekena.shout();
        Boolean bool = increment(40);
        System.out.println(bool);
        // shout();
    }
}

// f(x)= x + 1