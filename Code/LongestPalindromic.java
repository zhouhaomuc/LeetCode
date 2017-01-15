
public class LongestPalindromic {

	public static void main(String[] args) {
		String res = longestPalindrome("cbb");
		System.out.println(res);
		
	}
	public static String longestPalindrome(String s) {
		 int oddIndex=0;
	        int rOdd=0;
	        int evenIndex=0;
	        int rEven=0;
	        if(s.length()<=1){
	            return s;
	        }
	        for(int i = 1; i<=s.length()-2; i++){
	            for(int j = 1; (j<=i)&&(j<=s.length()-i-1); j++){
	                if(s.charAt(i-j) == (s.charAt(i+j))){
	                    if(j>rOdd){
	                        rOdd = j;
	                        oddIndex = i;
	                        System.out.println("rOdd:"+rOdd+" oddIndex:"+oddIndex);
	                        continue;
	                    }
	                }else{
	                    break;
	                }
	            }
	        }
	        for(int i=0; i<s.length()-1;i++){
	            for(int j=0; (j<=i)&&(j<=s.length()-2-i); j++){
	                if(s.charAt(i-j) == s.charAt(i+1+j)){
	                    if(((j+1)*2)>rEven){
	                        rEven = (j+1)*2;
	                        evenIndex = i;
	                        System.out.println("rEven:"+rEven+" evenIndex:"+evenIndex);
	                        continue;
	                    }
	                    
	                }else{
	                        break;
	                }
	            }
	         
	        }
	        
	        if((rOdd+rOdd+1)>rEven) {
	        	System.out.println("case 1:");
	            return s.substring(oddIndex-rOdd,oddIndex+rOdd+1);
	        }else if((rOdd+rOdd+1)<rEven){
	        	System.out.println("case 2");
	            return s.substring(evenIndex+1-rEven/2, evenIndex+rEven/2+1);
	        }
	        return "";
    }
}
