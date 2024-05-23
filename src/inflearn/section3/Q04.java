package inflearn.section3;

//4. 연속 부분수열
//N개의 수로 이루어진 수열이 주어집니다.
//이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
//    만약 N=8, M=6이고 수열이 다음과 같다면
//1 2 1 3 1 1 1 2
//합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
//첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
//수열의 원소값은 1,000을 넘지 않는 자연수이다.
//첫째 줄에 경우의 수를 출력한다.

import java.util.Scanner;

public class Q04 {

//    public int solution(int number, int sum, int[] input){
//        int p1 = 0, p2 = 1;
//        int answer = 0;
//        while(p2<number){
//            int temp = 0;
//            for(int i=p1; i<=p2; i++){
//                temp += input[i];
//            }
//
//            if(temp<sum) p2++;
//            else if(temp==sum){
//                answer++;
//                p1++;
//                p2 = p1 + 1;
//            }
//            else{
//                p1++;
//                p2 = p1 + 1;
//            }
//        }
//
//        return answer;
//    }

    public int solution(int number, int sum, int[] input){
        int answer = 0, temp = 0, lt =0;
        for(int rt=0; rt<number; rt++){
            temp += input[rt];
            if(temp == sum) answer++;
            while(temp >= sum){
                temp -= input[lt++];
                if(temp == sum) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q04 t = new Q04();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = sc.nextInt();
        int[] input = new int[number];

        for(int i=0; i<number; i++){
            input[i] = sc.nextInt();
        }

        System.out.println(t.solution(number, sum, input));
    }

}
