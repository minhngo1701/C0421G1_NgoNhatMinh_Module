package model.repository.type_of_customer_repository;

import model.bean.customer.TypeOfCustomer;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeOfCustomerRepositoryImpl implements ITypeOfCustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<TypeOfCustomer> findAll() {
        List<TypeOfCustomer> typeOfCustomers = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT *\n" +"FROM type_of_customer");
            ResultSet resultSet = preparedStatement.executeQuery();
            TypeOfCustomer typeOfCustomer = null;
            while (resultSet.next()) {
                typeOfCustomer = new TypeOfCustomer();
                typeOfCustomer.setTypeCusId(resultSet.getInt("type_of_customer_id"));
                typeOfCustomer.setTypeOfCustomerName(resultSet.getString("type_of_customer_name"));
                typeOfCustomers.add(typeOfCustomer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return typeOfCustomers;
    }
}
