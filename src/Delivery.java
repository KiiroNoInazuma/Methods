import java.util.Scanner;

public class Delivery {
    static int getDaysDelivery(int deliveryDistance) {
        int deliveryDays = 1;
        int interval = 40;
        int firstDayDistance = 20;
        if ((deliveryDistance % interval) < firstDayDistance /*&& interval >= firstDayDistance*/) {
            deliveryDays += deliveryDistance / interval;
        /*} else if (interval < firstDayDistance) {
            System.out.println("Ошибка! Интервал доставки не может быть меньше интервала первого дня");*/
        } else {
            deliveryDays += deliveryDistance / interval + 1;
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите расстояние для доставки пирожков: ");
        int result = getDaysDelivery(sc.nextInt());
        System.out.print("Количество дней доставки: "+result);
    }
}



