class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x/2;
        int ans;

        if( x < 2){
            return x;
        }
        while( start <= end){
            int mid = start + (end - start)/2;
            int temp = x/mid;
            if( temp == mid){
                return mid;
            }
            else if (temp < mid ){
                end = mid - 1 ;
            }
            else{
                start = mid + 1;
            }
        }
        return start -1 ;
    }
}