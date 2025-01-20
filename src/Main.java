public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        int total = 0;
        int deposit = 15000;
        int i = 0;
        while (total <= 2459000) {
            total = total + deposit;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");

        System.out.println("\nЗадача 2");
        i = 0;
        while (i < 10) {
            i++;
            System.out.printf(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.printf(i + " ");
        }
        System.out.println();

        System.out.println("\nЗадача 3");
        int population = 12000000;
        int birth = 17;
        int death = 8;
        int populationGrowth = birth - death;
        for (i = 1; i <= 10; i++) {
            population = population + populationGrowth * (population / 1000);
            System.out.printf("Год %s, численность населения составляет %s\n", i, population);
        }
        System.out.println("\nЗадача 4");
        double capital = 15000;
        int month = 0;
        while (capital <= 12000000) {
            capital *= 1.07;
            month++;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", month, capital);
        }
        System.out.println("\nЗадача 5");
        capital = 15000;
        month = 0;
        while (capital <= 12000000) {
            capital *= 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", month, capital);
            }
        }
        System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", month, capital);

        System.out.println("\nЗадача 6");
        capital = 15000;
        month = 0;
        while (month < 9 * 12) {
            capital *= 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", month, capital);
            }
        }
        System.out.println("\nЗадача 7");
        int friday = 3;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("\nЗадача 8");
        int currentYear = 2025;
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;

        for (int year = startYear; year <= finishYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

//        for (int year = 0; year <= finishYear; year += 79) {
//            if (year >= startYear) {
//                System.out.println(year);
//            }
//        }
//
//        int year = 0;
//        while (year <= finishYear) {
//            if (year >= startYear) {
//                System.out.println(year);
//            }
//            year += 79;
//        }
    }
}