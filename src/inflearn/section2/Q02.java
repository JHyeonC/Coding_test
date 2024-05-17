package inflearn.section2;

//선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
//선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
//첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
//선생님이 볼 수 있는 최대학생수를 출력한다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02 {

    //TODO 다시풀기

    public static int solution(int number, int[] input){
        List<Integer> answer = new ArrayList<>();
        answer.add(input[0]);
        int max = input[0];
        for(int i=1; i<input.length; i++){
            if(max < input[i]){
                max = input[i];
                answer.add(input[i]);
            }
        }

        return answer.size();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] input = new int[number];
        for(int i=0; i<number; i++){
            input[i] = sc.nextInt();
        }

        System.out.println(solution(number, input));
    }

}
