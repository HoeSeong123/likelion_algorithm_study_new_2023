package com.ll.김창헌.자료구조;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class p10828 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Stack<Integer> st = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String[] s = br.readLine().split(" ");
            if(s[0].equals("push")) {
                st.push(Integer.parseInt(s[1]));
            }
            else if(s[0].equals("pop")) {
                if(st.empty()) {
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(st.pop()+"\n");
                }
            }
            else if(s[0].equals("size")) {
                bw.write(st.size()+"\n");
            }
            else if(s[0].equals("empty")) {
                if(st.empty()) {
                    bw.write(1+"\n");
                }
                else {
                    bw.write(0+"\n");
                }
            }
            else if(s[0].equals("top")) {
                if(st.empty()) {
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(st.peek()+"\n");
                }
            }
        }
        bw.flush();

    }



}