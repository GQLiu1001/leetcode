import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        sortedSquares(arr);
    }


    public static int[] sortedSquares1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        //冒泡排序
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
            System.out.println("nums = " + Arrays.toString(nums));
        }
        return nums;
    }

    public static int[] sortedSquares(int[] nums) {
        //双指针 因为最大值只能是两边
        //这次的双指针是两边向内夹 i j改变大小取决于是否符合放入新数组标准
        // 判断两边的平方大小 创建新数组 放入 并改变指针
        //冒泡排序
        int i = 0, j = nums.length - 1;
        int k = nums.length;
        int[] res = new int[nums.length];
        for (i = 0 , j =nums.length-1; i <= j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                int index = k-1;
                res[index] = nums[i] * nums[i];
                System.out.println("k = " + k);
                i++;
                k--;
            }else {
                int index = k-1;
                res[index] = nums[j] * nums[j];
                System.out.println("k = " + k);
                j--;
                k--;
            }
            System.out.println("res = " + Arrays.toString(res));
        }


        return nums;
    }
}
