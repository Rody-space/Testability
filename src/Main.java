public class Main {
        public static void main(String[] args) {
            // Создаем объект сервиса
            BonusMilesService service = new BonusMilesService();

            // Пример 1
            int price1 = 10_000;
            int miles1 = service.calculate(price1);
            System.out.println("Цена: " + price1 + " руб. Мили: " + miles1); // Ожидаем 500

            // Пример 2
            int price2 = 15_500;
            int miles2 = service.calculate(price2);
            System.out.println("Цена: " + price2 + " руб. Мили: " + miles2); // Ожидаем 775

            // Пример 3
            int price3 = 9_999;
            int miles3 = service.calculate(price3);
            System.out.println("Цена: " + price3 + " руб. Мили: " + miles3); // Ожидаем 499
    }

}
