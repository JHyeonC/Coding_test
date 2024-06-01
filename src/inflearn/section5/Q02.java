package inflearn.section5;

//2. 괄호문자제거
//입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
//첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//남은 문자만 출력한다.

import java.util.Scanner;
import java.util.Stack;

public class Q02 {

    public String solution(String input){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : input.toCharArray()) {
            if(x == ')'){
                while(stack.pop() != '(');
            }
            else stack.push(x);
        }

        for(int i=0; i<stack.size(); i++){
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args){
        Q02 t = new Q02();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(t.solution(input));
    }

}
