package inflearn.section3;

import java.util.Scanner;

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
