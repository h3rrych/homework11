import java.time.LocalDate;
import java.util.Scanner;
public class Main {


    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }

    }

    public static void printSeparator() {
        System.out.println("==============");
    }

    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (osType == 0 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для IOS");
        } else if (osType == 0 && deviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для IOS");
        } else if (osType == 1 && deviceYear < currentYear) {
            System.out.println("Установите облеченную версию прилоежния для Android");
        } else if (osType == 1 && deviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для Андроид");
        }
    }
    public static int determinationOfDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return  2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return 4;

        }
    }


    public static void main(String[] args) {
        System.out.println("Домашка 11");
        printSeparator();

        System.out.println("Задача 1");
        System.out.println("Введите год");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        leapYear(year);

        printSeparator();

        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        int deviceYear = 2010;
        suggestAppVersion(0, 2012);

        printSeparator();

        System.out.println("Задача 3");
        System.out.println("Введите расстояние до вашего города");
        Scanner sc1 = new Scanner(System.in);
        int deliveryDistance = sc1.nextInt();
        int deliveryDays = determinationOfDeliveryTime(deliveryDistance);
        if (deliveryDays == 4) {
            System.out.println("Доставка в ваш город невозможна");
        } else {
            System.out.println("Потребуется дней " + deliveryDays);
        }



    }
}






