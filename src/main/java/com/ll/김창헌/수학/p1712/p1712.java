package com.ll.김창헌.수학.p1712;

import java.util.Scanner;

public class p1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b >= c) {
            System.out.println("-1");
        } else {
            System.out.println(a / (c - b) + 1);
        }

    }
}