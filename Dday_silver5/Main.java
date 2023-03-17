
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int now_year = Integer.parseInt(st.nextToken());
        int now_month = Integer.parseInt(st.nextToken());
        int now_day = Integer.parseInt(st.nextToken());


        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int d_year = Integer.parseInt(st2.nextToken());
        int d_month = Integer.parseInt(st2.nextToken());
        int d_day = Integer.parseInt(st2.nextToken());

        int day = 0;
        int[] cycle = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //윤년
        int[] nomal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //윤년X

//        bw.write(d_year + "\n" + d_month + " \n" + d_day + "\n" + " 날짜 구하기\n");
        for(int i = now_year + 1; i < d_year; i++){ //다음 년부터 목표 1년전 사이의 연도별 일수를 더해준다.
//            bw.write(i + " 다음\n");
            if(i % 400 == 0){
                day += 366;                         //윤년 366일
            }else if(i % 100 != 0 && i % 4 == 0){
                day += 366;                         //윤년 366일
            }else{
                day += 365;                         //평년 365일
            }
        }
//        bw.write(day +  "\n");

        if(now_year % 400 == 0){                    //윤년이면
            for(int i = now_month+1; i <=12; i++){  //시작 달을 제외한 남은 달의 일수를 미리 더해준다.
                day += cycle[i-1];
            }
            for(int j = now_day; j <= cycle[now_month-1]; j++){ //시작일부터 이 달의 남은 일수를 미리 더해준다.
                day+=1;
            }
        }else if(now_year % 100 != 0 && now_year % 4 == 0){ //윤년이면 위와 동일
            for(int i = now_month+1; i <=12; i++){
                day += cycle[i-1];
            }
            for(int j = now_day; j <= cycle[now_month-1]; j++){
                day+=1;
            }
        }else{                                      //평년이면 위와 동일
            for(int i = now_month+1; i <=12; i++){
                day += nomal[i-1];
            }
            for(int j = now_day; j <= nomal[now_month-1]; j++){
                day+=1;
            }
        }

        if(d_year % 400 == 0){                              //윤년이면
            for(int i = 0; i < d_month-1; i++){             //목표 달 이전 달들의 일수를 미리더해준다.
                day += cycle[i];
            }
            for(int j = 1; j < d_day; j++){                 //1일부터 목표일까지의 일수를 더해준다.
                day+=1;
            }
        }else if(d_year % 100 != 0 && d_year % 4 == 0){     //윤년이면 위와 동일
            for(int i = 0; i < d_month-1; i++){
                day += cycle[i];
            }
            for(int j = 1; j < d_day; j++){
                day+=1;
            }
        }else{                                              //평년이면 위와 동일
            for(int i = 0; i < d_month-1; i++){
                day += nomal[i];
            }
            for(int j = 1; j < d_day; j++){
                day+=1;
            }
        }

        if(now_year == d_year){                             //시작일과 목표일의 연도가 같으면 해당 연도의 총 일수를 뺴준다.-> 1 2 3 4 5 6 7 8 9 10 에서 4~6(D-2)를 구하고자 할 때 위에서 4~10, 1~5 더해서 7+5 12이므로 여기서 중복되는 개수는 전체 개수이므로 해당 값을 빼준다.
            if(d_year % 400 == 0){
                day -= 366; //윤년 366일
            }else if(d_year % 100 != 0 && d_year % 4 == 0){
                day -= 366;
            }else{
                day -= 365; //평년 365일
            }
        }

        //천년이 넘는 것을 체크
        if(d_year - now_year > 1000){
            bw.write("gg\n");
        }else if(d_year - now_year == 1000){
            if(d_month > now_month){
                bw.write("gg\n");
            }else if(d_month == now_month){
                if(d_day >= now_day){
                    bw.write("gg\n");
                }else {
                    bw.write("D-" + day + "\n");
                }
            }else{
                bw.write("D-" + day + "\n");
            }
        }else {
            bw.write("D-" + day + "\n");
        }




        br.close();
        bw.close();
    }
}
