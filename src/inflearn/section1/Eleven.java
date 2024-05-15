package inflearn.section1;

//문자열 압축
//알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
//단 반복횟수가 1인 경우 생략합니다.
//첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//첫 줄에 압축된 문자열을 출력한다.
//KKHSSSSSSE
//K2HS6E

import java.util.Scanner;

public class Eleven {

    public static String solution(String input){
        String answer = "";
        char target = input.charAt(0);
        int count = 0;
        for(int i=0; i<input.length(); i++) {
            if(target == input.charAt(i)) count++;
            else if(target != input.charAt(i)){
                if(count == 1) answer += String.valueOf(target);
                else answer += String.valueOf(target) + count;
                count = 1;
                target = input.charAt(i);
            }

            if(i == input.length()-1){
                if(count == 1) answer += String.valueOf(target);
                else answer += String.valueOf(target) + count;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.print(solution(input));
    }

}
