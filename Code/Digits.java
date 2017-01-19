import java.util.*;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letterCombinations("2");
	}
	
	public static List<String> letterCombinations(String digits) {
        //if(digits.length() == 0) return null;
    
        LinkedList<String> re = new LinkedList<String>();
        String[] dic = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        re.add("");
        if(digits.length() == 0){
            re.remove();
            return re;
        } 
        for(int i=0; i<digits.length(); i++){
        	System.out.println("1st");
            while(re.peek().length() == i){
            	System.out.println("2rd");
                String temp = dic[Character.getNumericValue(digits.charAt(i))];
                for(int j=0; j<temp.length();j++){
                	System.out.println("3rd");
                    re.add(re.peek()+temp.charAt(j));
                }
                re.remove();
            }
        }
    return re;
    }
}
