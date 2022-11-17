import java.util.Scanner;

public class EvenNum {
    boolean ParityCheck(int x) {
        return x % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenNum en = new EvenNum();
        boolean b = en.ParityCheck(sc.nextInt());
        System.out.println(b);
    }
}
