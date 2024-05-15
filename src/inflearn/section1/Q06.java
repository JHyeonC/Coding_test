package inflearn.section1;

//    중복문자제거
//    소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//    중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
//    첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
//    첫 줄에 중복문자가 제거된 문자열을 출력합니다.

import java.util.Scanner;

public class Q06 {

    public static String solution(String input){
        char[] midarr = input.toCharArray();
        String answer = "";
        for(int i=0; i<input.length(); i++){
            char search = input.charAt(i);
            for(int j=i+1; j<input.length(); j++){
                if(search != 48 && search == input.charAt(j))  midarr[j] = 48;
            }
        }

        for(int i=0; i<midarr.length; i++){
            if(midarr[i] != 48) answer += String.valueOf(midarr[i]);
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }

}
