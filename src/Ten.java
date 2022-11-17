public class Ten {
    boolean getTrust(int num) {
        return num >= 10;
    }

    public static void main(String[] args) {
        Ten ten = new Ten();
        boolean check = ten.getTrust(9);
        System.out.println(check);
    }
}
