package com.blogspot.vsvydenko;

import java.util.Arrays;

public class FindCoinsMaxCount {

    public static void main(String[] args) {
        int n = 17;
        int[] m = new int[18];

        int a = 2;
        int b = 3;
        int c = 5;

        for (int i=1; i<n; i++) {
            if (i == a || i == b || i == c) {
                m[i] = 1;
            } else {
                m[i] = 0;
            }
        }
        //showArrayFor(m);

        if (n % a == 0) {
            System.out.println("Result: " + n / a);
            return;
        }

        for (int i = a; i < m.length; i++) {
            //System.out.println("i = " + i);
            if (m[i] != 0 && (i + a) <= n && m[i + a] < m[i] + 1 ) {
                //System.out.println("a passed, increase m[" + (i + a) +"], now it is " + (m[i] + 1));
                m[i + a] = m[i] + 1;
            }
            if (m[i] != 0 && (i + b) <= n && m[i + b] < m[i] + 1) {
                //System.out.println("b passed, increase m[" + (i + b) +"], now it is " + (m[i] + 1));
                m[i + b] = m[i] + 1;
            }
            if (m[i] != 0 && (i + c) <= n && m[i + c] < m[i] + 1) {
                //System.out.println("c passed, increase m[" + (i + c) +"], now it is " + (m[i] + 1));
                m[i + c] = m[i] + 1;
            }
            //showArrayFor(m);
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
