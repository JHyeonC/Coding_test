package inflearn.section4;

//5. K번째 큰 수
//현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
//현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
//기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
//만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
//첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
//첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q05 {

    public int solution(int totalNumber, int selectNumber, int[] input){
        Set<Integer> tree = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<totalNumber-2; i++){
            for(int j=i+1; j<totalNumber-1; j++){
                for(int k=j+1; k<totalNumber; k++){
                    int sum = input[i] + input[j] + input[k];
                    tree.add(sum);
                }
            }
        }
        List<Integer> answer = new ArrayList<>(tree);
        if(selectNumber>tree.size()) return -1;
        else return answer.get(selectNumber-1);
    }

    public static void main(String[] args){
        Q05 t = new Q05();
        Scanner sc = new Scanner(System.in);

        int totalNumber = sc.nextInt();
        int selectNumber = sc.nextInt();
        int[] input = new int[totalNumber];

        for(int i=0; i<totalNumber; i++){
            input[i] = sc.nextInt();
        }

        System.out.println(t.solution(totalNumber, selectNumber, input));
    }

}
