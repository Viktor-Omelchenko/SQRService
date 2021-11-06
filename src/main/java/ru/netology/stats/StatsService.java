package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        {

            for (long sale : sales) {
                sum = sum + sale;
            }
            return sum;
        }
    }

    public long avg(long[] sales) {
        return calculateSum(sales) / sales.length;
    }


    public long maxSales(long[] sales) {
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


    public int minSales(long[] sales) {
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


    public int monthMinSales(long[] sales) {
        long avg = avg(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale < avg) {
                month++;
            }
        }
            return month;
        }



    public int monthMaxSales(long[] sales) {
        long avg = avg(sales);
        int month = 0;
        for (long sale : sales) {
           if (sale > avg) {
                month++;
            }
        }

        return month;
    }



}


