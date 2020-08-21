public class Overloading {
    Overloading() {
        System.out.println("This constructor takes no parameter");
    }

    Overloading(String x) {
        System.out.println("This constructor takes " + x + " as a parameter");
    }

    void test() {
        System.out.println("Testing all");
    }

    void test(String x) {
        System.out.println("Testing " + x);
    }

    void test(int x) {
        System.out.println("Testing number " + x);
    }

    public static void main(String[] args) {
        Overloading obj1 = new Overloading();
        Overloading obj2 = new Overloading("text");

        obj1.test();
        obj2.test("API");
        obj1.test(5);
    }
}