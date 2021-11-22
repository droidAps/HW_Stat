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

    public int[] findMonthsWithMaximumSales(int[] sales) {
        // Определение макс. суммы продаж:
        int max = 0;
        for (int sale : sales) {
            if (max < sale) {
                max = sale;
            }
        }
        // Определение количества месяцев с макс. суммой продаж:
        int i = 0;
        for (int sale : sales) {
            if (max == sale) {
                i += 1;
            }
        }
        // Инициализация массива месяцев с макс. суммой продаж (по номерам):
        int[] months = new int[i];
        int k = 0;
        for (int j = 0; k < i; j++) {
            if (sales[j] == max) {
                months[k] = j + 1;                  // Во избежание появления нулевого номера месяца к переменной j прибавляется 1
                k += 1;
            }

        }
        return months;
    }

    public int[] findMonthsWithMinimumSales(int[] sales) {
        // Определение мин. суммы продаж:
        int min = sales[0];
        for (int sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        // Определение количества месяцев с мин. суммой продаж:
        int i = 0;
        for (int sale : sales) {
            if (min == sale) {
                i += 1;
            }
        }
        // Инициализация массива месяцев с мин. суммой продаж (по номерам):
        int[] months = new int[i];
        int k = 0;
        for (int j = 0; k < i; j++) {
            if (sales[j] == min) {
                months[k] = j + 1;                  // В связи с тем, что номер месяца находится в диапазоне 1...12, к переменной j прибавляется 1
                k += 1;
            }

        }
        return months;
    }

    public int findMonthsWithBelowAverageSales(int[] sales) {
        int monthCounter = 0;
        for (int sale : sales) {
            if (sale < calculateAverageSalesAmount(sales)) {
                monthCounter += 1;
            }
        }
        return monthCounter;
    }

    public int findMonthsWithAboveAverageSales(int[] sales) {
        int monthCounter = 0;
        for (int sale : sales) {
            if (sale > calculateAverageSalesAmount(sales)) {
                monthCounter += 1;
            }
        }
        return monthCounter;
    }
}
