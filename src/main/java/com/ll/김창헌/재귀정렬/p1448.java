package com.ll.김창헌.재귀정렬;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class p1448 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int straw = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[straw];


        for (int i = 0; i < straw; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int max = 0;
        for (int i = 0; i < straw - 2; i++) {
            if (arr[i] < arr[i + 1] + arr[i + 2]) {
                max = Math.max(max, arr[i] + arr[i + 1] + arr[i + 2]);
            }
        }
        if (max == 0) {
            max = -1;
        }
        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
        br.close();
    }
}


