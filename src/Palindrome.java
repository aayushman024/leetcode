class Palindrome {

    public boolean isPalindrome(int x){
        if(x<0 || (x%10 == 0 && x != 0))
            return false;

        int reversedHalf = 0;
        for(; x>reversedHalf; x=x/10){
            reversedHalf = reversedHalf*10 + x%10;
        }
        return (x == reversedHalf || x == reversedHalf/10);
    }

}
