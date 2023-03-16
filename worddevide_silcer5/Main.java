import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String word = bf.readLine();

        ArrayList<String> rev = new ArrayList<String>();

        for(int i = 1; i < word.length()-1; i++){
            for(int j = i+1; j < word.length(); j++){
                String res= new String();
                for(int k = i-1; k >= 0; k--){
                    res += word.charAt(k);
                }
                for(int k = j-1; k >= i; k--){
                    res += word.charAt(k);
                }
                for (int k = word.length()-1; k >= j; k--){
                    res += word.charAt(k);
                }
                rev.add(res);
            }
        }

        Collections.sort(rev);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(rev.get(0));
        bw.flush();
        bw.close();
    }
}
