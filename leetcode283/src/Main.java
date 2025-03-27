import java.util.Arrays;

public class Main {
    //给定一个数组 nums，编写一个函数将所有 0
    // 移动到数组的末尾，同时保持非零元素的相对顺序。
    //请注意 ，必须在不复制数组的情况下原地对数组进行操作。
    //示例 1:
    //输入: nums = [0,1,0,3,12]
    //输出: [1,3,12,0,0]
    //示例 2:
    //输入: nums = [0]
    //输出: [0]
    public static void main(String[] args) {
        int[] nums1 = new int[]{0, 1, 0, 3, 12};
        int[] nums2 = new int[]{0};

        moveZeroes(nums1);
        moveZeroes(nums2);
    }

    public static void moveZeroes(int[] nums) {
        //做交换 一开始想法和理解题目就错了 一开始想新创数组，扔到最后面
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
        System.out.println("res = " + Arrays.toString(nums));
    }

    public static void  moveZeroes1(int[] nums) {
        //错误想法 防止数组越界，第二个指针放在i的后面
        int j = 1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[j];
                nums[i+j] = 0;
                nums[i] = temp;
                j++;
            }

            if(nums[i]==0 && nums[j] == 0){
                j++;
                i--;
            }

            if(j == 5){
                break;
            }

        }
    }
}
