package inflearn.section2;

//1. 큰 수 출력하기
//N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
//    (첫 번째 수는 무조건 출력한다)
//첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
//자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01 {

    public static List<Integer> solution(int n, int[] input){
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<input.length; i++){
            if(input[i-1] < input[i]) answer.add(input[i]);
        }
        answer.add(0, input[0]);
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] input = new int[number];
        for(int i=0; i<number; i++){
            input[i] = sc.nextInt();
        }

        for(int x : solution(number, input)){
            System.out.print(x + " ");
        }
    }

}
