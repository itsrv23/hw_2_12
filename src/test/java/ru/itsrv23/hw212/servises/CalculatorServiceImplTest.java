package ru.itsrv23.hw212.servises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.itsrv23.hw212.exception.CustomIllegalArgumentException;

import static org.junit.jupiter.api.Assertions.*;
import static ru.itsrv23.hw212.constance.CalculatorControllerTestConstance.*;

class CalculatorServiceImplTest {
    private final CalculatorService out = new CalculatorServiceImpl();
    private static Integer expected;
    private static Integer result;

    @BeforeEach // Выполняется перед каждым вызовом теста. Этот код излишний, но добавил в качестве примера для себя
    void setUp(){
        expected =  null;
        result =  null;
    }

    @Test
    public void shouldSumTwoNumbersV1() {
        expected = out.sum(FIRST_NUM_VAR_ONE, SECOND_NUM_VAR_ONE);
        result = FIRST_NUM_VAR_ONE + SECOND_NUM_VAR_ONE;
        assertEquals(expected, result);
    }

    @Test
    public void shouldSumTwoNumbersV2() {
        expected = out.sum(FIRST_NUM_VAR_TWO, SECOND_NUM_VAR_TWO);
        result = FIRST_NUM_VAR_TWO + SECOND_NUM_VAR_TWO;
        assertEquals(expected, result);
    }


    @Test
    public void shouldSubtractTwoNumbersV1() {
        expected = out.subtract(FIRST_NUM_VAR_ONE, SECOND_NUM_VAR_ONE);
        result = FIRST_NUM_VAR_ONE - SECOND_NUM_VAR_ONE;
        assertEquals(expected, result);
    }

    @Test
    public void shouldSubtractTwoNumbersV2() {
        expected = out.subtract(FIRST_NUM_VAR_TWO, SECOND_NUM_VAR_TWO);
        result = FIRST_NUM_VAR_TWO - SECOND_NUM_VAR_TWO;
        assertEquals(expected, result);
    }

    @Test
    public void shouldMultiplyTwoNumbersV1() {
        expected =  out.multiply(FIRST_NUM_VAR_ONE, SECOND_NUM_VAR_ONE);
        result =  FIRST_NUM_VAR_ONE * SECOND_NUM_VAR_ONE;
        assertEquals(expected, result);
    }

    @Test
    public void shouldMultiplyTwoNumbersV2() {
        expected =  out.multiply(FIRST_NUM_VAR_TWO, SECOND_NUM_VAR_TWO);
        result =  FIRST_NUM_VAR_TWO * SECOND_NUM_VAR_TWO;
        assertEquals(expected, result);
    }

    @Test
    public void shouldDivideTwoNumbersV1() {
        expected =  out.divide(FIRST_NUM_VAR_ONE, SECOND_NUM_VAR_ONE);
        result =  FIRST_NUM_VAR_ONE / SECOND_NUM_VAR_ONE;
        assertEquals(expected, result);
    }
    @Test
    public void shouldDivideTwoNumbersV2() {
        expected =  out.divide(FIRST_NUM_VAR_TWO, SECOND_NUM_VAR_TWO);
        result =  FIRST_NUM_VAR_TWO / SECOND_NUM_VAR_TWO;
        assertEquals(expected, result);
    }

    @Test
    public void shouldThrowCustomIllegalArgumentExceptionWhenDivisionByZero(){
        assertThrows(CustomIllegalArgumentException.class, (()-> out.divide(FIRST_NUM_VAR_ONE,ZERO)));
    }

}