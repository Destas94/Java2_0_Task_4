public class HolidayGift {
        public static void generateGift (){
            JellyBean jel1 = new JellyBean("Мармеладки", 150, 19.90, "Зелёные");
            JellyBean jel2 = new JellyBean("Мармеладные бобы", 175, 19.95, "Розовые");
            JellyBean jel3 = new JellyBean("Черничные бобы", 130, 17.95, "Синие");
            Candy can1 = new Candy("Шоколадные конфеты", 250, 13.30, "Квадратные");
            Candy can2 = new Candy("Фруктовые леденцы", 210, 14.50, "Круглые");
            Candy can3 = new Candy("Ореховые", 190, 9.90, "Шарооборазные");
            Bisquit bis1 = new Bisquit("1st brand", 310, 18.95, "С шоколадом");
            Bisquit bis2 = new Bisquit("2nd brand", 350, 22.50, "С джемом");
            Bisquit bis3 = new Bisquit("3rd brand", 290, 16.00, "С кремом");
            Sweets [] giftbox = {jel2, can1, can3, bis3};
            double sumPrice = 0;
            int sumWeight = 0;
            for (Sweets giftprice: giftbox) {
                sumPrice += giftprice.getPrice();
            }
            for (Sweets giftweight: giftbox) {
                sumWeight += giftweight.getWeight();
            }
            System.out.println("Полный список выбранного набора для подарка: ");
            for (Sweets gift: giftbox) {
                System.out.println(gift.toString());
            }
            System.out.println("Итоговая цена подарка: " + sumPrice +" Вес: " +sumWeight);

        }
}
