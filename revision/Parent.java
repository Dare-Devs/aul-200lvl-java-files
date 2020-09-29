class Parent {
    String bankName = "Access";
    private String accName;
    private String accNo;
    private double accBal;

    Parent(String accName, String accNo, double accBal){
        this.accName = accName;
        this.accNo = accNo;
        this.accBal = accBal;
    }

    // getters methods
    public String getAccName(){
        return this.accName;
    }
    public String accNo(){
        return this.accNo;
    }
    public double accBal(){
        return this.accBal;
    }
    // setters
    public void setAccName(String accName){
        this.accName = accName;
    }
    public void setAccNo(String accNo){
        this.accNo = accNo;
    }
    public void setAccBal(double accBal){
        this.accBal = accBal;
    }


    void aMethodToBeOverriden(){
        System.out.println("Initially A");
    }
}
