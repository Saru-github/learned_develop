package dataStructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue_int = new LinkedList<Integer>();
        Queue<String> queue_str = new LinkedList<String>();

        queue_int.add(1);
        queue_int.offer(2);

        System.out.println(queue_int);

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "사과");
        map1.put(2, "바나나");
        map1.put(3, "포도");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("가", "사과");
        map2.put("나", "바나나");
        map2.put("다", "포도");

        System.out.println(map1.get(1));
        System.out.println(map2.get("다"));


        int answer = 0;
        for(int i = 1; i >= 12; i++){
            if(12 % i == 0){
                answer += i;
            }
        }
        System.out.println(answer);

    }
}