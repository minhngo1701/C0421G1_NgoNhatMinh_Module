package model.repository.education_repository;

import model.bean.employee.Education;
import model.bean.employee.Position;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationRepository implements IEducationRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Education> findAll() {
        List<Education> educations = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT *\n"
                    +"FROM education");
            ResultSet resultSet = preparedStatement.executeQuery();
            Education education = null;
             while (resultSet.next()) {
                 education = new Education();
                 education.setEdudcationId(resultSet.getInt("education_id"));
                 education.setEducationName(resultSet.getString("education_name"));
                 educations.add(education);
             }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return educations;
    }
}
