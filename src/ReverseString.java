
public class ReverseString {

	public static void main(String[] args) {
		String s = "Hello";
		Solution ss = new Solution();
		
		System.out.println(ss.reverseString(s));
				

	}

}

class Solution {
    public String reverseString(String s) {
        String out = "";
        for(int i = s.length() - 1; i >= 0; i--){
            out = out + s.charAt(i);
        }
        return out;
    }
}
