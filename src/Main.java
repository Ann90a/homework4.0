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


        // задача 5

        int banks = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int overallColor = whitePaint + brownPaint;
        int totalClasses = banks / overallColor;
        int oneClassWhite = totalClasses * whitePaint;
        int oneClassBrown = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно "  + oneClassWhite + " банок белой краски и " + oneClassBrown + " банок коричневой краски.");



    }
}