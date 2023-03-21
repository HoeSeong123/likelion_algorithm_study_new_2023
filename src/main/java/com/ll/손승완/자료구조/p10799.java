package com.ll.손승완.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        Stack<String> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                stack.push("(");
                continue;
            }
            if (arr[i].equals(")")) {
                String s = stack.peek();
                stack.pop();

                if (s.equals("(")) {
                    answer += stack.size();
                }
                else {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
