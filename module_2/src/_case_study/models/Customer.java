package _case_study.models;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String dateOfbirth, String gender, String identityNumber, String phoneNumber, String email, String typeCustomer, String address) {
        super(id, name, dateOfbirth, gender, identityNumber, phoneNumber, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + ", typeCustomer=" + getTypeCustomer() + ", address=" + getAddress();
    }
}
