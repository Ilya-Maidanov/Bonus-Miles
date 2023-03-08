public class Main {
    public static void main(String[] args) {

        int ticketprice = 25681; // Cтоимость билета.
        int pricemiles = 20;  // За какое кол-во руб. начисляется одна миля.
        int bonusmiles = ticketprice / pricemiles; // Кол-во бонусных миль

        System.out.println("Добрый день!");
        System.out.println("Стоимость Вашего билета составляет" + " " + (ticketprice) + " " + "рублей");
        System.out.println();
        System.out.println("Поздравляем!");
        System.out.println("Вам начисленно" + " " + (bonusmiles) + " " + "бонусных миль");



    }


}
