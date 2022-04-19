/**
 * SkyPro. My code dz#2
 *
 * @author Раиль
 * @version dated Apr 16, 2022
 */
public class ExampleTwo {
    public static void main(String[] args) {

        System.out.println();
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке");
        System.out.println("");

        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else System.out.println("Установите версию приложения для Android по ссылке");
        System.out.println("");

        // Задание 3
        System.out.println("Задание 3");
        int year = 123456;
        if (year % 4 == 0 & (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " год является високосным");
        } else System.out.println(year + " негод не является високосным");
        System.out.println("");

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 60;
        if (deliveryDistance <= 100) {
            if (deliveryDistance <= 60 ) {
                if (deliveryDistance <= 20 ) {
                    System.out.println("Потребуется дней: 1");
                } else System.out.println("Потребуется дней: 2");
            } else System.out.println("Потребуется дней: 3");
        } else System.out.println("Доставка не производится");
        System.out.println("");

        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц - это зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц - это весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц - это лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц - это осень.");
                break;
            default:
                System.out.println(monthNumber + " - такого месяца не существует.");
        }
    }
}