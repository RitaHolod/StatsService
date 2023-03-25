package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

    @Test

    public void totalAmountOfSalesTest() {
        StatsService service = new StatsService();
        long expected = 180;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.totalAmountOfSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void averageAmountOfSalesTest(){
        StatsService service = new StatsService();
        long expected = 15;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageAmountOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void monthMaxTest(){
        StatsService service = new StatsService();
        int expected = 8;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthMax(sales);

        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void monthMinTest(){
        StatsService service = new StatsService();
        int expected = 9;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthMin(sales);

        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void lowerAverageTest(){

        StatsService service = new StatsService();
        int expected = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.lowerAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void higherAverageTest(){
        StatsService service = new StatsService();

        int expected = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.higherAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
