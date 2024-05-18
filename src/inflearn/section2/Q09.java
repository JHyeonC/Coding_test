package inflearn.section2;

//9. 격자판 최대합
//5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
//N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
//첫 줄에 자연수 N이 주어진다.(2<=N<=50)
//두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
//최대합을 출력합니다.

import java.util.Scanner;

public class Q09 {

    public int solution(int number, int[][] input){
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<number; i++){
            int row = 0;
            int column = 0;
            for(int j=0; j<number; j++){
                row += input[i][j];
                column += input[j][i];
            }

            answer = Math.max(answer, row);
            answer = Math.max(answer, column);
        }

        int diagonal1 = 0;
        int diagonal2 = 0;
        for(int i=0; i<number; i++) {
            diagonal1 += input[i][i];
            diagonal2 += input[i][number-i-1];
        }

        answer = Math.max(answer, diagonal1);
        answer = Math.max(answer, diagonal2);

        return answer;
    }

    public static void main(String[] args){
        Q09 t = new Q09();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[][] input = new int[number][number];
        for(int i=0; i<number; i++){
            for(int j=0; j<number; j++){
                input[i][j] = sc.nextInt();
            }
        }
        System.out.println(t.solution(number, input));
    }

}
