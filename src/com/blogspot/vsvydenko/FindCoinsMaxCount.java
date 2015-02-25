package com.blogspot.vsvydenko;

/**
 * Created by vsvydenko on 24.02.15
 *
 * Given N (max 40000). And three coins with a, b, c values. Find maximum value of count coins to reach N
 * Example: N = 17. a = 2, b = 3, c = 5. Result = 8 (7 * 2 + 1 * 3)
 */
public class FindCoinsMaxCount {

    public static void main(String[] args) {
        int n = 17;
        int[] m = new int[n+1];

        int a = 2;
        int b = 3;
        int c = 5;

        for (int i=1; i<n; i++) {
            m[i] = 0;
        }
        m[a] = m[b] = m[c] = 1;

        //showArrayFor(m);

        if (n % a == 0) {
            System.out.println("Result: " + n / a);
            return;
        }

        for (int i = a; i < m.length; i++) {
            if (m[i] != 0) {
                //System.out.println("i = " + i);
                if (i + a <= n && m[i + a] < m[i] + 1 ) {
                    //System.out.println("a passed, increase m[" + (i + a) +"], now it is " + (m[i] + 1));
                    m[i + a] = m[i] + 1;
                }
                if (i + b <= n && m[i + b] < m[i] + 1) {
                    //System.out.println("b passed, increase m[" + (i + b) +"], now it is " + (m[i] + 1));
                    m[i + b] = m[i] + 1;
                }
                if (i + c <= n && m[i + c] < m[i] + 1) {
                    //System.out.println("c passed, increase m[" + (i + c) +"], now it is " + (m[i] + 1));
                    m[i + c] = m[i] + 1;
                }
                //showArrayFor(m);
            }
        }
        System.out.println("Result: " + m[n]);
    }

    public static void showArrayFor(int[] m) {
        int size = m.length;
        for (int i = 0; i < size; i++) {
            System.out.print("m[" + i + "]=" + m[i] + ", ");
        }
        System.out.println();
    }
}
