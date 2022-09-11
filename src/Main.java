public class Main {
    public static void main(String[] args) {
        System.out.println("task 1-1");
        int contribution = 29000;
        int total = 0; // всего накоплено
        for (int i = 1; total < 2459000; i++) {
            total = total + contribution / 100;
            total = contribution + total;
            {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println();
        System.out.println("task 2-1");
        int i = 0;
        while (i >= 0 && i <= 9) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("task 3-1");

        int allPeopleInContry = 12_000_000;
        int birthPeople = 17;
        int deathPeople = 8;
        for (i = 1; i <= 10; i++) {
            birthPeople = allPeopleInContry * birthPeople / 1000 + allPeopleInContry;
            deathPeople = allPeopleInContry * deathPeople / 1000 + allPeopleInContry;
            allPeopleInContry = birthPeople - deathPeople + allPeopleInContry;
            System.out.println("Год " + i + " численность населения составляет " + allPeopleInContry);
        }


        System.out.println("task 1-2");
        int monthlyDeposit = 15000;
        int percent = 7;
        for (i = 1; i >= 1; i++) {
            monthlyDeposit = monthlyDeposit * percent / 100 + monthlyDeposit;
            if (monthlyDeposit <= 12000000) {
                System.out.println("Месяц " + i + " накоплено " + monthlyDeposit);
            }
        }

        System.out.println("task 2-2");
        int monthlyDeposit2 = 15000;
        int percent2 = 7;
        for (int a = 1; a >= 1; a++) {
            monthlyDeposit2 = monthlyDeposit2 * percent2 / 100 + monthlyDeposit2;
            if (monthlyDeposit2 <= 12000000) {
                if (a % 6 == 0) {
                    System.out.println("Месяц " + a + " накоплено " + monthlyDeposit2);
                }
            }
        }

        System.out.println("task 3-2");
        int monthlyDeposit3 = 15000;
        int percent3 = 7;
        for (int j = 1; j >= 1; j++) {
            monthlyDeposit3 = monthlyDeposit3 * percent3 / 100 + monthlyDeposit3;
            if (j <= 108) {
                if (j % 6 == 0) {
                    System.out.println("Месяц " + j + " накоплено " + monthlyDeposit3);
                }
            }
        }

        System.out.println("task 4-2");
        int friday = 5;
        for (int c = 5; c <= 31; c++) {
            if (c % friday == 0) {
                System.out.println("Сегодня пятница, " + c + " число. Необходимо сдать отчет.");
                friday = friday + 7;
            }
        }

        System.out.println("task 1-4");
        int year = 2022;
        int yearStart = year - 200;
        int yearEnd = year + 100;
        for (int k = yearStart; k <= yearEnd + 79; k++) {
            if (k % 79 == 0) {
                System.out.println(yearStart);
                yearStart = yearStart + 79;
            }
        }


        System.out.println("task 2-4");
        for (i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);

        }
    }
}
















