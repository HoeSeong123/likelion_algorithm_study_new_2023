package com.ll.우혜지.DP.p1495;

import java.io.*;
import java.util.*;

public class Main {

    static int N, S, M;
    static int[] arr;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        S = Integer.parseInt(input[1]);
        M = Integer.parseInt(input[2]);

        // 볼륨이 최대 볼륨 M까지 가능하니까 개수는 M+1개로 지정
        arr = new int[M + 1];

        for (int i = 0; i <= M; i++) {
            arr[i] = -1;
        }

        // 시작 볼륨은 0번에서 시작합니다. 그 다음 조정 볼륨이 입력이 되었을 땐 1번이 됩니다
        arr[S] = 0;

        input = br.readLine().split(" ");

        for (int i = 1; i <= N; i++) {
            int V = Integer.parseInt(input[i - 1]);
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= M; j++) {
                if (arr[j] == i - 1) {
                    // 조정 볼륨을 더하기, 빼기한 값을 각각 vol1, vol2에 지정
                    int vol1 = j + V;
                    int vol2 = j - V;

                    // 조정된 볼륨이 범위 안에 있다면 list 배열에 넣는다
                    if (0 <= vol1 && vol1 <= M)
                        list.add(vol1);
                    if (0 <= vol2 && vol2 <= M)
                        list.add(vol2);
                }
            }

            // list 배열에 저장된 값을 n에 넣고 arr 배열에 다시 넣는다.
            for (int n : list) {
                arr[n] = i;
            }
        }

        // max에 일단 -1을 지정하고 arr에 지정된 최종 볼륨과 비교하였을 때 최대값을 max에 다시 넣는다
        int max = -1;
        for (int i = 0; i <= M; i++) {
            if (arr[i] == N)
                max = Math.max(max, i);
        }

        bw.write(max + "\n");
        bw.flush();

    }

}