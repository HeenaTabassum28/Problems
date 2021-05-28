package eny;

import java.util.Arrays;
import java.util.List;

public class StatisticsIndicators {
    public static void main(String[] args) {
       // System.out.println(difference_calculator(Arrays.asList(3, 3, 2, 2, 5, 5, 5, 5, 5, 3, 3, 3, 2, 2)));
        System.out.println(difference_calculator(Arrays.asList( 1, 2, 2, 4, 4, 4, 4, 2, 2, 2)));
       /* System.out.println(difference_calculator(Arrays.asList(1, 2, 2, 2, 2, 3, 3, 3, 1, 1, 2, 2)));
        System.out.println(difference_calculator(Arrays.asList(2, 2, 2, 4, 4, 4, 4, 4, 4)));*/
    }

    public static int difference_calculator(List<Integer> arr) {
        return indicator1(arr) - indicator2(arr);

    }

    private static int indicator2(List<Integer> arr) {
        int maxCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            int index = arr.get(i) - 1;
            if(arr.get(i)==arr.get(index)){
                int count = 0;
                for (int j = index; j < arr.size(); j++) {
                    if (arr.get(i) == arr.get(j)) {
                        count++;
                    } else {
                        i = j-1;
                        break;
                    }
                }
                if (arr.get(i) == count) {
                    maxCount++;
                }
            }

        }
        return maxCount;
    }

    private static int indicator1(List<Integer> arr) {
        int maxCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                } else {
                    i = j - 1;
                    break;
                }
            }
            if (arr.get(i) == count) {
                maxCount++;
            }
        }
        return maxCount;
    }
}



