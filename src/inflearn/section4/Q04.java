package inflearn.section4;

//4. 모든 아나그램 찾기
//S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
//아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
//첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
//S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
//S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

import java.util.HashMap;
import java.util.Scanner;

public class Q04 {

    public int solution(String input1, String input2){
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> format = new HashMap<>();
        for(int i=0; i<input2.length(); i++){
            map.put(input1.charAt(i), map.getOrDefault(input1.charAt(i), 0) + 1);
        }

        for(int i=0; i<input2.length(); i++){
            format.put(input2.charAt(i), format.getOrDefault(input2.charAt(i), 0) + 1);
        }

        if (map.equals(format)) {
            answer++;
        }

        for(int i=input2.length(); i<input1.length(); i++){
            map.put(input1.charAt(i), map.getOrDefault(input1.charAt(i), 0) + 1);

            int value = map.get(input1.charAt(i-input2.length()));


            if(value-1 == 0) map.remove(input1.charAt(i-input2.length()));
            else map.replace(input1.charAt(i-input2.length()), value, value-1);

            if (map.equals(format)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Q04 t = new Q04();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        System.out.println(t.solution(input1, input2));
    }

}
