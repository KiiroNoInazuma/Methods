public class Round {
    int rounding(double n) {
        double m = 0.55556;
        n = n > (int) n + m ? n + 1 : n;
        return (int) n;
    }

    public static void main(String[] args) {
        Round round = new Round();
        int x = round.rounding(2.2);
        System.out.println(x);
    }
}
