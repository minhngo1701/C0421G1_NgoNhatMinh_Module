package _17_io_binaryfile_serialization.bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manufacture;
    private double cost;

    public Product() {
    }

    public Product(int id, String name, String manufacture, double cost) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", cost=" + cost +
                '}';
    }
}
