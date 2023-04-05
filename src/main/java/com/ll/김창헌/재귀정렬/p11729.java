package com.ll.김창헌.재귀정렬;

import java.util.Scanner;

public class p11729 {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        hanoi(n, 1, 2, 3);

        System.out.println(count);
        System.out.println(sb);

    }

    public static void hanoi(int n, int start, int mid, int end) {

        count++;

        if (n == 1) {
            sb.append(start + " " + end + "\n");
            return;
        }

        hanoi(n - 1, start, end, mid);

        sb.append(start + " " + end + "\n");

        hanoi(n - 1, mid, start, end);

    }

}