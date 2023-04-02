import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int senario = 1;
        while(n != 0) {
            String[] name = new String[n];

            for (int i = 0; i < n; i++) {
                name[i] = br.readLine();
            }

            int[] num = new int[n * 2 - 1];


            for (int i = 0; i < n * 2 - 1; i++) {
                st = new StringTokenizer(br.readLine());
                num[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(num);
            if(n == 1){
                System.out.println(senario + " " + name[0]);
            }else {
                for (int i = 1; i < num.length; i++) {
                    if (num[i - 1] == num[i]) {
                        i++;
                    } else {
                        System.out.println(senario + " " + name[num[i - 1] - 1]);
                        break;
                    }

                    if (i == num.length - 1) {
                        System.out.println(senario + " " + name[num[i] - 1]);
                    }
                }
            }

            n = Integer.parseInt(br.readLine());
            senario += 1;
        }
    }
}
