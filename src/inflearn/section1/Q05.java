package inflearn.section1;

//특정 문자 뒤집기
//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
//첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

import java.util.Scanner;

public class Q05 {

    public static String solution(String value){
        String[] array = new String[value.length()];
        String alpha = "";
        String answer = "";
        int count = 1;
        for(int i=0; i<value.length(); i++){
            if(value.charAt(i)>=65 && value.charAt(i)<= 90 || value.charAt(i)>=97 && value.charAt(i)<=122) {
                array[i] = "0";
                alpha += String.valueOf(value.charAt(i));
            }
            else array[i] = String.valueOf(value.charAt(i));
        }

        for(int i=0; i<array.length; i++){
            if(array[i].equals("0")) {
                array[i] = String.valueOf(alpha.charAt(alpha.length()-count));
                count++;
            }
        }

        for(int i=0; i< array.length; i++){
            answer += array[i];
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        System.out.println(solution(value));
    }
}
