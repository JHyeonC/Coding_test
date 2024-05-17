package inflearn.section2;

//6. 뒤집은 소수
//N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
//예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
//첫 자리부터의 연속된 0은 무시한다.
//첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
//각 자연수의 크기는 100,000를 넘지 않는다.
//첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

import java.util.Scanner;

public class Q06 {

    //TODO 다시풀기

    public boolean isPrime(int number){
        if(number == 1) return false;
        for(int i=2; i<number; i++){
            if(number%i == 0) return false;
        }
        return true;
    }

    public String solution(int[] input){
        String answer = "";
        for(int i=0; i<input.length; i++){
            int tmp = input[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer += res + " ";
        }
        return answer;
    }

    public static void main(String[] args){
        Q06 t = new Q06();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] input = new int[number];
        for(int i=0; i<number; i++){
            input[i] = sc.nextInt();
        }
        System.out.println(t.solution(input));
    }
}
