import java.time.LocalDate;

public class Ver_OS {
    static void detectVersion(int typeOS, int release) {
        String osLight = " облегченную ";
        String os;
        if (typeOS == 0 && release >= 2015) {
            os = "iOS";
            System.out.println("Установите версию приложения для " + os + " по ссылке.");
        } else if (typeOS == 1 && release >= 2015) {
            os = "Android";
            System.out.println("Установите версию приложения для " + os + " по ссылке.");
        } else if (typeOS == 0) {
            os = "iOS";
            System.out.println("Установите" + osLight + "версию приложения для " + os + " по ссылке.");
        } else if (typeOS == 1) {
            os = "Android";
            System.out.println("Установите" + osLight + "версию приложения для " + os + " по ссылке.");
        } else {
            System.out.println("ERROR");
        }
    }

    public static void main(String[] args) {
        int os = 0;
        int year = LocalDate.now().getYear();
        detectVersion(os, year);
    }
}

