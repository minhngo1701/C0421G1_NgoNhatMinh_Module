package _final_exam.models;

public class ProductOut extends Product {
    private double costOut;
    private String country;

    public ProductOut() {
    }

    public ProductOut(int id, String idProduct, String nameProduct, double cost, int amountProduct, String productor, double costOut, String country) {
        super(id, idProduct, nameProduct, cost, amountProduct, productor);
        this.costOut = costOut;
        this.country = country;
    }

    public double getCostOut() {
        return costOut;
    }

    public void setCostOut(double costOut) {
        this.costOut = costOut;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() +
                "costOut=" + costOut +
                ", country='" + country + '\'' +
                '}';
    }
}
