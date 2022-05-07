package ru.itsrv23.hw212.servises;

import org.springframework.stereotype.Service;
import ru.itsrv23.hw212.exception.CustomIllegalArgumentException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Integer sum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer subtract(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new CustomIllegalArgumentException("Деление на 0 запрещено. ");
        }
        return num1 / num2;
    }
}
