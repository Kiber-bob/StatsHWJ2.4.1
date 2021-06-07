package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }


    public long calculateAverageSum(long[] purchases) {
        long averageSum;
        averageSum = calculateSum(purchases) / purchases.length;
        return averageSum;
    }


    public int calculateFindMax(long[] purchases) {
        int maxMonth = 0;
        int month = 0;
        for (long purchase : purchases) {

            if (purchase >= purchases[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateFindMin(long[] purchases) {
        int minMonth = 0;
        int month = 0;
        for (long sale : purchases) {

            if (sale <= purchases[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public long calculateAboveAverageSales(long[] purchases, long average) {
        int countMonth = 0 ;
        for (long purchase : purchases) {
            if (purchase > average)
                countMonth++;
        }
        return countMonth;
    }

    public long calculateBelowAverageSales(long[] purchases, long average) {
        int countMonth = 0;
        for (long purchase : purchases) {
            if (purchase < average)
                countMonth++;
        }
        return countMonth;
    }
}

