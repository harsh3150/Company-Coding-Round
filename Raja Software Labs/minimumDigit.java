/*

Question 2:  A number is given find the smallest single digit number(i.e. from 0-9)in it.(No sorting algorithms is allowed)
*/

public class minimumDigit{
	public static void main(String[] args) {

		System.out.println(min(9232));//2
        System.out.println(min(9999));//9
	}

	public static int min(int x){
        String s=x+"";
        if(s.contains("0")){
            return 0;
        }
        else if(s.contains("1")){
            return 1;
        }
        else if(s.contains("2")){
            return 2;
        }
        else if(s.contains("3")){
            return 3;
        }
        else if(s.contains("4")){
            return 4;
        }
        else if(s.contains("5")){
            return 5;
        }
        else if(s.contains("6")){
            return 6;
        }
        else if(s.contains("7")){
            return 7;
        }
        else if(s.contains("8")){
            return 8;
        }
        return 9;
    }    // Question 2 ends here.

}