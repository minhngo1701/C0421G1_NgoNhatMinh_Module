package bai2.calculator.model.repository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.CallableStatement;

public class CalculatorRepositoryImpl implements CalculatorRepository {
    @Override
    public Double calculatorSimple(String op, String number1, String number2) {

            double result = 0;
            switch (op) {
                case "Addition(+)":
                    result =  Double.parseDouble(number1) + Double.parseDouble(number2);
                    break;
                case "Subtraction(-)":
                    result =  Double.parseDouble(number1) - Double.parseDouble(number2);
                    break;
                case "Multiplication(X)":
                    result =  Double.parseDouble(number1) * Double.parseDouble(number2);
                    break;
                case "Division(/)":
                    result =  Double.parseDouble(number1) / Double.parseDouble(number2);
                    break;
            }
            return result;

    }
}
