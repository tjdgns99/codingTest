import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        long percent = y * 100 / x;
        long num = 0;
        long n = 0;
        if(x == y || percent == 99){
            num = -1;
        }else {
            /*n = (x * x) / (99*x - 100*y);
            if((x*x) % (99*x - 100*y) != 0){
                n += 1;
            }
            num = n;*/
            while (y * 100 / x == percent) {
                num += 1000;
                y += 1000;
                x += 1000;
            }
            num -= 1000;
            x -= 1000;
            y -= 1000;
            while (y * 100 / x == percent) {
                num += 1;
                y += 1;
                x += 1;
            }

        }

        System.out.println(num);
    }
}
