package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    private int sqr;

    @Test
    void sqrService() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.sqrService(sqr);
        assertEquals(expected, actual);
    }
}