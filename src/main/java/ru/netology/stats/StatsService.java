package ru.netology.stats;
public class StatsService {

    public long totalAmountOfSales(long[] sales){
        long total = 0;
        for( long month : sales ){
            total+=month;
        }
        return total;
    }

    public long averageAmountOfSales(long[] sales){
        long total = 0;
        long average;
        for(long month:sales){
            total+=month;
        }
        average=total/sales.length;
        return average;
    }

    public int monthMax(long[] sales){
        int maxMonth = 0;
        int month = 0;
        for(long sale: sales){
            if(sale >= sales[maxMonth]){
                maxMonth = month;
            }
            month++;
        }
        return maxMonth+1;
    }

    public int monthMin(long[] sales){
        int minMonth = 0;
        int month = 0;
        for(long sale: sales){
            if(sale <= sales[minMonth]){
                minMonth = month;
            }
            month++;
        }
        return minMonth+1;
    }

    public int lowerAverage(long[] sales){
        int sum = 0;
        long average = averageAmountOfSales(sales);
        for(long sale: sales){
            if (sale < average){
                sum++;
            }
        }

        return sum;
    }

    public int higherAverage(long[] sales){
        int sum = 0;
        long average = averageAmountOfSales(sales);

        for(long sale : sales){
            if(sale>average){
                sum++;
            }
        }

        return sum;
    }
}
