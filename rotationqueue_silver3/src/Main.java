import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        LinkedList<Integer> deque = new LinkedList<Integer>();  //덱 생성, 앞으로 뒤로 모두 삽입, 삭제 가능한 덱을 활용

        for(int i = 0; i < n; i++){
            deque.offer(i+1);   //덱에 삽입
        }

        st = new StringTokenizer(br.readLine());
        int[] target = new int[num];

        for(int i = 0; i < num; i++){
            target[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for(int i = 0; i < num; i++){
            int targetnum = deque.indexOf(target[i]);
            if(deque.size() % 2 == 0){
                if(targetnum <= deque.size() / 2 -1){
                    for(int j = 0; j < targetnum; j++){
                        int temp = deque.pollFirst();   //두번째 연산, 앞에거를 빼서 뒤에다 붙이기
                        deque.offerLast(temp);          //뒤에 삽입
                        count++;
                    }
                }else{
                    for(int j = 0; j < deque.size() - targetnum; j++){
                        int temp = deque.pollLast();    //세번째 연산, 뒤에거 빼서 앞에다 붙이기
                        deque.offerFirst(temp);         //앞에 삽입
                        count++;
                    }
                }
                deque.pollFirst();                      //제일 앞에거 빼기
            }else {
                if(targetnum <= deque.size() / 2){
                    for(int j = 0; j < targetnum; j++){
                        int temp = deque.pollFirst();
                        deque.offerLast(temp);
                        count++;
                    }
                }else{
                    for(int j = 0; j < deque.size() - targetnum; j++){
                        int temp = deque.pollLast();
                        deque.offerFirst(temp);
                        count++;
                    }
                }
                deque.pollFirst();
            }
        }
        System.out.println(count);

    }
}
