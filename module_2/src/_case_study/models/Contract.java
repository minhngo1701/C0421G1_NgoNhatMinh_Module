package _case_study.models;

public class Contract {
    private int contractID;
    private String code;
    private double depositAmount;
    private double totalPayment;
    private int customerID;

    public Contract() {
    }

    public Contract(int contractID, String code, double depositAmount, double totalPayment, int customerID) {
        this.contractID = contractID;
        this.code = code;
        this.depositAmount = depositAmount;
        this.totalPayment = totalPayment;
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }


    @Override
    public String toString() {
        return "Contract{" +
                "contractID=" + contractID +
                ", code='" + code + '\'' +
                ", depositAmount=" + depositAmount +
                ", totalPayment=" + totalPayment +
                ", customerID=" + customerID +
                '}';
    }
}
