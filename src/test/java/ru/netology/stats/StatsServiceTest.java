package ru.netology.stats;

import org.junit.jupiter.api.Test;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] SalesTotal = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.calculateSum(SalesTotal);

        assertEquals(expected, actual);
    }




    @Test
     void shouldAvg() {
        StatsService service = new StatsService();
        long [] SalesTotal = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.avg(SalesTotal);

        assertEquals(expected, actual);
    }



    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] SalesTotal = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long expected = 8;
        long actual = service.maxSales(SalesTotal);

        assertEquals(expected, actual);
    }


    @Test
     void shouldMinSales() {
        StatsService service = new StatsService();
        long[] SalesTotal = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long expected = 9;
        long actual = service.minSales(SalesTotal);

        assertEquals(expected, actual);
    }



    @Test
    void shouldMonthMinSales() {
        StatsService service = new StatsService();
        long[] SalesTotal = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthMinSales(SalesTotal);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMonthMaxSales() {
        StatsService service = new StatsService();
        long[] SalesTotal = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long expected = 5;
        long actual = service.monthMaxSales(SalesTotal);

        assertEquals(expected, actual);
    }


}


