package inflearn.section2;

//10. 봉우리
//지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
//각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
//격자의 가장자리는 0으로 초기화 되었다고 가정한다.
//만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
//첫 줄에 자연수 N이 주어진다.(2<=N<=50)
//두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
//봉우리의 개수를 출력하세요.

import java.util.Scanner;

public class Q10 {

    public int[][] zeroPadding(int[][] input){
        int row = input.length;
        int column = input[0].length;
        int paddingRow = input.length + 2;
        int paddingColumn = input.length + 2;

        int[][] paddingArr = new int[paddingRow][paddingColumn];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                paddingArr[i+1][j+1] = input[i][j];
            }
        }

        return paddingArr;
    }

    public int solution(int number, int[][] input){
        int answer = 0;
        int[][] paddingArr = zeroPadding(input);
        for(int i=1; i<=number; i++){
            for(int j=1; j<=number; j++){
                if(paddingArr[i][j] > paddingArr[i-1][j] && paddingArr[i][j] > paddingArr[i][j+1] && paddingArr[i][j] > paddingArr[i+1][j] && paddingArr[i][j] > paddingArr[i][j-1]) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Q10 t = new Q10();
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
