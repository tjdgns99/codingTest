import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());

        String[] word = new String[testcase];
        for(int i = 0; i < testcase; i++){
            word[i] = br.readLine();
        }

        int num = testcase;
        int c = 0;
        for(int i = 0; i < testcase; i++){
            c = 0;
            char[] pass = new char[word[i].length()];
            pass[c++] = word[i].charAt(0);
            for(int j = 1; j < word[i].length(); j++){
                if(word[i].charAt(j) != word[i].charAt(j-1)){
                    int n = 0;
                    for(;n < pass.length;n++){
                        if(pass[n] == word[i].charAt(j)){
                            break;
                        }
                    }
                    if(n == pass.length){
                        pass[c++] = word[i].charAt(j);
                    }else{
                        num -= 1;
                        break;
                    }
                }
            }
        }
        System.out.println(num);
    }
}
