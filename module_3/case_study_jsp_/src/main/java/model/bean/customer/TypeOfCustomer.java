package model.bean.customer;

public class TypeOfCustomer {
    private int typeCusId;
    private String typeOfCustomerName;

    public TypeOfCustomer() {
    }

    public TypeOfCustomer(int id, String typeOfCustomerName) {
        this.typeCusId = id;
        this.typeOfCustomerName = typeOfCustomerName;
    }

    public int getTypeCusId() {
        return typeCusId;
    }

    public void setTypeCusId(int typeCusId) {
        this.typeCusId = typeCusId;
    }

    public String getTypeOfCustomerName() {
        return typeOfCustomerName;
    }

    public void setTypeOfCustomerName(String typeOfCustomerName) {
        this.typeOfCustomerName = typeOfCustomerName;
    }
}
