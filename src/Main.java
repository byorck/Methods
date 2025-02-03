import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task № 1");
        verifierLeapYear(1804);

        System.out.println("Task № 2");
        checkingProgramRelevance(1, 2025);

        System.out.println("Task № 3");
        int deliveryDays = deliveryTime(884);
        if (deliveryDays == 1) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDays == 2) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDays == 3) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void verifierLeapYear(int year) {
        if (year > 0 && year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            System.out.printf("%s год — високосный год", year);
        } else if (year < 0) {
            throw new RuntimeException("Введенный год отсутствует");
        } else {
            System.out.printf("%s год — невисокосный год", year);
        }
    }

    public static void checkingProgramRelevance(int system, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear && system == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (system == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < currentYear && system == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (system == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            throw new RuntimeException("Ошибка входящих параметров");
        }
    }

    public static int deliveryTime(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else if (deliveryDistance > 100) {
            return 4;
        } else {
            throw new IllegalAccessError("Ошибка ввода данных");
        }
    }
}


