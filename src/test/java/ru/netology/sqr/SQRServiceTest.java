package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void schouldCalculate() {
        SQRService service = new SQRService();
        int num = 3;
        int expected = 3;

        int actual = service.calculate(num);

        assertEquals(expected, actual);
    }
}