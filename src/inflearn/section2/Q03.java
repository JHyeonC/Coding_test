package inflearn.section2;

//    A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
//    가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
//    예를 들어 N=5이면
//    두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
//    첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
//    두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
//    세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
//    각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    public static List<String> solution(int[] inputA, int[] inputB){
        List<String> answer = new ArrayList<>();
        for(int i=0; i<inputA.length; i++){
            if(inputA[i] == inputB[i]) answer.add("D");
            else if(inputA[i] == 1 && inputB[i] == 3) answer.add("A");
            else if(inputA[i] == 2 && inputB[i] == 1) answer.add("A");
            else if(inputA[i] == 3 && inputB[i] == 2) answer.add("A");
            else answer.add("B");
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] inputA = new int[number];
        int[] inputB = new int[number];
        for(int i=0; i<number; i++){
            inputA[i] = sc.nextInt();
        }

        for(int i=0; i<number; i++){
            inputB[i] = sc.nextInt();
        }

        for(String answer : solution(inputA, inputB)){
            System.out.println(answer);
        }
    }
}
