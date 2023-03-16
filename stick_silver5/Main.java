import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        int[] stick = {64, 32, 16, 8, 4, 2, 1, 1};

        int num = 0;
        while(x != 0) {
            for (int i = 0; i < stick.length; i++) {
                if(x >= stick[i]){
                    num += 1;
                    x -= stick[i];
                    break;
                }
            }
        }

        System.out.println(num);
    }
}
