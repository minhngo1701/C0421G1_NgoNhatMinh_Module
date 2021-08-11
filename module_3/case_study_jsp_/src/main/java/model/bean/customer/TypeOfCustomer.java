package model.bean.customer;

public class TypeOfCustomer {
    private int id;
    private String typeOfCustomerName;

    public TypeOfCustomer() {
    }

    public TypeOfCustomer(int id, String typeOfCustomerName) {
        this.id = id;
        this.typeOfCustomerName = typeOfCustomerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfCustomerName() {
        return typeOfCustomerName;
    }

    public void setTypeOfCustomerName(String typeOfCustomerName) {
        this.typeOfCustomerName = typeOfCustomerName;
    }
}
