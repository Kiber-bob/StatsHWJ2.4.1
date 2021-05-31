package ru.netology.stats;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }


    @Test
    void calculateAverageSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverageSum(purchases);

        assertEquals(expected, actual);
    }


    @Test
    void calculateFindMax() {
        StatsService service = new StatsService();
        long[] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.calculateFindMax(purchase);

        assertEquals(expected, actual);
    }

    @Test
    void calculateFindMin() {
        StatsService service = new StatsService();
        long[] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.calculateFindMin(purchase);

        assertEquals(expected, actual);
    }


    @Test
    void calculateAboveAverageSales() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateAboveAverageSales(purchases, service.calculateAverageSum(purchases));

        assertEquals(expected, actual);
    }


    @Test
    void calculateBelowAverageSales() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service. calculateBelowAverageSales(purchases, service.calculateAverageSum(purchases));

        assertEquals(expected, actual);
    }
}
