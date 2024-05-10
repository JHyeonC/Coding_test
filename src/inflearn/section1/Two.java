package inflearn.section1;

//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
//첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
//문자열은 영어 알파벳으로만 구성되어 있습니다.
//첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

import java.util.Scanner;

public class Two {

    public static String solution(String input){
        StringBuilder sb = new StringBuilder();
        String answer;
        for(int i=0; i<input.length(); i++){
            char check = input.charAt(i);
            if(Character.isUpperCase(check)) answer = String.valueOf(check).toLowerCase();
            else answer = String.valueOf(check).toUpperCase();

            sb.append(answer);
        }

        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }

//    Lecture
//    public String solution(String str){
//        String answer = "";
//        for(char x : str.toCharArray()){
//            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
//
//            if(x>=65 && x<= 90) answer += (char)(x+32);
//            else answer += (char)(x-32);
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Two t = new Two();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.print(t.solution(str));
//    }

}
