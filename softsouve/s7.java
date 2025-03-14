package softsouve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class s7 {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = new ArrayList<>();
        nestedList.add(Arrays.asList(10, 20));
        nestedList.add(Arrays.asList(11, 22));
        nestedList.add(Arrays.asList(21, 25));
        nestedList.add(Arrays.asList(3, 4, 5));
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nestedList.size() - 1; i++) {
            int currentMin = Integer.MAX_VALUE;
            for (int num : nestedList.get(i)) {
                if (num < currentMin) {
                    currentMin = num;
                }
            }
            int nextMin = Integer.MAX_VALUE;
            for (int num : nestedList.get(i + 1)) {
                if (num < nextMin) {
                    nextMin = num;
                }
            }
            if (currentMin < nextMin) {
                result.add(Arrays.asList(currentMin));
            } else {
                result.add(new ArrayList<>());
            }
        }
        System.out.println(result);
    }
}

