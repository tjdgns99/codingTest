import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] month = { "zero", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        StringTokenizer st = new StringTokenizer(br.readLine());

        String now_month_s = st.nextToken();
        String[] now_day_s = st.nextToken().split(",");
        int now_day = Integer.parseInt(now_day_s[0]);
        int now_year = Integer.parseInt(st.nextToken());
        String[] now_time_s = st.nextToken().split(":");
        int now_month = 1;
        int now_hour;
        int now_minute;
        int max;
        int sum = 0;
        int[] all_month;


        for(int i = 0; i < 13; i++){
            if(now_month_s.equals(month[i])){
                now_month = i;
                break;
            }
        }

        now_hour = Integer.parseInt(now_time_s[0]);
        now_minute = Integer.parseInt(now_time_s[1]);

        if(now_year % 400 == 0 || (now_year % 4 == 0 && now_year % 100 != 0)){
            all_month = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            max = 366 * 24 * 60;
        }else{
            all_month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            max = 365 * 24 * 60;
        }

        for(int i = 0; i < now_month - 1; i++){
            sum += all_month[i] * 24 * 60;
        }

        sum += (now_day - 1) * 24 * 60;

        sum += (now_hour) * 60;

        sum+= now_minute;

        System.out.println((double) sum/max * 100);



    }
}
