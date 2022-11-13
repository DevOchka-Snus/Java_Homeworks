import java.util.Vector;

public class Main {
    public static Boolean check(int n) {
        var sqrt = (int)Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Exercise 1:");
        int len = (int)(Math.random() * 10);
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        int min = array[0];
        int max = array[0];
        double sum = 0;
        for (var el : array) {
            min = Math.min(min, el);
            max = Math.max(max, el);
            sum += el;
        }
        double mid = sum / len;
        System.out.println(max + " " + min + " " + mid);
        System.out.println("Exercise 2:");
        Vector vector = new Vector();
        for (int i = 2; i <= 100; i++) {
            if (check(i)) {
                vector.add(i);
            }
        }
        for (var el : vector) {
            System.out.print(el + " ");
        }
    }
}
