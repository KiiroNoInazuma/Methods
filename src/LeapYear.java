import java.util.Scanner;

public class LeapYear {
    static void getLeapYear(int year) {
        String text = " - високосный год.";
        String textOther = " - не високосный год.";
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + text);
        } else {
            System.out.println(year + textOther);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getLeapYear(sc.nextInt());
    }
}
