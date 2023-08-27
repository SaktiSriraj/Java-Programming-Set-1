/*
 Write a program to check if a decimal number is a palindrome.
 */

public class Q15 {
	public static boolean isPalindrome(int x) {
		if(x<0) {
			return false;
		}
		int digits=(int)(Math.floor(Math.log10(x)))+1;
		int msdmask=(int)Math.pow(10, digits-1);
		for(int i=0;i<(digits/2);++i) {
			if(x/msdmask!=x%10) {
				return false;
			}
			x%=msdmask;
			x/=10;
			msdmask/=100;
		}
		return true;
	}
    public static void main(String[] args) {
		if(isPalindrome(157751)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
