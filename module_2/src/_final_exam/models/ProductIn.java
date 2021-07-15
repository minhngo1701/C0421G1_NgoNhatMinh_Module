package _final_exam.models;

public class ProductIn extends Product {
    private double costIn;
    private String province;
    private double tax;

    public ProductIn() {
    }

    public ProductIn(int id, String idProduct, String nameProduct, double cost, int amountProduct, String productor, double costIn, String province, double tax) {
        super(id, idProduct, nameProduct, cost, amountProduct, productor);
        this.costIn = costIn;
        this.province = province;
        this.tax = tax;
    }

    public double getCostIn() {
        return costIn;
    }

    public void setCostIn(double costIn) {
        this.costIn = costIn;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return super.toString() +
                "costIn=" + costIn +
                ", province='" + province + '\'' +
                ", tax='" + tax + '\'' +
                '}';
    }
}
