package inflearn.section1;

//8. 유효한 팰린드롬
//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
//문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
//알파벳 이외의 문자들의 무시합니다.
//첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
//첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.

import java.util.Scanner;

public class Eight {

    public static String solution(String input){
        String answer = "YES";
        String before = "";
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)>=65 && input.charAt(i)<= 90 || input.charAt(i)>=97 && input.charAt(i)<=122) before += input.charAt(i);
        }

        before = before.toLowerCase();

        for(int i=0; i<before.length()/2; i++){
            if(before.charAt(i) != before.charAt(before.length()-1-i)) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        System.out.println(solution(answer));
    }

}
