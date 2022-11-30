import java.util.Scanner;

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

        //Задание 2.1 и 2.2
        System.out.println("Задание 2.1 и 2.2");

        int newMonthlyPayment = 15000;
        int totalSum = 0;
        int monthNumber = 0;
        while(totalSum<=12000000) {
            totalSum = totalSum + (totalSum*7/100);
            totalSum = totalSum + newMonthlyPayment;
            monthNumber++;
            if (monthNumber % 6 ==0) {  // это условие является решением задачи 2.2
                System.out.println("Месяц" + monthNumber + ", сумма накоплений - " + totalSum + " рублей");
            }
        }

        //Задание 2.3
        System.out.println("Задание 2.3");

        int nwMonthlyPayment = 15000;
        int nwTotalSum = 0;
        int nwMonthNumber = 0;
        while(nwMonthNumber<=108) {
            nwTotalSum = nwTotalSum + (nwTotalSum*7/100);
            nwTotalSum = nwTotalSum + nwMonthlyPayment;
            nwMonthNumber++;
            if (nwMonthNumber % 6 ==0) {
                System.out.println("Месяц" + nwMonthNumber + ", сумма накоплений - " + nwTotalSum + " рублей");
            }
        }

        //Задание 2.4
        System.out.println("Задание 2.4");

        int friday = 3;
        for (int day = 1; day <= 31; day++) {
            if ((day - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            }
        }

        //Задание 3.1
        System.out.println("Задание 3.1");

        int period = 79;
        int year = 0;
        int currentYear = 2022;
        int intervalYearsStart = currentYear - 200;
        int intervalYearsFinish = currentYear + 100;

        while (year <= intervalYearsFinish) {
            if (year % period == 0 && year > intervalYearsStart && year < intervalYearsFinish) {
                System.out.println(year);
            }
            year++;
        }

        //Задание 3.2
        System.out.println("Задание 3.2");

        //multiplication table
        Scanner in = new Scanner(System.in);
        System.out.println("Введите множитель от 1 до 10:");
        int multiplier = in.nextInt();
        for (int m = 1; m <= 10; m++) {
            int result = multiplier * m;
            System.out.println(multiplier + " * " + m + " = " + result);
        }
    }

}