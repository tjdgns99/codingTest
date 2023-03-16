import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(bf.readLine());

        int sum = 0;
        int n = 1;
        int i = 0;
        for (; sum < x; i++) {
            sum += i;
        }
        i -= 1;
        sum -= i;
        x -= sum;
        String str;
        if (i % 2 == 0) {
            for (; x > 1; x--) {
                i -= 1;
                n += 1;
            }
            str = n + "/" + i + "\n";
        } else {
            for (; x > 1; x--) {
                i -= 1;
                n += 1;
            }
            str = i + "/" + n + "\n";
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(str);
        bw.flush();
        bw.close();
    }
}
