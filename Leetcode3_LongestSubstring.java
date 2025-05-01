import java.util.HashSet;

public class Leetcode3_LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s) {
        int a_pointer = 0, b_pointer  = 0, max = 0;
        HashSet<Character> set = new HashSet<>();

        while (b_pointer < s.length()){
            char ch = s.charAt(b_pointer);
            if(!set.contains(ch)){
                set.add(ch);
                b_pointer++;
            }
            else {
                max = Math.max(set.size(),max);
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }

        return Math.max(max,set.size());
    }

}
