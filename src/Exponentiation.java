public class Exponentiation {
    static int exp(int a, int b) {
        int result = 1;
        for (int x = 0; x < b; x++)
            result *= a;
        return result;
    }

    public static void main(String[] args) {
        int res = exp(3, 3);
        System.out.println(res);
    }
}

