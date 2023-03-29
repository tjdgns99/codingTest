import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();

        String A = "AAAA";
        String B = "BB";
        int num = 0;
        String out = "";

        for(int i = 0; i < board.length(); i++){
            if(board.charAt(i) == 'X'){
                num += 1;
            }else if(i != 0){
                if(num % 2 != 0){
                    System.out.println("-1");
                    break;
                }else{
                    while(num != 0) {
                        if (num >= 4) {
                            num -= 4;
                            out += A;
                        }else{
                            num -= 2;
                            out += B;
                        }
                    }
                }
                out += ".";
            }else{
                out += ".";
            }

            if(i == board.length()-1){
                if(num % 2 != 0){
                    System.out.println("-1");
                }else{
                    while(num != 0) {
                        if (num >= 4) {
                            num -= 4;
                            out += A;
                        }else{
                            num -= 2;
                            out += B;
                        }
                    }
                    System.out.println(out);
                }
            }
        }



    }
}
