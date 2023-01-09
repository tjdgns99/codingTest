import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t, x1, y1, r1, x2, y2, r2;
        t = scan.nextInt();

        for(int i = 0; i < t; i++){
            x1 = scan.nextInt();
            y1 = scan.nextInt();
            r1 = scan.nextInt();
            x2 = scan.nextInt();
            y2 = scan.nextInt();
            r2 = scan.nextInt();

            double dis = sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            if( x1 == x2 && y1 == y2 && r1 == r2) //두 원이 일치
                System.out.println(-1);
            else if( dis == r2 - r1 || dis == r1 - r2) //큰 원 안에 작은 원이 내접하는 경우
                System.out.println(1);
            else if (x1 == x2 && y1 == y2 && r1 != r2) //두 원의 중심이 같지만 반지름이 다른 경우
                System.out.println(0);
            else if((dis < r2 - r1) || (dis < r1 - r2)) //큰 원 안에 작은 원이 존재하지만 접하지 않는 경우
                System.out.println(0);
            else if((r1 + r2) < dis) //두 원이 멀리 떨어져 있는 경우
                System.out.println(0);
            else if((r1 + r2) == dis) //두 원이 접하는 경우
                System.out.println(1);
            else if((r1 + r2) > dis) //두 원이 교차하는 경우
                System.out.println(2);

        }
    }
}
