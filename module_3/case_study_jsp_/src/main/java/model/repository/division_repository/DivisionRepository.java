package model.repository.division_repository;

import model.bean.employee.Division;
import model.bean.employee.Position;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivisionRepository implements IDivisionRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Division> findAll() {
        List<Division> divisions = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT *\n"
                    +"FROM part");
            ResultSet resultSet = preparedStatement.executeQuery();
            Division division = null;
             while (resultSet.next()) {
                 division = new Division();
                 division.setDivisionId(resultSet.getInt("part_id"));
                 division.setDivisionName(resultSet.getString("part_name"));
                 divisions.add(division);
             }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return divisions;
    }
}
