import java.util.ArrayList;
import java.util.Collections;

public class Selection {
    public static void main(String[] args) {

    }

    public class SelectionSort{
        public ArrayList<Integer>sort(ArrayList<Integer> dataList){
            int lowest;
            for(int i =0; i < dataList.size()-1; i++){
                lowest = i;
                for(int j = i+1; j < dataList.size(); j++){
                    if(dataList.get(lowest) > dataList.get(j)){
                        lowest = j;
                    }
                }
                Collections.swap(dataList, lowest, i);
            }
        return dataList;
        }
    }
}
