public class Main {
    public static void main(String[] args) {

        int ticketPrice = 25681; // Cтоимость билета.
        int priceMiles = 20;  // За какое кол-во руб. начисляется одна миля.
        int bonusMiles = ticketPrice / priceMiles; // Кол-во бонусных миль

        System.out.println("Добрый день!");
        System.out.println("Стоимость Вашего билета составляет" + " " + (ticketPrice) + " " + "рублей");
        System.out.println();
        System.out.println("Поздравляем!");
        System.out.println("Вам начисленно" + " " + (bonusMiles) + " " + "бонусных миль");


    }


}
