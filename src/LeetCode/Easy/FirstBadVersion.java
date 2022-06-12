package LeetCode.Easy;
//Leetcode : https://leetcode.com/problems/first-bad-version/

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        // int mid = -1;
        int first_bad_version = n;

        while(start <= end)
        {
            // int mid = (start + end) / 2;
            int mid = start + ((end-start)/2);
            if(isBadVersion(mid)){
                end = mid - 1;
                // Save this version , this may be the first bad version
                first_bad_version = mid ;
            }
            else
                start = mid + 1;
        }

        return first_bad_version;
    }

    public static boolean isBadVersion(int n){
        return n==4;
    }
}
