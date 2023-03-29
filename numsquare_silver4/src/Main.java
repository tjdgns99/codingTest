import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] square = new String[n];

        for(int i = 0; i < n; i++){
            square[i] = br.readLine();
        }

        int num;
        int down;
        int up;

        int s = 0;

        if(n<m){
            num = n;
            up = m;
            down = n;
        }else {
            num = m;
            up = n;
            down = m;
        }

        while (num != 1){
            for(int i = 0; i < n - num + 1; i++){
                for(int j = 0; j <m - num + 1; j++){
                    //System.out.println(num + "-> " + i + "," + j);
                    if(square[i].charAt(j) == square[i].charAt(j+num-1) && square[i].charAt(j) == square[i+num-1].charAt(j) && square[i].charAt(j) == square[i+num-1].charAt(j+num-1)){
                        s = num * num;
                        break;
                    }
                }
                if(s != 0){
                    break;
                }
            }
            if(s != 0){
                break;
            }
            num--;
        }
        if(num == 1){
            s = 1;
        }

        System.out.println(s);
    }
}
