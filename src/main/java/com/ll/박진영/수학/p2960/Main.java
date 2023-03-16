package com.ll.박진영.수학.p2960;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int count = 0;

        int[] arr = new int[N+1];
        for(int i=2; i<=N; i++){    // 2부터 N까지 정수를 채움
            arr[i] = i;
        }

        for(int i=2; i<=N; i++){
            for (int j=i; j<=N; j+=i) {     // 배수 지우기
                if (arr[j] != 0) {
                    count++;
                    if (count == K) System.out.println(arr[j]);
                    arr[j] = 0;
                }
            }
        }
    }
}
