public class Main {
//输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
    public static void main(String[] Args ){
        int[] nums1 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = new int[]{5,4,-1,7,8};

        int res1 = maxSubArray(nums1);
        System.out.println("res1 = " + res1);
        int res2 = maxSubArray(nums2);
        System.out.println("res2 = " + res2);

    }

    private static int maxSubArray(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        int leftIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[leftIndex]<nums[i]){
                leftIndex = i;
            }
        }
        int res2 = 0;
        for (int i = leftIndex; i < nums.length-leftIndex; i++) {

        }
        return 0;
    }
}
