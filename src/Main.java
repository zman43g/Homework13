//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isLeapYear(int year) {
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        return leapYear;
    }

    public static String printVersionAndOs(int clientOs, int deviceYear) {
        String operationSystem;
        if (clientOs == 0) {
            operationSystem = "iOS";
        } else {
            operationSystem = "Android";
        }
        if (deviceYear >= 2015) {
            operationSystem = "Установите обычную версию для " + operationSystem;
        } else {
            operationSystem = "Установите облегченную версию для " + operationSystem;
        }
        System.out.println(operationSystem);
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
        }
        if (deliveryTime > 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
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
        int clientOs = 1;
        int deviceYear = 2013;
        printVersionAndOs(clientOs, deviceYear);

        System.out.println("Задача 3");
        int distance = 11;
        deliveryTime(distance);

    }
}
