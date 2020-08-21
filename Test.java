public class Test {
    String name; // anchor
    String city; // lagos
    int year; // 2016

    Test(String name, String city, int year) {
        this.name = name;
        this.city = city;
        this.year = year;
    }

    void printDetails() {
        System.out.println(this.name);
        System.out.println(this.city);
        System.out.println(this.year);
    }

    public static void main(String[] args) {
        Test uni = new Test("Anchor", "Lagos", 2016);

        uni.printDetails();
    }

}