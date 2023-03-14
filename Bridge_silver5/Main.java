import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int testcase = scan.nextInt();
        int n, m;
        int num = 1;
        for(int t = 0; t < testcase; t++){
            num = 1;
            n = scan.nextInt();
            m = scan.nextInt();

            for(int i = 0; i < n; i++){
                num *= m--;
                num /= i+1;
            }
            System.out.println(num);
        }
    }
}
