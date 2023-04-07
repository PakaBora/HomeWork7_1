public class Main {
    public static void main(String[] args) {
        System.out.println("Задание1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        ///задание 2
        System.out.println("Задание2");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        ///задание 3
        System.out.println("Задание3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        ///задание 4
        System.out.println("Задание4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        ///задание 5
        System.out.println("Задание5");

        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 00) {
                System.out.println(i + "год является високосным");
            }
        }
        /// задание 6
        System.out.println("Задание6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        ///задание 7
        System.out.println("Задание7");
        int number = 1;
        System.out.print(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println();

        ///задание 8
        System.out.println("Задание8");
        int part = 29_000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += part;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей");
        }
        ///задание9
        System.out.println("Задание9");
        double sumPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumPercent = (sumPercent + part) * (1 + percent);
            System.out.println("Месяц " + i + " сумма накоплений равна" + sumPercent + " рублей");
        }
        ///задание10
        System.out.println("Задание10");
        int N = 2;
        for (int i = 1; i <= 10; i++) {

            System.out.println(N + " * " + i + " = "
                    + N * i);

        }
    }
}
