import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Bubble {
    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        dataList.add(4);
        dataList.add(9);
        dataList.add(2);

        // 데이터가 2개일때
        if(dataList.get(0) > dataList.get(1)){
            Collections.swap(dataList, 0, 1);
        }
        System.out.println(dataList);

        // 데이터가 3개일때
        for(int i = 0; i > dataList.size()-1; i++){
            if(dataList.get(i) > dataList.get(1+1)){
                Collections.swap(dataList, i, i+1);
            }
        }

        for(int i = 0; i<10; i++){
            System.out.println((int)(Math.random()*100));
        }

        ArrayList<Integer> testData = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++){
            testData.add((int)(Math.random() * 100));
        }
        BubbleSort bSort = new BubbleSort();
        System.out.println(bSort.sort(testData));



    }

    public static class BubbleSort{
        public ArrayList<Integer> sort(ArrayList<Integer>dataList){
            for(int i = 0; i < dataList.size() -1; i++){
                boolean swap = false;

                for(int j = 0; j < dataList.size() -1; j++){
                    if(dataList.get(j) > dataList.get(j+1)){
                        Collections.swap(dataList, j, j+1);
                        swap = true;
                    }
                }

                if(swap == false){
                    break;
                }
            }
            return dataList;
        }
    }
}
