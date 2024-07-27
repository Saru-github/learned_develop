import java.util.ArrayList;
import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        Split s = new Split();
        s.splitFunc(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6)));
    }

    public static class Split{
        public ArrayList<Integer> splitFunc(ArrayList<Integer> dataList){
            if(dataList.size()<=1){
                return dataList;
            }

            int medium = dataList.size()/2;

            ArrayList<Integer> leftArr = new ArrayList<Integer>();
            ArrayList<Integer> rightArr = new ArrayList<Integer>();

            leftArr = new ArrayList<Integer>(dataList.subList(0, medium));
            rightArr = new ArrayList<Integer>(dataList.subList(medium, dataList.size()));

            System.out.println(leftArr);
            System.out.println(rightArr);

            return mergeFunc(leftArr, rightArr);


        }

        public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList){
            ArrayList<Integer> mergedList = new ArrayList<Integer>();
            int leftPoint = 0;
            int rightPoint = 0;

            // CASE1: left/right 둘다 있을 때
            while (leftList.size() > leftPoint && rightList.size() > rightPoint )
                if(leftList.get(leftPoint) > rightList.get(rightPoint)){
                    mergedList.add(rightList.get(rightPoint));
                    rightPoint += 1;
                } else {
                    mergedList.add(leftList.get(leftPoint));
                    leftPoint += 1;
                }
            // CASE2: right 데이터가 없을 때
            while(leftList.size()>leftPoint){
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
            // CASE3: left 데이터가 없을 때
            while(rightList.size() > rightPoint){
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            }

            return mergedList;

        }
    }
}
