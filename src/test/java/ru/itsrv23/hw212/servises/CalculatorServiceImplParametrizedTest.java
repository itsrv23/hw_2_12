package ru.itsrv23.hw212.servises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static ru.itsrv23.hw212.constance.CalculatorControllerTestConstance.*;

class CalculatorServiceImplParametrizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    private static Integer expected;
    private static Integer result;

    @BeforeEach
    void setUp(){
        expected =  null;
        result =  null;
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(FIRST_NUM_VAR_ONE, SECOND_NUM_VAR_ONE),
                Arguments.of(FIRST_NUM_VAR_TWO, SECOND_NUM_VAR_TWO)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    // IDEA генерирует методы с дефолтным модификатором доступа, в курсе используется public? Есть нюансы?
    void shouldSumTwoNumbers(Integer int1, Integer int2) {
        expected =  out.sum(int1, int2);
        result = int1 + int2;
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void shouldSubtractTwoNumbers(Integer int1, Integer int2) {
        expected =  out.subtract(int1, int2);
        result = int1 - int2;
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void shouldMultiplyTwoNumbers(Integer int1, Integer int2) {
        expected =  out.multiply(int1, int2);
        result = int1 * int2;
        assertEquals(expected, result);
    }


    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void shouldDivideTwoNumbers(Integer int1, Integer int2) {
        expected =  out.divide(int1, int2);
        result = int1 / int2;
        assertEquals(expected, result);
    }
}