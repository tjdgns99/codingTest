/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        for(int testcase = 0; testcase < t; testcase++){
            int n = scan.nextInt();
            int w = scan.nextInt();

            int[] enemy = new int[n * 2];
            int[] enemy_stat = new int[n * 2];
            for(int i = 0; i < n * 2; i++){
                enemy[i] = scan.nextInt();
                enemy_stat[i] = 0;
            }

            int[] temp = enemy;
            int c;
            for(int i = 0; i < n * 2; i++){
                for(int j = i; j < n * 2; j++){
                    if(temp[i] < temp[j]) {
                        c = temp[i];
                        temp[i] = temp[j];
                        temp[j] = c;
                    }
                }
            }

            int count = 0;
            int more = w;
            for(int i = 0; i < n * 2; i++){
                more = w;
                for(int j = 0; j < n * 2; j++){
                    if(enemy[j] == temp[i] && enemy_stat[j] == 0){
                        count += 1;
                        enemy_stat[j] = 1;
                        more -= enemy[j];
                        for(int k = i; k < n * 2; k++){
                            if(temp[k] < more){
                                more = temp[k];
                                for(int l = 0; l < (n * 2); l++){
                                    if(j == 0){
                                        if(l == j + 1 || l == n-1 || l == j + n){
                                            if(enemy_stat[l] == 0) {
                                                enemy_stat[l] = 1;
                                                break;
                                            }
                                        }
                                    }else if(j == n-1){
                                        if(l == 0 || l == j - 1 || l == j + n){
                                            if(enemy_stat[l] == 0) {
                                                enemy_stat[l] = 1;
                                                break;
                                            }
                                        }
                                    }else if(j == n){
                                        if(l == n + 1 || l == 0 || l == (2 * n -1)){
                                            if(enemy_stat[l] == 0) {
                                                enemy_stat[l] = 1;
                                                break;
                                            }
                                        }
                                    }else if(j == (n * 2) - 1){
                                        if(l == n || l == j - 1 || l == j - n){
                                            if(enemy_stat[l] == 0) {
                                                enemy_stat[l] = 1;
                                                break;
                                            }
                                        }
                                    }else if(j < n){
                                        if(l == j - 1 || l == j + 1 || l == j + n){
                                            if(enemy_stat[l] == 0) {
                                                enemy_stat[l] = 1;
                                                break;
                                            }
                                        }
                                    }else{
                                        if(l == j - 1 || l == j + 1 || l == j - n){
                                            if(enemy_stat[l] == 0) {
                                                enemy_stat[l] = 1;
                                                break;
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int test = scan.nextInt();
        for(int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int w = scan.nextInt();

            int[] enemy1 = new int[n];
            int[] enemy2 = new int[n];


            for (int i = 0; i < n; i++) {
                enemy1[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                enemy2[i] = scan.nextInt();
            }
            int charge = 0;
            int count = 0;
            int two = 0;
            int m = 0;

            while (charge < (n * 2)) {
                for (int i = 0; i < n; i++) {
                    if (enemy1[i] < w) {
                        charge += 1;
                        count += 1;
                        two = w - enemy1[i];
                        enemy1[i] += w;

                        if (i == 0){
                            if(two - enemy1[n-1] == m){
                                charge += 1;
                                enemy1[n-1] += w;
                            }else if(two - enemy1[i+1] == m){
                                charge += 1;
                                enemy1[i+1] += 1;
                            }else if(two - enemy2[i] == m){
                                charge += 1;
                                enemy2[i] += w;
                            }
                        }else if(i == n-1){
                            if(two - enemy1[0] == m){
                                charge += 1;
                                enemy1[0] += w;
                            }else if(two - enemy1[i-1] == m){
                                charge += 1;
                                enemy1[i-1] += w;
                            }else if(two - enemy2[i] == m){
                                charge += 1;
                                enemy2[i] += w;
                            }
                        }else {
                            if(two - enemy1[i-1] == m){
                                charge += 1;
                                enemy1[i-1] += w;
                            }else if(two -enemy1[i+1] == m){
                                charge += 1;
                                enemy1[i+1] += w;
                            }else if(two -enemy2[i] == m){
                                charge += 1;
                                enemy2[i] += w;
                            }
                        }
                    }

                    if (enemy2[i] < w) {
                        charge += 1;
                        count += 1;
                        two = w - enemy2[i];
                        enemy2[i] += w;

                        if (i == 0){
                            if(two - enemy2[n-1] == m){
                                charge += 1;
                                enemy2[n-1] += w;
                            }else if(two - enemy2[i+1] == m){
                                charge += 1;
                                enemy2[i+1] += 1;
                            }else if(two - enemy1[i] == m){
                                charge += 1;
                                enemy1[i] += w;
                            }
                        }else if(i == n-1){
                            if(two - enemy2[0] == m){
                                charge += 1;
                                enemy2[0] += w;
                            }else if(two - enemy2[i-1] == m){
                                charge += 1;
                                enemy2[i-1] += w;
                            }else if(two - enemy1[i] == m){
                                charge += 1;
                                enemy1[i] += w;
                            }
                        }else {
                            if(two - enemy2[i-1] == m){
                                charge += 1;
                                enemy2[i-1] += w;
                            }else if(two -enemy2[i+1] == m){
                                charge += 1;
                                enemy2[i+1] += w;
                            }else if(two -enemy1[i] == m){
                                charge += 1;
                                enemy1[i] += w;
                            }
                        }
                    }
                    System.out.println(count + "|||" + charge);
                }

                m += 1;

            }






            System.out.println(count);
        }
    }
}