package bai2.calculator.model.service;

import bai2.calculator.model.repository.CalculatorRepository;
import bai2.calculator.model.repository.CalculatorRepositoryImpl;
import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImpl implements CalculatorService {
    private CalculatorRepository calculatorRepository = new CalculatorRepositoryImpl();
        @Override
        public Double calculatorSimple(String op, String number1, String number2) {
            return calculatorRepository.calculatorSimple(op, number1, number2);
        }

}
