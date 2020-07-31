import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("Выберите операцию: 1 - запуск задачи с генерацией массива, 2 - запуск задачи с формированием подарка");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число, соответствующие операции: ");
        int a = input.nextInt();
        if (a == 1) {
            SortArr.sortArr();
        }else if (a == 2) {
            HolidayGift.generateGift();
        }else{
            System.out.println("Нет такого номера операции!");
        }
    }
}
