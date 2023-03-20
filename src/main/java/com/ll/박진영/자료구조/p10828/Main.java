package com.ll.박진영.자료구조.p10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Stack stack = new Stack(num);

        for(int i = 0; i < num; i++){
            String[] str = br.readLine().split(" ");
            switch (str[0]){
                case "push" :
                    stack.push(Integer.parseInt(str[1]));
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty());
                    break;
                case "top":
                    System.out.println(stack.top());
                    break;
            }
        }
        br.close();
    }
}

class Stack{
    private int size;
    private int[] arr;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = 0;
    }

    public void push(int n){
        arr[top++]=n;
    }

    public int pop(){
        if(top <= 0){
            return -1;
        }
        return arr[--top];
    }

    public int size(){
        return top;
    }

    public int top(){
        if(top<=0) return -1;
        else return arr[top-1];
    }

    public int empty() {
        if(top<=0) return 1;
        else return 0;
    }

}