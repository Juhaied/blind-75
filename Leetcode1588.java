import java.util.Arrays;

public class Leetcode1588 {
    public static void main(String[] args) {
        int a[] = {1,4,2,5,3};

        debug(sumOddLengthSubarrays(a));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        int pref[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            pref[i] = sum;
        }

        int ans1 = 0;

        //debug(ans);
        for (int i = 2; i < arr.length; i+=2) {
            ans1 += pref[i];
        }
        int sum2 = 0;
        for (int i = 1;i<arr.length;i++){
            for (int j = i+2 ; j<arr.length;j+=2){
                sum2 += pref[j] - pref[i-1];
              //  debug("sum2 : "+sum2);
            }
        }
        return sum+sum2+ans1;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
