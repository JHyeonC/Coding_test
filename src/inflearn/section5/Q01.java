package inflearn.section5;

//1. 올바른 괄호
//괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
//    (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
//첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
//첫 번째 줄에 YES, NO를 출력한다.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q01 {
    public String solution(String input){
        String answer = "YES";
        int a = 0, b = 0;
        Queue<Character> queue = new LinkedList<>();
        for(char x : input.toCharArray()) {
            queue.add(x);
        }
        if(queue.peek() == ')') answer = "NO";

        for(int i=0; i<input.length(); i++){
            char x = queue.peek();
            queue.remove();
            if(x == '(') a++;
            else b++;

            if(a < b) {
                answer = "NO";
                break;
            }

        }

        if(a != b) answer = "NO";
        return answer;
    }

    public static void main(String[] args){
        Q01 t = new Q01();
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(t.solution(input));
    }

}
