public class Rand {

    static int rand() {
        return (int) (Math.random() * 19 - 9);
    }

    public static void main(String[] args) {
        int x = rand();
        System.out.println(x);
    }
}
