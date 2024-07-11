package inflearn.section5;

//4. 후위식 연산(postfix)
//후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
//    만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
//첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
//    식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
//연산한 결과를 출력합니다.

import java.util.Scanner;
import java.util.Stack;

public class Q04 {

    public int solution(String input){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char a : input.toCharArray()) {
            if(Character.isDigit(a)) stack.push(a - '0');
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(a == '+') stack.push(lt + rt);
                else if(a == '-') stack.push(lt - rt);
                else if(a == '*') stack.push(lt * rt);
                else stack.push(lt/rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args){
        Q04 t = new Q04();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(t.solution(input));
    }

}
