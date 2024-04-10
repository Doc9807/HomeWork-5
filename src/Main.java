public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        int clientDevice = 1;

        if (clientDevice == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else if (clientDevice == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        } else {
            System.out.println("Такая система не поддерживается");
        }

        System.out.println("\nTask 2");
        int clientDeviceYear = 2015;

        if (clientDevice == 0 && clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        } else if (clientDevice == 0 && clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else if (clientDevice == 1 && clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
        } else if (clientDevice == 1 && clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }

        System.out.println("\nTask 3");
        int year = 2021;

        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.printf("«%s год является високосным».%n", year);
        } else {
            System.out.printf("«%s год не является високосным».%n", year);
        }

        System.out.println("\nTask 4");
        int deliveryDistance = 95;
        int daysDelivery = 1;

        if (deliveryDistance > 100) {
            System.out.println("«Приносим свои извинения, доставка в ваш регион не осуществляется.»");
            return;
        }
        if (deliveryDistance > 20) {
            daysDelivery++;
        }
        if (deliveryDistance > 60) {
            daysDelivery++;
        }
        System.out.println("«Потребуется дней: " + daysDelivery + "»");


        System.out.println("\nTask 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("«Зима»");
            case 3, 4, 5 -> System.out.println("«Весна»");
            case 6, 7, 8 -> System.out.println("«Лето»");
            case 9, 10, 11 -> System.out.println("«Осень»");
            default -> System.out.println("«Введён неправильный месяц»");
        }
    }
}