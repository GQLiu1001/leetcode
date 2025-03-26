public class Main {

    public static void main(String[] Args) {
        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        int res = maxArea(nums);
        System.out.println("res = " + res);
    }

    private static int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length-1;
        int s = Math.min(height[leftIndex],height[rightIndex]) * (rightIndex - leftIndex);
        for (int i = 1; i < height.length; i++) {
            if (height[leftIndex]<height[rightIndex]){
                leftIndex += 1;
                int s1 = Math.min(height[leftIndex],height[rightIndex]) * (rightIndex - leftIndex);
                if (s1 > s){
                    s = s1;
                }
            }else {
                rightIndex -=1 ;
                int s1 = Math.min(height[leftIndex],height[rightIndex]) * (rightIndex - leftIndex);
                if (s1 > s){
                    s = s1;
                }
            }
        }
        return s;
    }


}
