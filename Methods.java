public class Methods {

    int z = 0;

    static int f(int x, int y) {
        return x * x + y * y;
    }

    static Boolean checker(int x) {
        return x > 10;
    }

    String shout(String n) {
        return "Hiiiiiii " + n;
    }

    public static void main(String[] args) {

        Methods tekena = new Methods();
        Methods judith = new Methods();

        // System.out.println(tekena.shout("Judith"));
        // System.out.println(f(2, 3));

        // Boolean bool = checker(40);
        // System.out.println(bool);

        judith.z = 9;

        System.out.println(tekena.z);
        System.out.println(judith.z);
        // shout();
    }
}

// f(x)= x + 1