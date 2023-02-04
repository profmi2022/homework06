import java.time.LocalDate;

public class Main {

    public static void checkYear(int year) {

        boolean leapYear1 = (year % 4 == 0);
        boolean leapYear2 = (year % 100 != 0);
        boolean leapYear3 = (year % 400 == 0);
        if ((leapYear1) && (leapYear2) || (leapYear3)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void checkPhone(int clientOs, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        boolean textVariant1 = (clientOs == 0 && clientDeviceYear >= currentYear);
        boolean textVariant2 = (clientOs == 0 && clientDeviceYear < currentYear);
        boolean textVariant3 = (clientOs == 1 && clientDeviceYear >= currentYear);
        boolean textVariant4 = (clientOs == 1 && clientDeviceYear < currentYear);
        if (textVariant1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (textVariant2) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (textVariant3) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (textVariant4) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {

        int days;

        if (deliveryDistance >= 100) {
            days = 0;
        } else if (deliveryDistance <= 20) {
            days = 1;
        } else {
            days = 2 + (deliveryDistance - 20) / 40;
        }
        return days;
    }

    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {

        checkYear(2025);
    }

    public static void task2() {

        checkPhone(1, 2023);
    }

    public static void task3() {

        System.out.println("Потребуется дней " + calculateDeliveryDays(95));
    }
}