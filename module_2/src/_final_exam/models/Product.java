package _final_exam.models;

import java.io.Serializable;

public abstract class Product implements Serializable {
    private int id;
    private String idProduct;
    private String nameProduct;
    private double cost;
    private int amountProduct;
    private String productor;

    public Product() {
    }

    public Product(int id, String idProduct, String nameProduct, double cost, int amountProduct, String productor) {
        this.id = id;
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.cost = cost;
        this.amountProduct = amountProduct;
        this.productor = productor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", cost=" + cost +
                ", amountProduct=" + amountProduct +
                ", productor='" + productor + '\'' +
                '}';
    }
}
