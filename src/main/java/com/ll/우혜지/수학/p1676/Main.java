package com.ll.우혜지.수학.p1676;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        // 1부터 n까지의 숫자중 5로 나누었을 때 나머지가 0이 되는 수의 개수 찾기
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if ( i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
         */


        // 정답
        // n까지의 수 중 5의 배수 개수를 간단하게 찾기
        // 5로 나눈 몫을 우선 count에 더함
        // 25와 같이 5의 제곱수는 5가 2개 이상 있기에 그걸 다시 while문 안에서 반복해줌
        int n = sc.nextInt();
        int count = 0;

        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        System.out.println(count);
    }
}
