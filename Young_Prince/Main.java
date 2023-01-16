import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int x, y, r;
        for(int i = 0; i < t; i++) {
            int startx = scan.nextInt();
            int starty = scan.nextInt();
            int endx = scan.nextInt();
            int endy = scan.nextInt();
            int number = scan.nextInt();
            int min_pass = 0;

            for(int j = 0; j < number; j ++){
                x = scan.nextInt();
                y = scan.nextInt();
                r = scan.nextInt();

                int in_out = ((startx - x) * (startx -x)) + ((starty - y) * (starty -y)) - (r * r);
                int in_out2 = ((endx - x) * (endx -x)) + ((endy - y) * (endy -y)) - (r * r);
                if(in_out < 0 && in_out2 < 0)
                    min_pass = min_pass;
                else if(in_out < 0 || in_out2 < 0)
                    min_pass += 1;
            }

            System.out.println(min_pass);

        }
    }
}
