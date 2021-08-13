package model.repository.position_repository;

import model.bean.employee.Position;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepository implements IPositionRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Position> findAll() {
        List<Position> positions = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT *\n"
                    +"FROM `position`");
            ResultSet resultSet = preparedStatement.executeQuery();
            Position position = null;
             while (resultSet.next()) {
                 position = new Position();
                 position.setPositionId(resultSet.getInt("position_id"));
                 position.setPositionName(resultSet.getString("position_name"));
                 positions.add(position);
             }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return positions;
    }
}
