package com.ll.손승완.재귀및정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11729 {

    public static StringBuilder sb = new StringBuilder();
    public static long cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        hanoi(n, 1, 2, 3);

        System.out.println(cnt + "\n" + sb);
    }

    public static void hanoi(int n, int start, int mid, int end) {
        if (n == 1) {
            sb.append(start + " " + end).append("\n");
            cnt++;
            return;
        }

        hanoi(n - 1, start, end, mid);
        sb.append(start + " " + end).append("\n");
        cnt++;
        hanoi(n - 1, mid, start, end);
    }
}
