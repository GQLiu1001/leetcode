import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};

        int i = removeElement(arr, 2);
        System.out.println("i = " + i);

    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                int temp = nums[i];
                nums[i] = val;
                nums[j] = temp;
                j++;
            }

            System.out.println("nums = " + Arrays.toString(nums));
        }
//        return k; 傻逼了
        return nums.length - k;
    }
}
