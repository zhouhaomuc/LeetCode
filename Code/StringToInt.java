
public class StringToInt {

	public static void main(String[] args) {

		int i = myAtoi("2147483648");
		System.out.println(i);
	}
	public static int myAtoi(String str) {
        if(str.length() == 0) return 0;
        String sign = "";
        String pre = "";
        String pro = "";
        int point = 0;
        int result = 0;
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i)!=' '){
                pre = str.substring(i);
                System.out.println("pre:"+pre);
                break;
            }
        }
        
        System.out.println("charat(0)"+pre.charAt(0));
        if(pre.charAt(0) == '+'){
            pre = pre.substring(1);
        }else if(pre.charAt(0) == '-'){
            sign = "-";
            pre = pre.substring(1);
            System.out.println("sign: -1");
        }
        System.out.println("pre:"+pre);
        for(int i=0; i<pre.length(); i++){
            char ch = pre.charAt(i);
            System.out.println("char:"+ch);
            if(ch < '0' || ch>'9'){
                if((ch == '.') && point == 0){
                    pro += ch; 
                }else{
                    break;
                }
            }else{
                pro += ch;
            }
        }
        System.out.println(pro);
        if(pro == "") return 0;
        pro = sign+pro;
        System.out.println("pro:|"+pro+"|");
        System.out.println(Integer.parseInt("2147483648"));
        try{
            result = Integer.parseInt(pro);
        }catch(Exception e){
        	result = 0;
        }
        return result;
        
        
        
    }
}
