package inflearn.section1;

//10. 가장 짧은 문자거리
//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
//문자열의 길이는 100을 넘지 않는다.
//첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

import java.util.Scanner;

public class Ten {

    //TODO 다시풀기

    public static String solution(String input){
        String[] arr = input.split(" ");
        String before = arr[0];
        String mark = arr[1];
        int value = 1000;
        int[] answer = new int[before.length()];
        String returnValue = "";

        for(int i=0; i<before.length(); i++){
            if(before.charAt(i) == mark.charAt(0)) value = 0;
            else value++;
            answer[i] = value;
        }

        value = 1000;
        for(int i=before.length()-1; i>=0; i--){
            if(before.charAt(i) == mark.charAt(0)) value = 0;
            else {
                value++;
                if(answer[i] > value) answer[i] = value;
            }
        }

        for(int i=0; i<answer.length; i++){
            returnValue += answer[i] + " ";
        }

        return returnValue.trim();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

}
