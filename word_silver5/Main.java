/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] word = new String[n];

        for(int i = 0; i < n; i++){
            word[i] = br.readLine();
        }

        Arrays.sort(word, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);        //s1이 앞이면 음수, 동일하면 0 뒤면 양수
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });


        StringBuilder sb = new StringBuilder();

        sb.append(word[0]).append('\n');

        for (int i = 1; i < n; i++) {
            // 중복되지 않는 단어만 출력
            if (!word[i].equals(word[i - 1])) {
                sb.append(word[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        String[] word = new String[n];

        for(int i = 0; i < n; i++){
            word[i] = bf.readLine();
        }

        Arrays.sort(word, new Comparator<String>() {
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }else {
                    return s1.length() - s2.length();
                }
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        sb.append(word[0]).append('\n');
//        bw.write(word[0]+"\n");

        for(int i = 1; i < n; i++){
            if(!word[i].equals(word[i-1])){
                sb.append(word[i]).append('\n');
//                bw.write(word[i] + "\n");
            }
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}