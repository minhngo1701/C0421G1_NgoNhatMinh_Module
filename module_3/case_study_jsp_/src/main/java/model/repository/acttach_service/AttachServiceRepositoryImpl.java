package model.repository.acttach_service;

import model.bean.contract.AttachService;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AttachServiceRepositoryImpl implements IAttachServiceRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<AttachService> findAll() {
        List<AttachService> attachServiceList = new ArrayList<>();
        AttachService attachService = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("SELECT *\n" +
                            " FROM accompanied_service;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                attachService = new AttachService();
                attachService.setAttachServiceId(resultSet.getInt("accompanied_service_id"));
                attachService.setAttachServiceName(resultSet.getString("accompanied_service_name"));
                attachService.setAttachServiceCost(resultSet.getDouble("price"));
                attachService.setUnit(resultSet.getString("unit"));
                attachService.setStatus(resultSet.getString("status"));
                attachServiceList.add(attachService);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return attachServiceList;
    }
}
