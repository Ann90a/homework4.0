
// задача 1

public class Main {
    public static void main(String[] args) {
        int a = 123456789;
        byte b = 113;
        short c = 27778;
        long d = -9876544322198L;
        float f = 1.5F;
        double j = 2.5;

        System.out.println("int = " + a);
        System.out.println("byte = " + b);
        System.out.println("short = " + c);
        System.out.println("long = " + d);
        System.out.println("float = " + f);
        System.out.println("double = " + j);

        // задача 2

        int i1 = 27897;
        byte b1 = 67;
        short s1 = -159;
        long l1 = 987678965549L;
        float f1 = 27.12F;
        double d1 = 2.786;
        char c1 = 569;
        boolean b2 = false;

        System.out.println(i1);
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(c1);
        System.out.println(b2);

        // задача 3

        int ludmilaPav = 23;
        int annaSer = 27;
        int ekaterinaAnd = 30;
        int paper = 480;
        int pupils = ludmilaPav + annaSer + ekaterinaAnd;
        int numberOfSheets = paper / pupils;
        System.out.println("На каждого ученика рассчитано " + numberOfSheets + " листов бумаги");

        // задача 4

        int performance = 16;
        int minutes = 2;
        int oneBottleCapacity = performance / minutes;
        int oneMinute = 60;

        int time1 = 20;
        String time11 = time1 + (" минут");
        int result1 = time1 * oneBottleCapacity;
        System.out.println("За " + time11 + " машины произвела бутылок " + result1 + " штук");

        int time2 = 24;
        String time12 = (" 1 сутки");
        int result2 = time2 * oneMinute * oneBottleCapacity;
        System.out.println("За " + time12 + " машины произвела бутылок " + result2 + " штук");

        int time3 = 3;
        String time13 = time3 + (" три дня");
        int result3 = time2 * oneMinute * time3 * oneBottleCapacity;
        System.out.println("За " + time13 + " машины произвела бутылок " + result3 + " штук");

        int time4 = 30;
        String time14 = time4 + (" один месяц");
        int result4 = time2 * oneMinute * time4 * oneBottleCapacity;
        System.out.println("За " + time14 + " машины произвела бутылок " + result4 + " штук");

        // задача 5

        int banks = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int overallColor = whitePaint + brownPaint;
        int totalClasses = banks / overallColor;
        int oneClassWhite = totalClasses * whitePaint;
        int oneClassBrown = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно "  + oneClassWhite + " банок белой краски и " + oneClassBrown + " банок коричневой краски.");

        //задача 6

        int bananas = 80 * 5;
        int milk = 105 * 2;
        int iceCream = 100  * 2;
        int egg = 70 * 4;
        int inGrams = bananas + milk + iceCream + egg;
        float inKilograms = inGrams / 1000F;
        System.out.println("Вес спорт-завтрака " + inGrams + " грамм, в килограммах - " + inKilograms + " килограмм");

        // задача 7

        int weightLoss = 7000;
        int weightLossPerDay1 = 250;
        int weightLossPerDay2 = 500;
        int conclusion1 = weightLoss / weightLossPerDay1;
        System.out.println("Если спорьсмен будет терять 250 грамм каждый день, на похудение уйдет " + conclusion1 + " дней");

        int conclusion2 = weightLoss / weightLossPerDay2;
        System.out.println("Если спорьсмен будет терять 500 грамм каждый день, на похудение уйдет" + conclusion2 + " дней");

        int gramsAverage = (weightLossPerDay1 + weightLossPerDay2) / 2;
        System.out.println("Среднее количество равно " + gramsAverage + " грамм");

        double onAverageDays = (double) weightLoss / gramsAverage;
        System.out.print("В среднем на похудение потребуется ");
        System.out.printf("%.1f", onAverageDays);
        System.out.print(" дней");


    }
    }



