package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalculateNumberBetween200And300() {

        SQRService service = new SQRService();
        int actual = service.calculateNumber(200, 300);
        int expected = 3;
        assertEquals(expected, actual);


    }

    @Test
    public void shouldCalculateNumberBetween0And200() {

        SQRService service = new SQRService();
        int actual = service.calculateNumber(0, 200);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberBetweenMinus100And200() {

        SQRService service = new SQRService();
        int actual = service.calculateNumber(-100, 200);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberBetweenMinus100And0() {

        SQRService service = new SQRService();
        int actual = service.calculateNumber(-100, 0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateNumberBetweenMinus200AndMinus50() {

        SQRService service = new SQRService();
        int actual = service.calculateNumber(-200, -50);
        int expected = 0;
        assertEquals(expected, actual);
    }


}



