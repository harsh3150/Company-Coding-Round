
/*
Question 1:  A number is given find the nearest prime to it.
*/
public class nearestPrime{
	public static void main(String[] args) {
		System.out.println(nearestPrime(33));//31

		System.out.println(nearestPrime(1000000000));//1000000007


	}

	 public static int nearestPrime (int num){
        int smaller=0,bigger=0;
        boolean check=true;
        for(int i=num;i>0;i--){
            
            if(isPrime(i)!=-1){
                smaller=i;
                break;
            }
        }
        
        int temp=num+1;
        while(check){
            if(isPrime(temp)!=-1){
                bigger=temp;
                break;
            }
            temp++;
        }
        
        if(num-smaller<bigger-num){
            return smaller;
        }
        return bigger;
    }
    
    public static int isPrime(int num){
        
        boolean check=true;
        
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                check=false;
                break;
            }
        }
        
        if(check)
            return num;
        return -1;
    } 
	
}