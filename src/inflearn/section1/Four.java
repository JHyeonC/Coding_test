package inflearn.section1;

//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
//첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
//두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
//N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Four {

    public static String solution(List<String> words){
        String answer = "";
        for(String word : words){
            for(int i=word.length()-1; i>=0; i--){
                answer += String.valueOf(word.charAt(i));
            }
            if(!words.get(words.size()-1).equals(word)) answer += "\n";
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<String> words = new ArrayList<>();
        for(int i=0; i<number; i++){
            words.add(sc.next());
        }
        System.out.println(solution(words));
    }

}
