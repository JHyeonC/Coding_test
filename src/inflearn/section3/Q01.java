package inflearn.section3;

//1. 두 배열 합치기
//오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
//첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
//두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
//세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
//네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
//각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
//오름차순으로 정렬된 배열을 출력합니다.

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

    public int[] solution(int number1, int[] input1, int number2, int[] input2){
        int[] answer = new int[number1+number2];
        for(int i=0; i<number1; i++){
            answer[i] = input1[i];
        }

        for(int i=0; i<number2; i++){
            answer[i+number1] = input2[i];
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args){
        Q01 t = new Q01();
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int[] input1 = new int[number1];
        for(int i=0; i<number1; i++){
            input1[i] = sc.nextInt();
        }
        int number2 = sc.nextInt();
        int[] input2 = new int[number2];
        for(int i=0; i<number2; i++){
            input2[i] = sc.nextInt();
        }
        for(int j=0; j<number1+number2; j++){
            System.out.print(t.solution(number1, input1, number2, input2)[j] + " ");
        }
    }

}
