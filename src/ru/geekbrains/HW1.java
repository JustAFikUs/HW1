package ru.geekbrains;

public class HW1 {
    private static String Sergej;

    public static void main(String[] args) {

        //Список всех используемых переменных

        double t3p1 = 2;
        double t3p2 = 6;
        double t3p3 = 12;
        double t3p4 = 4;
        double t3p5 = 0;

        int t4p1 = 11;
        int t4p2 = 5;
        boolean t4p3 = false;

        int t5p1 = -28;

        int t6p1 = 89;

        int t8p1 = 2020;


        //Конец списка

        System.out.println("TASK 2");
        variatives();
        System.out.println();

        System.out.println("TASK 3");
        System.out.println(primer(t3p1, t3p2, t3p3, t3p4, t3p5));
        System.out.println();

        System.out.println("TASK 4");
        System.out.println(condition(t4p1, t4p2, t4p3));
        System.out.println();

        System.out.println("TASK 5");
        posorneg(t5p1);
        System.out.println();

        System.out.println("TASK 6");
        negorpos(t6p1);
        System.out.println();

        System.out.println("TASK 7");
        helloname("Sergej");
        System.out.println();

        System.out.println("TASK 8");
        yeartask(t8p1);
        System.out.println();

    }

    public static void variatives() {
        int per1 = 1;
        byte per2 = 2;
        short per3;
        per3 = 3;
        long per4;
        per4 = 4;

        double per5 = 5.5;
        float per6;
        per6 = 6.0f;

        char per7;
        per7 = 'S';

        boolean per8 = false;

        System.out.println("int " + per1);

        System.out.println("byte " + per2);

        System.out.println("short " + per3);

        System.out.println("long " + per4);

        System.out.println("double " + per5);

        System.out.println("float " + per6);

        System.out.println("char " + per7);

        System.out.println("boolean " + per8);
    }

    public static double primer(double a, double b, double c, double d, double e) {


        a = 1;
        b = 3;
        c = 6;
        d = 2;
        e = a * (b + (c / d));

        return e;
    }


    public static boolean condition(int s1, int s2, boolean ans) {

        int sum;

        sum = s1 + s2;

        if ((sum >= 10) && (sum <= 20)) {
            ans = true;
            return ans;
        }
        else {
            ans = false;
        }

        return ans;
    }


    public static int posorneg(int x1) {


        if (x1 >= 0) {
            System.out.println("x1 Positive");
        } else {
            System.out.println("x1 Negative");
        }
        return x1;
    }

    public static int negorpos(int x1) {


        if (x1 >= 0) {
            System.out.println("x1 False");
        } else {
            System.out.println("x1 True");
        }
        return x1;
    }
//
    public static void helloname (String name) {
        System.out.println("Hello " + name);
    }

    public static int yeartask(int x1) {

        if ((x1 % 4 == 0) && (x1 % 100 != 0)) {
                    System.out.println("LEAP YEAR");
            return x1;
                }

         else {
            System.out.println("USUAL YEAR");
            return x1;
        }

    }
}
