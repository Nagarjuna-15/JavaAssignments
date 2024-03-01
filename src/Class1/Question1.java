package Class1;

public class Question1 {
    public static void main(String args[])
    {
        int a1 = 127638923;
        float b1 = 1.4f;
        char c1 = 'c';
        short d1 = 99;
        long e1 = 643833637;

        /*Widening*/
        double a2 = a1;
        double b2 = b1;
        int c2 = c1;
        float d2 = d1;
        float e2 = e1;

        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(e2);

        /*Narrowing*/

        System.out.println((long)a2);
        System.out.println((int)b1);
        System.out.println((short)c2);
        System.out.println((char)d2);
        System.out.println((int)e2);

    }


}
