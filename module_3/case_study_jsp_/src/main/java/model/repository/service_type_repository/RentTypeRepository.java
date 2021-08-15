package model.repository.service_type_repository;

import model.bean.service_model.RentType;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class RentTypeRepository implements IRentTypeRepository{
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<RentType> findAll() {
        List<RentType> rentTypes = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT *\n"
                    +"FROM type_of_rent");
            ResultSet resultSet = preparedStatement.executeQuery();
            RentType rentType = null;
            while (resultSet.next()) {
                rentType = new RentType();
                rentType.setRentTypeId(resultSet.getInt("type_of_rent_id"));
                rentType.setRentTypeName(resultSet.getString("type_of_rent_name"));
                rentTypes.add(rentType);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rentTypes;
    }
}
