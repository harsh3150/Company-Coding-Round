/*

Question 3:  A string is given find if it has repetable characters in it, if it doesn't have any print true or else false. (Use collection)
             Example: harsh 
                        output: false(h is present 2 times)
                      
                      cat
                        output: true( no repetable charcters)

*/

import java.util.*;

public class repetableCharacters{
	public static void main(String[] args) {
		System.out.println(hasRepeatableChar("hars"));//true
        System.out.println(hasRepeatableChar("harsh"));//false
	}

	public static boolean hasRepeatableChar(String s){
        List <Character> list=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        
        boolean check=true;
        
        for(int i=0;i<s.length();i++){
            
            for(int j=i+1;j<s.length();j++){
                if(j<s.length()&& list.get(i)==list.get(j)){
                    check=false;
                    break;
                }
            }
            if(!check){
                break;
            }
            
        }
        return check;
        
        
    } 
}