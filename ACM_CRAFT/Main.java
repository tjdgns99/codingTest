import java.util.*;

public class Main {
    static int n ;
    static int k;
    static int[] d;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();                 //testcase 개수 입력
        for(int test = 0; test < t; test++){    //testcase 만큼 반복
            n = scan.nextInt();                 //건물 수 입력
            k = scan.nextInt();                 //규칙 수 입력
            d = new int[n + 1];                 //건설 시간을 위한 배열 선언

            List<List<Integer>> list = new ArrayList<List<Integer>>();  //Integer 배열의 배열인 리스트, [[1,2...], [3, 4...]...]
            for(int i = 0; i < n + 1; i++){
                list.add(new ArrayList<Integer>()); //빈 배열을 리스트에 삽입
            }

            int[] indegree = new int[n+1];          //위상정렬을 위한

            for(int i = 1; i <= n; i++){            //각 건물의 건설 시간 입력
                d[i] = scan.nextInt();
            }

            for(int i = 0; i < k; i++){             //k개 규칙 입력
                int v1 = scan.nextInt();            //시작점
                int v2 = scan.nextInt();            //종점

                list.get(v1).add(v2);               //list 속 배열의 시작점 인덱스에 종점을 삽입
                indegree[v2]++;                     //종점을 가리키는 수 +1
            }

            int w = scan.nextInt();                 //타깃 값 입력

            topologicalSort(indegree, list, w);
        }
    }

    static void topologicalSort(int[] indegree, List<List<Integer>> list, int w){
        Queue<Integer> q = new LinkedList<Integer>();   //큐 생성, 위상 정렬을 위해서 생성
        int[] result = new int[n + 1];                  //

        //건물의 건설 시간 d[i]
        for(int i = 1; i <= n; i++){
            result[i] = d[i];
            if(indegree[i] == 0)
                q.offer(i);                              // 더이상 해당 위치를 가리키는 것이 없으면 result에 추가
        }

        //건물의 총 소요시간 = 이전까지의 소요시간 + 현재 건물 소요시간
        //Max 해주는 이유는 이전 테크가 다 올라야 현재 건물을 지을 수 있기 때문
        while(!q.isEmpty()){                            //큐가 빌때까지 반복
            int node = q.poll();                        //node에 q 맨 앞에 있는 값 반환 후 삭제

            for(Integer i : list.get(node)){            //list에서 node 인덱스안 배열(node를 시작으로 하는 종점들)을 i에 하나씩 넣고 반복
                result[i] = Math.max(result[i], result[node] + d[i]);//이것의 결과에 출발점 건물 시간 + 종점 건물시간하고 종점 건물 시간 중 큰 값 반환
                indegree[i]--;                          //가리키는 것 개수 감소

                if(indegree[i] == 0)
                    q.offer(i);
            }
        }

        System.out.println(result[w]);
    }
}
