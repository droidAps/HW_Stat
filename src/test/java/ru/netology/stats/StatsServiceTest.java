package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        // подготавливаем данные:
        int expected = 180;

        // вызываем целевой метод:
        int actual = service.calculateSum(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSalesAmount() {
        // подготавливаем данные:
        int expected = 15;

        // вызываем целевой метод:
        int actual = service.calculateAverageSalesAmount(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void findMonthsWithMaximumSales() {
        // подготавливаем данные:
        int[] expected = {6, 8};

        // вызываем целевой метод:
        int[] actual = service.findMonthsWithMaximumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertArrayEquals(expected, actual);
    }

    @Test
    void findMonthsWithMinimumSales() {
        // подготавливаем данные:
        int[] expected = {9};

        // вызываем целевой метод:
        int[] actual = service.findMonthsWithMinimumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertArrayEquals(expected, actual);
    }

    @Test
    void findMonthsWithBelowAverageSales() {
        // подготавливаем данные:
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.findMonthsWithBelowAverageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void findMonthsWithAboveAverageSales() {
        // подготавливаем данные:
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.findMonthsWithAboveAverageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}