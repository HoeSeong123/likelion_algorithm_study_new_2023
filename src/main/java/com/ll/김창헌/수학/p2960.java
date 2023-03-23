package com.ll.김창헌.수학;

import java.util.*;

public class p2960 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int num[] = new int[n + 1];
        int cnt = 0;

        for ( int i = 2; i <= n; i++ ) {
            num[i] = i;
        }

        for ( int i = 2; i <= n; i++ ) {
            for ( int j = i; j <= n; j += i) {
                if ( num[j] > 0 ) {
                    num[j] = 0;
                    cnt++;
                    if ( cnt == k ) {
                        System.out.print(j);
                    }
                } else if ( num[j] == 0 ) {
                    continue;
                }

            }
        }
    }
}



