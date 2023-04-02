import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int round = 1;

        while (n != 1){
            if(num1 % 2 == 0){
                if(num2 == num1 -1){
                    break;
                }
            }else if(num2 % 2 == 0){
                if(num1 == num2 -1){
                    break;
                }
            }
            if(num1 % 2 == 0){
                num1 = num1 / 2;
            }else {
                num1 = num1/2 +1;
            }

            if(num2 % 2 == 0){
                num2 = num2 / 2;
            }else {
                num2 = num2/2 +1;
            }

            n /= 2;
            round += 1;
        }



        System.out.println(round);
    }
}
