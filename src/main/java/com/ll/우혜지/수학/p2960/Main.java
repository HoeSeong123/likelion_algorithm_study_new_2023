package com.ll.우혜지.수학.p2960;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        List<Integer> removeNum = new ArrayList<>();
        // 입력값까지 배열에 집어넣는 것 구현 성공
        // 이제 2의 배수만 빼서 다른 배열에 저장하자
        for (int i = 1; i <= a; i++) {
            arr.add(i);
            for (int j = 2; j <= a; j++) {
                if (i % j == 0) {
                    removeNum.add(i);
                }
            }
        }

        // 출력해보면 소수 아닌 애들만 중복되있음
        System.out.println(removeNum);
    }
}
