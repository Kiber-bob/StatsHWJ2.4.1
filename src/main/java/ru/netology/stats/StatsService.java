package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long calculateAverageSum(long[] sales) {
        long averageSum;
        averageSum = calculateSum(sales) / sales.length;
        return averageSum;
    }


    public long calculateFindMax(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateFindMin(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public long calculateAboveAverageSales(long[] sales) {
        int countMonth = 0;
        for (long sale : sales) {
            if (sale > calculateAverageSum(sales))
                countMonth++;
        }
        return countMonth;
    }

    public long calculateBelowAverageSales(long[] sales) {
        int countMonth = 0;
        for (long sale : sales) {
            if (sale < calculateAverageSum(sales))
                countMonth++;
        }
        return countMonth;
    }
}

