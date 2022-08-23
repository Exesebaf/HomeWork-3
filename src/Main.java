public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

    public static void Task1() {
        int clientOS = 5;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке!");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке!");
        } else {
            System.out.println("Извините данное приложение не поддерживаеться на вашем устройстве!");
        }
    }


    public static void Task2() {
        int clientOS = 1;
        int phoneManufacturedYear = 2016;

        if (phoneManufacturedYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке!");

        } else if (clientOS == 0 && phoneManufacturedYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке!");
        } else if (phoneManufacturedYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && phoneManufacturedYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Извините данное приложение не поддерживаеться на вашем устройстве!");
        }
    }


    public static void Task3() {
        int year = 1900;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + " Год является высококосным");
        } else {
            System.out.println(year + " Год не является высококосным");
        }


    }

    public static void Task4() {

        int deliveryDistance = 95;
        int deloveryDays = 1;
        if (deliveryDistance > 20) {
            deloveryDays++;
        }
        if (deliveryDistance > 60) {
            deloveryDays++;
        }
        System.out.println("Потребуется дней на доставку " + deloveryDays);

    }

    public static void Task5() {
        int numberOfMonth = 12;

        switch (numberOfMonth) {
            case 1:
                System.out.println("Январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето");
            case 8:
                System.out.println("Август принадлежит к сезону лето");
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень");
            case 10:
                System.out.println("Октябрь принадлежит к сезону осень");
            case 11:
                System.out.println("Ноябрь принадлежит к сезону осень");
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого года не существует");
        }
    }
}