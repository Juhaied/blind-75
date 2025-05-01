import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int a[] = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(a));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : set) {
            // only start counting if `num - 1` is not in the set (i.e., num is the start of a sequence)
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                maxLen = Math.max(maxLen, currentStreak);
            }
        }

        return maxLen;
    }

}