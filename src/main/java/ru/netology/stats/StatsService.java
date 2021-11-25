package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSalesAmount(int[] sales) {
        int average = calculateSum(sales) / sales.length;
        return average;
    }

    public int findMonthsWithMaximumSales(int[] sales) {
        int maxMonth = 0;
        int max = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= max) {
                max = sales[i];
                maxMonth = i + 1;                  // Во избежание появления нулевого номера месяца к переменной j прибавляется 1
            }
        }
        return maxMonth;
    }

    public int findMonthsWithMinimumSales(int[] sales) {
        int minMonth = 0;
        int min = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= min) {
                min = sales[i];
                minMonth = i + 1;                  // Во избежание появления нулевого номера месяца к переменной j прибавляется 1
            }
        }
        return minMonth;
    }

    public int findMonthsWithBelowAverageSales(int[] sales) {
        int monthCounter = 0;
        int averageSales = calculateAverageSalesAmount(sales);
        for (int sale : sales) {
            if (sale < averageSales) {
                monthCounter += 1;
            }
        }
        return monthCounter;
    }

    public int findMonthsWithAboveAverageSales(int[] sales) {
        int monthCounter = 0;
        int averageSales = calculateAverageSalesAmount(sales);
        for (int sale : sales) {
            if (sale > averageSales) {
                monthCounter += 1;
            }
        }
        return monthCounter;
    }
}
