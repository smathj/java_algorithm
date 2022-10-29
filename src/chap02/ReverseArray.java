package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int a[]) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - 1 - i);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열의 크기 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < x.length; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("배열의 요소를 역순으로 정렬했습니다");
        System.out.println("x = " + Arrays.toString(x));

    }
}
