package model.repository.service_repository;

import model.bean.service_model.Service;
import model.repository.BaseRepository;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl implements IServiceRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Service> findAll() {
        List<Service> services = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT *\n" +
                            "FROM service");
            ResultSet resultSet = preparedStatement.executeQuery();
            Service service = null;
            while (resultSet.next()) {
                service = new Service();
                service.setServiceId(resultSet.getInt("service_id"));
                service.setServiceName(resultSet.getString("service_name"));
                service.setArea(resultSet.getDouble("service_area"));
                service.setFloor(resultSet.getInt("number_of_floor"));
                service.setAmountPersonMax(resultSet.getInt("service_max_people"));
                service.setRentCost(resultSet.getDouble("service_cost"));
                service.setStandardRoom(resultSet.getString("standard_room"));
                service.setDescription(resultSet.getString("description_other_convenience"));
                service.setTypeOfRentId(resultSet.getInt("rent_type_id"));
                service.setTypeOfServiceId(resultSet.getInt("service_type_id"));
                service.setStatus(resultSet.getString("status"));
                services.add(service);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return services;
    }

    @Override
    public void create(Service service) {
        try {
            CallableStatement callableStatement =
                    this.baseRepository.getConnection().prepareCall("CALL create_service_sp(?,?,?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, service.getServiceName());
            callableStatement.setString(2, service.getArea() + "");
            callableStatement.setString(3, service.getFloor() + "");
            callableStatement.setString(4, service.getAmountPersonMax() + "");
            callableStatement.setString(5, service.getRentCost() + "");
            callableStatement.setString(6, service.getStandardRoom());
            callableStatement.setString(7, service.getDescription());
            callableStatement.setString(8, service.getTypeOfRentId()+"");
            callableStatement.setString(9, service.getTypeOfServiceId()+"");
            callableStatement.setString(10, service.getStatus());
            callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
