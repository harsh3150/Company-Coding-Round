import java.util.Scanner;

public class pattern{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int n=input.nextInt();
		print(n);
	}

	public static void print(int n){

		String line1="*";
		String lastLine="*";
		if(n==1){
			System.out.println(line1);
			return;
		}
		else if(n==2){
			System.out.println(" **\n**");
			return;
		}

		String middle="*";
		String middleArr[]=new String[n-2];

		for(int i=1;i<n;i++){
			line1=" "+line1+"*";
			lastLine+="*";
			if(i!=n-1)
				middle=" "+middle+" ";
			else
				middle+="*";
		}

		for(int i=0;i<n;i++){
			if(i==0)
				System.out.println(line1);
			else if (i==n-1)
				System.out.println(lastLine);
			else
			{
				System.out.println(middle);
				middle=middle.substring(1);

			}


		}
	}
}