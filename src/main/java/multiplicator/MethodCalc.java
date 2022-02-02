package multiplicator;

public class MethodCalc{

    public static void main(String[]args){
        int a = 7;
        int b = 8;

        int summe = a + b;
        System.out.println(summe);
        System.out.println("Summe " + summe);

        double d = 2.356;
        System.out.println(Math.round(d * 100) / 100.0);

        byte by = 112;

        boolean b1 = (d != by);

        char c = 'a';

        System.out.println(b1);
        System.out.println((int) c);
    }
}
