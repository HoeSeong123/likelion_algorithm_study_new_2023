package com.ll.우혜지.재귀정렬.p1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] time = new int[N][2]; // int[index 개수][변수 개수]

        StringTokenizer st;

        // 회의 시작시간과 종료시간 각각 배열에 저장
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            // time[i][0] : 회의 시작 시간
            // time[i][1] : 회의 끝나는 시간
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        // time 배열을 회의 끝나는 시간 기준으로 오름차순 재정렬 -> Comparator 사용
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        // count : 가능한 회의 개수
        int count = 0;
        // endTime : 반복문의 해당 인덱스 이전 회의의 끝나는 시간
        int endTime = 0;

        for (int i = 0; i < N; i++) {
            if (endTime <= time[i][0]) {
                endTime = time[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
