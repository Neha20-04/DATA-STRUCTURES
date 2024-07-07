import java.util.*;

//Arrays are mutable.
// while giving input we should not use , in between.
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
        System.out.println();

    }
}