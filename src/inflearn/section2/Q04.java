package inflearn.section2;

//4. 피보나치 수열
//1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
//2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
//첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
//첫 줄에 피보나치 수열을 출력합니다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {

    public static String solution(int number){
        List<Integer> arr = new ArrayList<>();
        arr.add(0, 1);
        arr.add(1, 1);
        for(int i=2; i<number; i++){
           int value = arr.get(i-1) + arr.get(i-2);
           arr.add(i, value);
        }

        String answer = "";
        for(int i=0; i<arr.size(); i++){
            answer += arr.get(i) + " ";
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(solution(number));
    }

}
