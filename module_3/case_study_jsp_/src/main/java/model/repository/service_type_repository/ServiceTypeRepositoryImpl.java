package model.repository.service_type_repository;

import model.bean.service_model.ServiceType;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceTypeRepositoryImpl implements IServiceTypeRepository {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<ServiceType> findAll() {
        List<ServiceType> serviceTypes = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT *\n" +
                            "FROM type_of_service");
            ResultSet resultSet = preparedStatement.executeQuery();
            ServiceType serviceType = null;
            while (resultSet.next()) {
                serviceType = new ServiceType();
                serviceType.setServiceTypeId(resultSet.getInt("type_of_service_id"));
                serviceType.setServiceTypeName(resultSet.getString("type_of_service_name"));
                serviceTypes.add(serviceType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return serviceTypes;
    }
}
