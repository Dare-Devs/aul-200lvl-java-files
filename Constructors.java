class Constructors {
    String name = "";

    Constructors(String name) {
        // System.out.println("This is inside the constructor");
        this.name = name;
    }

    void run() {
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        Constructors teks = new Constructors("Tekena");

        teks.run();
        System.out.println(teks.name);
        // System.out.println("Hello Constructors");
    }
}