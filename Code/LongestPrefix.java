import java.util.Arrays;

public class LongestPrefix {

	public static void main(String[] args) {
		String[] arr = {"abcdd", "abcif","abc"};
		
		System.out.println(longestCommonPrefix(arr));
	}
	
	public static String longestCommonPrefix(String[] strs) {
        String re = "";
        if(strs.length <= 1){
            if(strs.length == 0) return "";
            return strs[0];
        }
        Arrays.sort(strs);
        for(int i=0; i<strs[0].length(); i++){
            char init = strs[0].charAt(i);
        	if(init == strs[strs.length-1].charAt(i)) re+=init;
        	else return re;
        }
    return re;
	}
}
