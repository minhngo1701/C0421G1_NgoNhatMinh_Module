package bai2.calculator.model.service;

import bai2.calculator.model.repository.CalculatorRepository;
import bai2.calculator.model.repository.CalculatorRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Autowired
    private CalculatorRepository calculatorRepository;
        @Override
        public Double calculatorSimple(String op, String number1, String number2) {
            return calculatorRepository.calculatorSimple(op, number1, number2);
        }

}
