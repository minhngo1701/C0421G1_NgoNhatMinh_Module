package model.repository.detail_contract_repository;

import model.bean.contract.DetailContract;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DetailContractRepositoryImpl implements IDetailContractRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public void createDetailContract(DetailContract detailContract) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("INSERT INTO contract_detail(contract_id,accompanied_service_id,amount)\n" +
                            "VALUES (?,?,?);");
            preparedStatement.setString(1,detailContract.getContractId()+"");
            preparedStatement.setString(2,detailContract.getAttachServiceId()+"");
            preparedStatement.setString(3,detailContract.getQuantity()+"");
            preparedStatement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

}
