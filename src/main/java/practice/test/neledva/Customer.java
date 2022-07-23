package practice.test.neledva;

class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private int amountMoney;

    public double getAmountMoney() {
        return amountMoney;
    }

    public int getIdCustomer() {
        return id;
    }
    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected Customer() {
        id = -1;
        firstName = null;
        lastName = null;
        amountMoney = 0;
    }

    protected Customer(int id, String firstName, String lastName, int amountMoney) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountMoney = amountMoney;
    }

}
