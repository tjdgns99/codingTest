import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int num;
        int z, o;
        int tz, to;
        int z2, o2;
        for(int i = 0; i < t; i++){
            z = 0;
            o = 0;
            z2 = 0;
            o2 = 0;
            num = scan.nextInt();
            if(num == 0){
                z2 = 1;
                o2 = 0;
            }else if(num == 1){
                z2 = 0;
                o2 = 1;
            }
            else {
                for (int j = 0; j <= num; j++) {
                    if (j == 0) {
                        z = 1;
                        o = 0;
                    } else if (j == 1) {
                        z2 = 0;
                        o2 = 1;
                    } else {
                        tz = z2;
                        to = o2;
                        z2 += z;
                        o2 += o;
                        z = tz;
                        o = to;
                    }
                }
            }
            System.out.println(z2+ " " + o2);
        }
    }
}



