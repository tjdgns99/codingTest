import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] num = new int[a];

        for(int i =0; i < a; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[] origin = new int[a];

        for(int i = 0; i < a; i++){
            origin[i] = num[i];
        }

        Arrays.sort(num);

        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                if(origin[i] == num[j]){
                    System.out.print(j + " ");
                    num[j] = -1;
                    break;
                }
            }
        }

    }
}
