//leetcode 704

public class Main {
    public static void main(String[] Args) {
        int[] nums1 = new int[]{-1,0,3,5,9,12};
        int[] nums2 = new int[]{-1,0,3,5,9,12};
        int res1 = search(nums1,9);
        System.out.println("res1 = " + res1);
        int res2 = search(nums2,2);
        System.out.println("res2 = " + res2);

    }


    public static int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while(leftIndex <= rightIndex){
            int midNum = (leftIndex + rightIndex) / 2;

            if(nums[midNum] > target){
                rightIndex = midNum - 1;

            }

            if(nums[midNum] < target){
                leftIndex = midNum + 1;
            }

            if(nums[midNum] == target){
                return midNum;
            }

        }

        return -1;
    }
}
