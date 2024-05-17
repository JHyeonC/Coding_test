package inflearn.section2;

//5. 소수(에라토스테네스 체)
//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
//첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
//첫 줄에 소수의 개수를 출력합니다.

import java.util.Scanner;

public class Q05 {

    //TODO 다시풀기

    public static int solution(int input){
        int answer = 0;
        int[] check = new int[input+1];

        for(int i=2; i<=input; i++){
            if(check[i]==0){
                answer++;
                for(int j=i; j<=input; j=j+i){
                    check[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(solution(input));
    }

}
