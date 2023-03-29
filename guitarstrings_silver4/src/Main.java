import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] p_price = new int[m];
        int[] o_price = new int[m];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            p_price[i] = Integer.parseInt(st.nextToken());
            o_price[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(p_price);
        Arrays.sort(o_price);

        int min = 0;

        min = n/6 * p_price[0];

        if(n%6 * o_price[0] < p_price[0]){
            min += o_price[0] * (n%6);
        }else{
            min += p_price[0];
        }

        if(o_price[0] * 6 < p_price[0]){
            min = n * o_price[0];
        }

        System.out.println(min);
    }
}
