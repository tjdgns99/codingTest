import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new  InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        int a;

        up = up % down;
        for(int i = 0; i< num - 1; i++) {
            up= up * 10 % down;
        }
        a = up * 10 / down;

        bw.write(a + "");


        bw.close();
    }
}
