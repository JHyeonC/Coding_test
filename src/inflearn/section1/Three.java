package inflearn.section1;

//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//문장속의 각 단어는 공백으로 구분됩니다.
//첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
//첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
//단어를 답으로 합니다.


import java.util.Arrays;
import java.util.Scanner;

public class Three {

    public static String solution(String sentence){
        String[] split = sentence.split(" ");
        System.out.println("split = " + Arrays.toString(split));
        String answer = split[0];
        for(int i=0; i<split.length; i++){
            if(answer.length()<split[i].length()){
                answer = split[i];
                System.out.println("answer = " + answer);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(solution(sentence));
    }

}
