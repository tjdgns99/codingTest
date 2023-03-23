import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        char[][] board = new char[m][n];



        for(int i = 0; i < m; i++){
            String sr = br.readLine();
            for(int j = 0; j < n; j++){
                board[i][j] = sr.charAt(j);
            }
        }

        char[] white = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
        char[] black = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};

        int[] numlist = new int[(m-7)*(n-7)];
        int count = 0;
        int num = 0;
        int num1, num2;
        for(int i = 0; i < m-7;i++){
            for(int j = 0; j < n-7; j++){
                num1 = 0;
                num2 = 0;
                for(int k = i; k < i+8; k++){
                    int s = 0;
                    for(int l = j; l < j + 8; l++){
                        if(board[i][j] == 'W'){
                            if((k-i) % 2 == 0) {
                                if (board[k][l] != white[s++]) {
                                    num1 += 1;
                                }
                            }else{
                                if(board[k][l] != black[s++]){
                                    num1 += 1;
                                }
                            }
                        }else{
                            if((k-i) % 2 != 0) {
                                if (board[k][l] != white[s++]) {
                                    num1 += 1;
                                }
                            }else{
                                if(board[k][l] != black[s++]){
                                    num1 += 1;
                                }
                            }
                        }
                    }
                    s = 0;
                    for(int l = j; l < j + 8; l++){
                        if(board[i][j] == 'W'){
                            if((k-i) % 2 != 0) {
                                if (board[k][l] != white[s++]) {
                                    num2 += 1;
                                }
                            }else{
                                if(board[k][l] != black[s++]){
                                    num2 += 1;
                                }
                            }
                        }else{
                            if((k-i) % 2 == 0) {
                                if (board[k][l] != white[s++]) {
                                    num2 += 1;
                                }
                            }else{
                                if(board[k][l] != black[s++]){
                                    num2 += 1;
                                }
                            }
                        }
                    }
                    if(num1 <= num2){
                        num = num1;
                    }else {
                        num = num2;
                    }
                }
                //System.out.println(i +"," + j + "시작 ->" + count+ "번째 ->" +num);
                numlist[count] = num;
                count += 1;
            }
        }
        Arrays.sort(numlist);
        System.out.println(numlist[0]);
    }
}


