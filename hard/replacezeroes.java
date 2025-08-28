

Given an integer array arr of size n, write a program to move all zeros to the end of the array while maintaining the relative order of the non-zero elements.

You must perform this operation in-place without making a copy of the array.

🔹 Input Format

The first line contains an integer n (size of array).

The second line contains n space-separated integers representing the array elements.

🔹 Output Format

Print the original array.

Print the modified array after moving all zeros to the end.

🔹 Constraints

1 <= n <= 10^5

-10^9 <= arr[i] <= 10^9



import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[n];
		
		System.out.println("Enter the value of an array");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println();
		int crntidx=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[crntidx]=arr[i];
				crntidx++;
			}
		}
		
		for(int i=crntidx;i<n;i++) {
			arr[i]=0;
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.print( arr[i]+" ");
		}
		

	}

}
