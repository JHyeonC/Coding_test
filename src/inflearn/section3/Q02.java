package inflearn.section3;

//2. 공통원소 구하기
//A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
//첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
//두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
//세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
//네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
//각 집합의 원소는 1,000,000,000이하의 자연수입니다.
//두 집합의 공통원소를 오름차순 정렬하여 출력합니다.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q02 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0, p2 =0;
        while(p1<n && p2<m){
            if(a[p1] == b[p2]) {
                answer.add(a[p1]);
                p1++;
                p2++;
            }else if(a[p1]<b[p2]){
                p1++;
            }else{
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q02 t = new Q02();
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
        for(int x : t.solution(number1, number2, input1, input2)) System.out.print(x + " ");
    }

}
