//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isLeapYear(int year) {
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        return leapYear;
    }

    public static String osTypeAndYear(int clientOs, int deviceYear) {
        String operationSystem;
        if (clientOs == 0) {
            operationSystem = "iOS";
        } else {
            operationSystem = "Android";
        }
        if (deviceYear >= 2015) {
            operationSystem = "обычную версию для " + operationSystem;
            ;
        } else {
            operationSystem = "облегченную версию для " + operationSystem;
            ;
        }
        return operationSystem;
    }

    public static int deliveryTime(int deliveryDistance) {
        int deliveryTime;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
        } else if (deliveryDistance < 60) {
            deliveryTime = 2;
        } else if (deliveryDistance < 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = 0;
            System.out.println("Доставки нет!");
            ;
        }

        return deliveryTime;

    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 1708;
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }

        System.out.println("Задача 2");
        int clientOs = 0;
        int deviceYear = 2016;
        System.out.println("Установите " + osTypeAndYear(clientOs,deviceYear));

        System.out.println("Задача 3");
        int distance = 22;
        if (deliveryTime(distance) > 0) {
            System.out.println("Потребуется дней: " + deliveryTime(distance));
        }
    }
}
