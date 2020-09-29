class Child extends Parent {
    Child(){}
    Child(String accName, String accNo, double accBal){
        super(accName, accNo, accBal);
    }
    void aMethodToBeOverriden(){
        System.out.println("After overriding");
       }

    public static void main(String[] args){
       Child person = new Child("Tekena Solomon", "093842489", 757572.90);
       Child person2 = new Child();
       // person.aMethodToBeOverriden();
       System.out.println(person.getAccName());
       person.setAccName("Judith Yakubu");
       System.out.println(person.getAccName());
       System.out.println(person2.getAccName());
    }
}
