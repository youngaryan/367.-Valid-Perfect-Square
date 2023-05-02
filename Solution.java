public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 0) return false;
        if (num == 1) return true;
        //checking the final digit
        if (num % 10 == 2 || num % 10 == 3 || num % 10 == 7 || num % 10 == 8 ) return false;
        if (num % 10 == 5) {
            return num % 100 == 25;
        }
        if (num % 10 == 0){
            return num % 100 == 0 ;
        }

        for (int i = 2; i <= num/2; i++) {
            if (i*i == num) return true;
        }
        return false;
    }
}
