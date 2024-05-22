package inflearn.section3;

//3. 최대 매출
//현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
//    만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
//12 1511 20 2510 20 19 13 15
//연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
//여러분이 현수를 도와주세요.
//첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
//두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
//첫 줄에 최대 매출액을 출력합니다.
//Sliding window를 이용하자

import java.util.Scanner;

public class Q03 {

    // TODO 다시풀기

//    public int solution(int date, int days, int[] income){
//        int p1 = days-1;
//        int p2 = date-days;
//        int answer = 0;
//        while(true){
//            int point1 = 0, point2 = 0;
//            for(int i=p1-days+1; i<=p1; i++){
//                point1 += income[i];
//            }
//
//            for(int j=p2+days-1; j>=p2; j--){
//                point2 += income[j];
//            }
//
//            if(point1 > point2) {
//                p2--;
//                answer = point1;
//            }
//            else if(point1 < point2) {
//                p1++;
//                answer = point2;
//            }
//
//            if (p2 - days + 1 == p1 || p1 + days - 1 == p2) {
//                break;
//            }
//        }
//
//        return answer;
//    }

    public int solution(int n, int k, int[] arr){
        int answer, sum = 0;
        for(int i=0; i<k; i++) sum += arr[i];

        answer = sum;

        for(int i=k; i<n; i++){
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args){
        Q03 t = new Q03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution(n, k, arr));
    }

}
