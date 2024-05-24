package inflearn.section3;

import java.util.Scanner;

//6. 최대 길이 연속부분수열
//0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
//만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
//1 1 0 0 1 1 0 1 1 0 1 1 0 1
//여러분이 만들 수 있는 1이 연속된 연속부분수열은
//이며 그 길이는 8입니다.
//첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
//두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
//첫 줄에 최대 길이를 출력하세요.


public class Q06 {

    private int solution(int length, int chance, int[] input) {
        int check = 0;
        int count = 0;
        int lt = 0;
        int answer = 0;
        for(int rt=0; rt<length; rt++){
            count++;
            if(input[rt] == 0) {
                check++;
            }
            while(check>chance){
                count--;
                if(answer<count) answer = count;
                if(input[lt] == 0){
                    check--;
                }
                lt++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Q06 t = new Q06();
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int chance = sc.nextInt();
        int[] input = new int[length];
        for(int i=0; i<length; i++){
            input[i] = sc.nextInt();
        }
        System.out.println(t.solution(length, chance, input));
    }

}
