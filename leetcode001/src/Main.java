import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{9,1,2,3,8,7,5};
        int target = 9;
        String string = Arrays.toString(nums);
        System.out.println("string = " + string);
        int[] res = twoSum(nums,target);
        String string1 = Arrays.toString(res);
        System.out.println("string1 = " + string1);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = i;
            int key = nums[i];
            if (map.containsKey(target-key)) {
                int[] res = {map.get(target-key), i};
                return res;
            }
            map.put(key, value);
        }
        return null;
    }
}
