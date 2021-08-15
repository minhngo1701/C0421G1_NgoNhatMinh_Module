package model.repository.contract_repository;

import model.bean.contract.Contract;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepositoryImpl implements IContractRepository{
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Contract> findAll() {
        List<Contract> contractList = new ArrayList<>();
        Contract contract = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("SELECT *\n" +
                            " FROM contract;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                contract = new Contract();
                contract.setIdContract(resultSet.getInt("contract_id"));
                contract.setIdEmployee(resultSet.getInt("employee_id"));
                contract.setIdCustomer(resultSet.getInt("customer_id"));
                contract.setIdService(resultSet.getInt("service_id"));
                contract.setStartDate(resultSet.getString("date_start_contract"));
                contract.setEndDate(resultSet.getString("date_end_contract"));
                contract.setTotalMoney(resultSet.getDouble("money_deposit"));
                contractList.add(contract);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return contractList;
    }

    @Override
    public void createContract(Contract contract) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("INSERT INTO contract(employee_id,customer_id,service_id,date_start_contract,date_end_contract,contract_total,money_deposit) values (?,?,?,?,?,?,?);");
            preparedStatement.setString(1,contract.getIdEmployee()+"");
            preparedStatement.setString(2,contract.getIdCustomer()+"");
            preparedStatement.setString(3,contract.getIdService()+"");
            preparedStatement.setString(4,contract.getStartDate());
            preparedStatement.setString(5,contract.getEndDate());
            preparedStatement.setString(6,contract.getTotalMoney()+"");
            preparedStatement.setString(7,contract.getDeposit()+"");
            preparedStatement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
