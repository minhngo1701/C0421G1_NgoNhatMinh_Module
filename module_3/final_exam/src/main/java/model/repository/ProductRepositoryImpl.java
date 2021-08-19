package model.repository;

import model.bean.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT * \n" +
                            "FROM product\n");
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product = null;
            while (resultSet.next()) {
                product = new Product();
                product.setProductId(resultSet.getInt("product_id"));
                product.setProductName(resultSet.getString("product_name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setQuantity(resultSet.getInt("number_product"));
                product.setColor(resultSet.getString("color"));
                product.setDescript(resultSet.getString("descript"));
                product.setCategoryId(resultSet.getInt("category_id"));
                products.add(product);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT * \n" +
                            "FROM product\n" + "WHERE product_id= ?");
            preparedStatement.setString(1, id + "");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                product = new Product();
                product.setProductId(resultSet.getInt("product_id"));
                product.setProductName(resultSet.getString("product_name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setQuantity(resultSet.getInt("number_product"));
                product.setColor(resultSet.getString("color"));
                product.setDescript(resultSet.getString("descript"));
                product.setCategoryId(resultSet.getInt("category_id"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public void create(Product product) {
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("INSERT INTO product (product_name ,price ,number_product,color,descript,category_id)\n" +
                            "VALUES (?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setString(2, product.getPrice() + "");
            preparedStatement.setString(3, product.getQuantity() + "");
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescript());
            preparedStatement.setString(6, product.getCategoryId() + "");
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(Product product) {
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("UPDATE product\n" +
                            "SET product_name = ? ,price = ? ,number_product = ?,color = ?,descript = ?,category_id = ?\n" +
                            "WHERE product_id = ?");
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setString(2, product.getPrice() + "");
            preparedStatement.setString(3, product.getQuantity() + "");
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getDescript());
            preparedStatement.setString(6, product.getCategoryId() + "");
            preparedStatement.setString(7, product.getProductId() + "");
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("DELETE FROM product\n"
                            + "WHERE product_id = ?");
            preparedStatement.setString(1, id + "");
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
