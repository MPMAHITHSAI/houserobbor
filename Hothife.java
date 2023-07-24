package houserobo;

import java.util.Scanner;

public class Hothife {
	int houseRobber(int arr[],int n) {
		int sum=0;
		for(int i=0;i<n;i+=2) {
			sum+=arr[i];
		}
		return sum;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Hothife amt=new Hothife();
		System.out.println(amt.houseRobber(arr,n));
	}

}