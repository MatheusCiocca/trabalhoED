package questao10;

public class Main {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + func(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
