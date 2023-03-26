import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] route = new String[36];
        for(int i = 0; i < 36; i++){
            route[i] = br.readLine();
        }

        int i = 1;

        while (i < 36) {
            if(route[i-1].charAt(0) - route[i].charAt(0) == 1 || route[i-1].charAt(0) - route[i].charAt(0) == -1){
                if(route[i-1].charAt(1) - route[i].charAt(1) == 2 || route[i-1].charAt(1) - route[i].charAt(1) == -2){
//                    System.out.println(i + " -> " + route[i - 1] + "다음 " + route[i] + "차이는 " + (route[i-1].charAt(0) - route[i].charAt(0)) + ", " + (route[i-1].charAt(1) - route[i].charAt(1)));
                    i += 1;
                }else {
                    break;
                }
            }else if(route[i-1].charAt(0) - route[i].charAt(0) == 2 || route[i-1].charAt(0) - route[i].charAt(0) == -2){
                if(route[i-1].charAt(1) - route[i].charAt(1) == 1 || route[i-1].charAt(1) - route[i].charAt(1) == -1){
//                    System.out.println(i + " -> " + route[i - 1] + "다음 " + route[i] + "차이는 " + (route[i-1].charAt(0) - route[i].charAt(0)) + ", " + (route[i-1].charAt(1) - route[i].charAt(1)));
                    i += 1;
                }else {
                    break;
                }
            }else{
                break;
            }
        }

        if(i == 36){
            if(route[35].charAt(0) - route[0].charAt(0) == 1 || route[35].charAt(0) - route[0].charAt(0) == -1){
                if(route[35].charAt(1) - route[0].charAt(1) == 2 || route[35].charAt(1) - route[0].charAt(1) == -2){
//                    System.out.println(i + " -> " + route[35] + "다음 " + route[0] + "차이는 " + (route[35].charAt(0) - route[0].charAt(0)) + ", " + (route[35].charAt(1) - route[0].charAt(1)));
                }else {
                    i = 0;
                }
            }else if(route[35].charAt(0) - route[0].charAt(0) == 2 || route[35].charAt(0) - route[0].charAt(0) == -2){
                if(route[35].charAt(1) - route[0].charAt(1) == 1 || route[35].charAt(1) - route[0].charAt(1) == -1){
//                    System.out.println(i + " -> " + route[35] + "다음 " + route[0] + "차이는 " + (route[35].charAt(0) - route[0].charAt(0)) + ", " + (route[35].charAt(1) - route[0].charAt(1)));
                }else {
                    i = 0;
                }
            }else{
                i = 0;
            }
        }


        Arrays.sort(route);
//        System.out.println(i + "까지 정상 진행");

        if(i != 36){
            System.out.println("Invalid");
        }else {
            for (i = 1; i < 36; i++) {
                if (route[i - 1].equals(route[i])) {

                    System.out.println("Invalid");
                    break;
                }
//                System.out.println(i + " -> " + route[i - 1] + "다음 " + route[i]);

                if (i == 35) {
                    System.out.println("Valid");
                }

            }
        }
    }

}
