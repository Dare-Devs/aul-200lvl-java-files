class University {
    String name;
    String city;
    int year;

    void printDetails() {
        System.out.println(name);
        System.out.println(city);
        System.out.println(year);
    }

    void addDetails(String name, String city, int year) {
        this.name = name;
        this.city = city;
        this.year = year;
    }

    public static void main(String[] args) {
        University AUL = new University();
        University UNN = new University();
        University ABU = new University();

        AUL.addDetails("Anchor University", "Lagos", 2014);
        UNN.addDetails("University of Nigeria, Nsukka", "Nsukka", 1955);
        ABU.addDetails("Ahmadu Bello University", "Zaria", 1962);

        AUL.printDetails();
        UNN.printDetails();
        ABU.printDetails();
    }
}