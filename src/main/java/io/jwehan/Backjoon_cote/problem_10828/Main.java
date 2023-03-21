package io.jwehan.Backjoon_cote.problem_10828;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
push X
pop
size
empty
top
 */
        ArrayList<Integer> stack = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 입력한 count의 값만큼 명령 반복

        for(int i=0; i<count; i++){

            String command = sc.next();

            if ("push".equals(command)) {
                stack.add(sc.nextInt());  //push X   입력한 수 X 스택리스트에 넣음
            }
            if("pop".equals(command)){  //pop 스택리스트에 가장 마지막에 넣은 X를 빼내어 출력함
                if(stack.size()==0){
                    System.out.println(-1);  // 스택리스트에 넣은 수가 없다면 -1을 출력
                }
                else {
                    int num = stack.get(stack.size()-1);  //스택리스트의 마지막 값 호출하여 num에 넣고 출력
                    System.out.println(num);
                    stack.remove(stack.size()-1); // 스택리스트의 마지막 값 삭제
                }
            }
            if ("size".equals(command)){
                System.out.println(stack.size());//size  스택리스트의 size를 출력함
            }
            if ("empty".equals(command)){//empty 스택리스타가
                if(stack.size()==0){
                    System.out.println(1);  // 비어있다면 1을 출력
                }
                else{
                    System.out.println(0);  // 아니면 0을 출력
                }
            }
            if ("top".equals(command)){ //top  가장 마지막에 스택리스트에 넣은 X의 수를 출력함
                if(stack.size()==0){  // 스택리스트에 넣은 수가 없다면 -1을 출력
                    System.out.println(-1);
                }else {
                    System.out.println(stack.get(stack.size() - 1));// 스택 리스트의 마지막 값을 출력함
                }
            }

        }
    }
}