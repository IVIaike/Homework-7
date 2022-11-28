public class Cycles2 {
    public static void main(String[] args) {

        //Задание 1.1
        System.out.println("Задание 1.1");
        int money = 0;
        int monthlyPayment = 15000;
        int month = 0;
        while (money <= 2459000) {
            money = money + monthlyPayment;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + money + " рублей.");
        }

        //Задание 1.2
        System.out.println("Задание 1.2");

        int i=1;
        System.out.print("\n" + i);
        while (i<10) {
            i++;
            System.out.print(i);
        }
        System.out.print("\n");
        for (int y=10; y>=1; y--) {
            System.out.print(y);
        }
        System.out.print("\n");

        //Задание 1.3
        System.out.println("Задание 1.3");

        double population = 12000000.0;
        double populationGrowth = (17-8)/1000.0;
        for (int year=1; year<=10; year++) {
            population = population + (population * populationGrowth);
            System.out.println("Год "  + year + ", численность населения составляет " + population + " человек.");
        }

    }
}