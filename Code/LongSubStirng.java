import java.util.HashMap;

public class LongSubStirng {

	public static void main(String[] args) {
		 System.out.println(lengthOfLongestSubstring("abba"));

	}
	public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int max=0;
        for(int i=0, flag=0; i<s.length(); i++){
        	System.out.println("i: "+i+"  "+"char:"+s.charAt(i));
            if(hm.containsKey(s.charAt(i))){
                flag=Math.max(flag,hm.get(s.charAt(i))+1);
                System.out.println("jingru,i:"+i);
                System.out.println("flag:"+flag);
            }
            hm.put(s.charAt(i), i);
            max = Math.max(max, (i-flag)+1);
            System.out.println("max: "+max);
        }
        return max;
    }
}
