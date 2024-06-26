package inflearn.section1;

//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
//대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
//첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
//문자열은 영어 알파벳으로만 구성되어 있습니다.
//첫 줄에 해당 문자의 개수를 출력한다.

import java.util.Scanner;

public class Q01 {

    public static int solution(String input1, String input2){
        String lowerinput1 = input1.toLowerCase();
        String lowerinput2 = input2.toLowerCase();
        int count = 0;

        for(int i=0; i<lowerinput1.length(); i++){
            char check = lowerinput1.charAt(i);
            if(check == lowerinput2.charAt(0)) count++;
        }

        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        System.out.println(solution(input1, input2));
    }

//    Lecture
//    public int solution(String str, char t){
//        int answer = 0;
//        str = str.toUpperCase();
//        t = Character.toUpperCase(t);
//
//        for(char x : str.toCharArray()){
//            if(x == t) answer++;
//        }
//
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)==t) answer++;
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        One O = new One();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        char c = kb.next().charAt(0);
//        System.out.print(O.solution(str, c));
//    }

}
