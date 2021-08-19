package model.repository;

import model.bean.Category;
import model.bean.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepoImpl implements ICategoryRepo {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT * \n" +
                            "FROM category\n");
            ResultSet resultSet = preparedStatement.executeQuery();
            Category category = null;
            while (resultSet.next()) {
                category = new Category();
                category.setCategoryId(resultSet.getInt("category_id"));
                category.setCategoryName(resultSet.getString("category_name"));
                categories.add(category);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return categories;
    }
}
