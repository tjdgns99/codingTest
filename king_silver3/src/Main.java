/*
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String king = st.nextToken();
        String stone = st.nextToken();
        int num = Integer.parseInt(st.nextToken());

        char[] row = {'1', '2', '3', '4', '5', '6', '7', '8'};
        char[] col = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        for (int i = 0; i < num; i++) {
            String move = br.readLine();
            if (move.equals("R")) {
                if (king.charAt(0) != col[7]) {
                    for (int j = 0; j < 7; j++) {
                        if (king.charAt(0) == col[j]) {
                            king = Character.toString(col[j + 1]) + king.charAt(1);
                            break;
                        }
                    }
                    if (king.equals(stone)) {
                        if (stone.charAt(0) == col[7]) {
                            for (int j = 1; j < 8; j++) {
                                if (king.charAt(0) == col[j]) {
                                    king = Character.toString(col[j - 1]) + king.charAt(1);
                                    break;
                                }
                            }
                        } else {
                            for (int j = 0; j < 7; j++) {
                                if (stone.charAt(0) == col[j]) {
                                    stone = Character.toString(col[j + 1]) + stone.charAt(1);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else if (move.equals("L")) {
                if (king.charAt(0) != col[0]) {
                    for (int j = 1; j < 8; j++) {
                        if (king.charAt(0) == col[j]) {
                            king = Character.toString(col[j - 1]) + king.charAt(1);
                            break;
                        }
                    }
                    if (king.equals(stone)) {
                        if (stone.charAt(0) == col[0]) {
                            for (int j = 0; j < 7; j++) {
                                if (king.charAt(0) == col[j]) {
                                    king = Character.toString(col[j + 1]) + king.charAt(1);
                                    break;
                                }
                            }
                        } else {
                            for (int j = 1; j < 8; j++) {
                                if (stone.charAt(0) == col[j]) {
                                    stone = Character.toString(col[j - 1]) + stone.charAt(1);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else if (move.equals("B")) {
                if (king.charAt(1) != row[0]) {
                    for (int j = 1; j < 8; j++) {
                        if (king.charAt(1) == row[j]) {
                            king = king.charAt(0) + Character.toString(row[j - 1]);
                            break;
                        }
                    }
                    if (king.equals(stone)) {
                        if (stone.charAt(1) == row[0]) {
                            for (int j = 0; j < 7; j++) {
                                if (king.charAt(1) == row[j]) {
                                    king = king.charAt(0) + Character.toString(row[j + 1]);
                                    break;
                                }
                            }
                        } else {
                            for (int j = 1; j < 8; j++) {
                                if (stone.charAt(1) == row[j]) {
                                    stone = stone.charAt(0) + Character.toString(row[j - 1]);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else if (move.equals("T")) {
                if (king.charAt(1) != row[7]) {
                    for (int j = 0; j < 7; j++) {
                        if (king.charAt(1) == row[j]) {
                            king = king.charAt(0) + Character.toString(row[j + 1]);
                            break;
                        }
                    }
                    if (king.equals(stone)) {
                        if (stone.charAt(1) == row[7]) {
                            for (int j = 1; j < 8; j++) {
                                if (king.charAt(1) == row[j]) {
                                    king = king.charAt(0) + Character.toString(row[j - 1]);
                                    break;
                                }
                            }
                        } else {
                            for (int j = 0; j < 7; j++) {
                                if (stone.charAt(1) == row[j]) {
                                    stone = stone.charAt(0) + Character.toString(row[j + 1]);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else if (move.equals("RT")) {

                if (king.charAt(0) != col[7] && king.charAt(1) != row[7]) {
                    for (int j = 0; j < 7; j++) {
                        if (king.charAt(0) == col[j]) {
                            king = Character.toString(col[j + 1]) + king.charAt(1);
                            break;
                        }
                    }
                    for (int j = 0; j < 7; j++) {
                        if (king.charAt(1) == row[j]) {
                            king = king.charAt(0) + Character.toString(row[j + 1]);
                            break;
                        }

                    }
                    if (king.equals(stone)) {
                        if (stone.charAt(0) == col[7] && stone.charAt(1) == row[7]) {
                            for (int j = 1; j < 8; j++) {
                                if (king.charAt(0) == col[j]) {
                                    king = Character.toString(col[j - 1]) + king.charAt(1);
                                    break;
                                }
                            }
                            for (int j = 1; j < 8; j++) {
                                if (king.charAt(1) == row[j]) {
                                    king = king.charAt(0) + Character.toString(row[j - 1]);
                                    break;
                                }

                            }
                        } else {
                            for (int j = 0; j < 7; j++) {
                                if (stone.charAt(0) == col[j]) {
                                    stone = Character.toString(col[j + 1]) + stone.charAt(1);
                                    break;
                                }
                            }
                            for (int j = 0; j < 7; j++) {
                                if (stone.charAt(1) == row[j]) {
                                    stone = stone.charAt(0) + Character.toString(row[j + 1]);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else if (move.equals("LT")) {
                if (king.charAt(0) != col[0] && king.charAt(1) != row[7]) {
                    for (int j = 1; j < 8; j++) {
                        if (king.charAt(0) == col[j]) {
                            king = Character.toString(col[j - 1]) + king.charAt(1);
                            break;
                        }
                    }
                    for (int j = 0; j < 7; j++) {
                        if (king.charAt(1) == row[j]) {
                            king = king.charAt(0) + Character.toString(row[j + 1]);
                            break;
                        }
                    }
                    if (king.equals(stone)) {
                        if (stone.charAt(0) == col[0] && stone.charAt(1) == row[7]) {
                            for (int j = 0; j < 7; j++) {
                                if (king.charAt(0) == col[j]) {
                                    king = Character.toString(col[j + 1]) + king.charAt(1);
                                    break;
                                }
                            }
                            for (int j = 1; j < 8; j++) {
                                if (king.charAt(1) == row[j]) {
                                    king = king.charAt(0) + Character.toString(row[j - 1]);
                                    break;
                                }
                            }
                        } else {
                            for (int j = 1; j < 8; j++) {
                                if (stone.charAt(0) == col[j]) {
                                    stone = Character.toString(col[j - 1]) + stone.charAt(1);
                                    break;
                                }
                            }
                            for (int j = 0; j < 7; j++) {
                                if (stone.charAt(1) == row[j]) {
                                    stone = stone.charAt(0) + Character.toString(row[j + 1]);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else if (move.equals("RB")) {
                if (king.charAt(0) != col[7] && king.charAt(1) != row[0]) {
                    for (int j = 0; j < 7; j++) {
                        if (king.charAt(0) == col[j]) {
                            king = Character.toString(col[j + 1]) + king.charAt(1);
                            break;
                        }
                    }

                    for (int j = 1; j < 8; j++) {
                        if (king.charAt(1) == row[j]) {
                            king = king.charAt(0) + Character.toString(row[j - 1]);
                            break;
                        }
                    }
                    if (king.equals(stone)) {
                        if (stone.charAt(0) == col[7] && stone.charAt(1) == row[0]) {
                            for (int j = 1; j < 8; j++) {
                                if (king.charAt(0) == col[j]) {
                                    king = Character.toString(col[j - 1]) + king.charAt(1);
                                    break;
                                }
                            }
                            for (int j = 0; j < 7; j++) {
                                if (king.charAt(1) == row[j]) {
                                    king = king.charAt(0) + Character.toString(row[j + 1]);
                                    break;
                                }
                            }
                        } else {
                            for (int j = 0; j < 7; j++) {
                                if (stone.charAt(0) == col[j]) {
                                    stone = Character.toString(col[j + 1]) + stone.charAt(1);
                                    break;
                                }
                            }

                            for (int j = 1; j < 8; j++) {
                                if (stone.charAt(1) == row[j]) {
                                    stone = stone.charAt(0) + Character.toString(row[j - 1]);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else if (move.equals("LB")) {
                if (king.charAt(0) != col[0] && king.charAt(1) != row[0]) {
                    for (int j = 1; j < 8; j++) {
                        if (king.charAt(0) == col[j]) {
                            king = Character.toString(col[j - 1]) + king.charAt(1);
                            break;
                        }
                    }

                    for (int j = 1; j < 8; j++) {
                        if (king.charAt(1) == row[j]) {
                            king = king.charAt(0) + Character.toString(row[j - 1]);
                            break;
                        }
                    }

                    if (king.equals(stone)) {
                        if (stone.charAt(0) == col[0] && stone.charAt(1) == row[0]) {
                            for (int j = 0; j < 7; j++) {
                                if (king.charAt(0) == col[j]) {
                                    king = Character.toString(col[j + 1]) + king.charAt(1);
                                    break;
                                }
                            }

                            for (int j = 0; j < 7; j++) {
                                if (king.charAt(1) == row[j]) {
                                    king = king.charAt(0) + Character.toString(row[j + 1]);
                                    break;
                                }
                            }
                        } else {
                            for (int j = 1; j < 8; j++) {
                                if (stone.charAt(0) == col[j]) {
                                    stone = Character.toString(col[j - 1]) + stone.charAt(1);
                                    break;
                                }
                            }

                            for (int j = 1; j < 8; j++) {
                                if (stone.charAt(1) == row[j]) {
                                    stone = stone.charAt(0) + Character.toString(row[j - 1]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(king);
        System.out.println(stone);
    }

}
*/
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String king = st.nextToken();
        String stone = st.nextToken();
        int num = Integer.parseInt(st.nextToken());

        ArrayList<Character> row = new ArrayList<Character>();
        row.add('1');
        row.add('2');
        row.add('3');
        row.add('4');
        row.add('5');
        row.add('6');
        row.add('7');
        row.add('8');
        ArrayList<Character> col = new ArrayList<Character>();
        col.add('A');
        col.add('B');
        col.add('C');
        col.add('D');
        col.add('E');
        col.add('F');
        col.add('G');
        col.add('H');

        int kc = col.indexOf(king.charAt(0));
        int kr = row.indexOf(king.charAt(1));
        int sc = col.indexOf(stone.charAt(0));
        int sr = row.indexOf(stone.charAt(1));

        String move;
        for(int i = 0; i < num; i++){
            move = br.readLine();
            switch(move){
                case "R":   //오른쪽
                    if(kc != 7){
                        kc += 1;
                    }
                    if (kc == sc && kr == sr){
                        if(sc == 7){
                            kc -= 1;
                        }else {
                            sc += 1;
                        }
                    }
                    break;
                case "L":   //왼쪽
                    if(kc != 0){
                        kc -= 1;
                    }
                    if (kc == sc && kr == sr){
                        if(sc == 0){
                            kc += 1;
                        }else {
                            sc -= 1;
                        }
                    }
                    break;
                case "T":   //위쪽
                    if(kr != 7){
                        kr += 1;
                    }
                    if (kc == sc && kr == sr){
                        if(sr == 7){
                            kr -= 1;
                        }else {
                            sr += 1;
                        }
                    }
                    break;
                case "B":   //아래쪽
                    if(kr != 0){
                        kr -= 1;
                    }
                    if (kc == sc && kr == sr){
                        if(sr == 0){
                            kr += 1;
                        }else {
                            sr -= 1;
                        }
                    }
                    break;
                case "RT":  //오른쪽 위
                    if(kc != 7 && kr != 7){
                        kc += 1;
                        kr += 1;
                    }
                    if (kc == sc && kr == sr){
                        if(sc == 7 || sr == 7){
                            kc -= 1;
                            kr -= 1;
                        }else {
                            sc += 1;
                            sr += 1;
                        }
                    }
                    break;
                case "RB":  //오른쪽 아래
                    if(kc != 7 && kr != 0){
                        kc += 1;
                        kr -= 1;
                    }
                    if (kc == sc && kr == sr){
                        if(sc == 7 || sr == 0){
                            kc -= 1;
                            kr += 1;
                        }else {
                            sc += 1;
                            sr -= 1;
                        }
                    }
                    break;
                case "LT":  //왼쪽 위
                    if(kc != 0 && kr != 7){
                        kc -= 1;
                        kr += 1;
                    }
                    if (kc == sc && kr == sr){
                        if(sc == 0 || sr == 7){
                            kc += 1;
                            kr -= 1;
                        }else {
                            sc -= 1;
                            sr += 1;
                        }
                    }
                    break;
                case "LB":  //왼쪽 아래
                    if(kc != 0 && kr != 0){
                        kc -= 1;
                        kr -= 1;
                    }
                    if (kc == sc && kr == sr){
                        if(sc == 0 || sr == 0){
                            kc += 1;
                            kr += 1;
                        }else {
                            sc -= 1;
                            sr -= 1;
                        }
                    }
                    break;
            }
        }

        System.out.println(col.get(kc).toString() + row.get(kr).toString());
        System.out.println(col.get(sc).toString() + row.get(sr).toString());
    }
}