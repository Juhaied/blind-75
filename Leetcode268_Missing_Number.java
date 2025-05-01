import java.util.HashSet;

public class Leetcode268_Missing_Number {
    public static void main(String[] args) {
        int a[] = {3,0,1};

        System.out.println(missingNumber(a));

    }
    public static int missingNumber(int[] nums) {
        int sum = (nums.length*(nums.length+1))/2;

        int ara_sum = 0;

        for(int i = 0;i<nums.length;i++){
            ara_sum+=nums[i];
        }

        return sum-ara_sum;
    }

}
