package inflearn.section6;

//2. 버블 정렬
//N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
//정렬하는 방법은 버블정렬입니다.
//첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
//두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
//오름차순으로 정렬된 수열을 출력합니다.

import java.util.Scanner;

public class Q02 {

    public int[] solution(int num, int[] arr){
        for(int i=0; i<num-1; i++){
            for(int j=0; j<num-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Q02 t = new Q02();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : t.solution(num, arr)){
            System.out.print(x + " ");
        }
    }

}
