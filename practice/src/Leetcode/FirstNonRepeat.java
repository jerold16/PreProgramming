package Leetcode;

public class FirstNonRepeat {
	static int nonrepeat(String str) {
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch))
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		String str="abcdacbd";
		int n =nonrepeat(str);
		System.out.println(n);
	}

}
