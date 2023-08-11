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
    public static void determinationOfDeliveryTime(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("Время доставки составит " + day + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Время доставки составит " + (day + 1) + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Время доставки составит " + (day + 2) + " дня");
        } else {
            System.out.println("Доставки нет");

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
        determinationOfDeliveryTime(deliveryDistance);


    }
}






