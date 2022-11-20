import java.text.DecimalFormat;
import java.util.Random;


public class Method_chat {

    static int[] randMet(int length, int beginRange, int endRange) {
        Random random = new Random();
        int[] randMass = new int[length];
        for (int i = 0; i < randMass.length; i++) {
            randMass[i] = beginRange + random.nextInt(endRange - beginRange + 1);
        }
        return randMass;
    }

    static double result(int[] arg) {
        double avg = 0;
        int[] arMass = arg;
        for (int x : arMass) {
            avg += x;
        }
        return avg / arMass.length;
    }

    static String text(double res) {
        return "Средняя сумма трат за месяц составила " + (new DecimalFormat("#.##").format(res)) + " рублей";
    }

    public static void main(String[] args) {
        double total = result(randMet(30, 100_000, 200_000));
        String st = text(total);
        System.out.println(st);
    }
}

