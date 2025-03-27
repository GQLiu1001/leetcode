public class Main {

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int i = minSubArrayLen(7, arr);
        System.out.println("output"+i);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        //先让结束指针 j 移动，一直累加直到大于等于target
        //开始移动 i 做相关逻辑
        int res = nums.length;
        int tag = 0;
        for ( int j = 0; j < nums.length; j++) {
            sum += nums[j];
            //防止最后一次循环判断完直接结束 用while
            while(sum>=target){
                sum -= nums[i];
                res = (j-i+1) < res ? (j-i+1):res;
                i++;
                tag++;
            }
        }
        return tag==0?0:res;
    }
}
