package _case_study.models;

public class Contract {
    private int contractID;
    private String code;
    private double depositAmount;
    private double totalPayment;
    private int id;

    public Contract() {
    }

    public Contract(int contractID, String code, double depositAmount, double totalPayment, int id) {
        this.contractID = contractID;
        this.code = code;
        this.depositAmount = depositAmount;
        this.totalPayment = totalPayment;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractID=" + contractID +
                ", code='" + code + '\'' +
                ", depositAmount=" + depositAmount +
                ", totalPayment=" + totalPayment +
                ", id=" + id +
                '}';
    }
}
