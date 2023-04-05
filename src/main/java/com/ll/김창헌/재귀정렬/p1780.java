package com.ll.김창헌.재귀정렬;

import java.io.*;
import java.util.StringTokenizer;

public class p1780 {
    public static int[][] arr;
    public static int[] answer = new int[3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        StringTokenizer st;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0,0,n);
        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }

    public static void divide(int x, int y, int size){

        // 종이가 다 같은 숫자라면 더해주기
        if(check(x,y,size)){
            if(arr[x][y] == -1){
                answer[0]++;
            }else if(arr[x][y] == 0){
                answer[1]++;
            }else{
                answer[2]++;
            }
            // 아니라면 9분할하기
        }else{
            int divsize = size/3;

            divide(x, y, divsize); // 1사분면
            divide(x, y + divsize, divsize); // 2사분면
            divide(x, y + divsize * 2, divsize); // 3사분면

            divide(x + divsize, y, divsize); // 4사분면
            divide(x + divsize, y + divsize, divsize); // 5사분면
            divide(x + divsize, y + divsize * 2, divsize); // 6사분면

            divide(x + divsize * 2, y, divsize); // 7사분면
            divide(x + divsize * 2, y + divsize, divsize); // 8사분면
            divide(x + divsize * 2, y + divsize * 2, divsize); // 9사분면
        }
    }

    public static boolean check(int x, int y, int size){
        int first = arr[x][y];
        boolean check = true;
        for(int i = x; i < x+size; i++){
            for(int j = y; j < y+size; j++){
                if(first != arr[i][j]){
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}



