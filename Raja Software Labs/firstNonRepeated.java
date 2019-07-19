/*

Question 4: A string is given return first non-repeated character in it. 
             Example: harsh 
                        output: a(h is present 2 times)

*/

public class firstNonRepeated{
	public static void main(String[] args) {
        System.out.println(firstNonRepetableChar("harsh"));//a

	}

	public static char firstNonRepetableChar (String s){
        char []c=new char[s.length()];
        
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        int index=0;
        boolean check=true;
        for(int i=0;i<s.length();i++){
            check=true;
            
            for(int j=i+1;j<s.length();j++){
                if(j<s.length() && c[i]==c[j]){
                    check=false;
                    break;
                }
                
            }
            if(check){
                index=i;
                break;
            }
        }
        return c[index];
    }


}