class isPalindrome {
    public boolean isPalindrome(int x) {
        int a = x;
        int last = 0;
        int rev = 0;
        while(x!=0){
            last = x % 10;
            rev = rev * 10 + last;
            x = x / 10;
        }
        if(a<0){
            return false;
        }else if(a == rev){
               return true;
        }
        return false;
     
    }
}
class Palindrome{
    public static void main(String[] args) {
        int x = 121;
    }
}