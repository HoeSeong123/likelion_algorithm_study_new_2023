package com.ll.우혜지.재귀정렬.p11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] arr2 = br.readLine().split(" ");

        // 여기서 arr2는 입력받은 숫자들 그대로 넣은 배열
        // arr는 오름차순 정렬할 배열
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(arr2[i]);
        }

        Arrays.sort(arr);

        int sum = 0;

        for (int i=0; i < arr.length; i++) {
            sum += (arr.length-i) * arr[i];
        }

        System.out.println(sum);
    }
}
