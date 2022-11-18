import java.util.Random;

public class Accident {
    static int acc(int numBegin, int numEnd) {
        Random random = new Random();
        return random.nextInt(numEnd - numBegin + 1) + numBegin;
    }

    public static void main(String[] args) {
        int num = acc(-1, 0);
        System.out.println(num);
    }
}
