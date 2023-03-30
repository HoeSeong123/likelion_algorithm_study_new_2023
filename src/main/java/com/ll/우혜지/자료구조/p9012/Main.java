package com.ll.우혜지.자료구조.p9012;

import javax.sql.rowset.spi.SyncResolver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    private static Stack<String> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        String[] group = br.readLine().split("");


        for (int i = 0; i < group.length; i++) {
            String str = group[i];
            if (str.equals("(")) {
                stack.push(str);
            }
            else if (str.equals(")")) {

            }
        }
    }
}
