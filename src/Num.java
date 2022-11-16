public class Num {
    static int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(6, 5));
        System.out.println(min(6, 5));
    }
}
