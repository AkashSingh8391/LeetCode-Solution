/*
You are given two non-negative integers represented as two separate integer arrays arr1 and arr2.
Each element in the arrays contains a single digit (0–9), and the most significant digit comes first (at index 0).

Your task is to return the sum of these two numbers as an array of digits.

You are not allowed to directly convert the arrays to integers or use big integer libraries.

Example 1:
Input:

Copy
Edit
arr1 = [1, 2, 3]
arr2 = [9, 8, 7]
Output:

csharp
Copy
Edit
[1, 1, 1, 0]
Explanation:

yaml
Copy
Edit
123 + 987 = 1110
Example 2:
Input:

ini
Copy
Edit
arr1 = [9, 9, 9]
arr2 = [1]
Output:

csharp
Copy
Edit
[1, 0, 0, 0]
Explanation:

yaml
Copy
Edit
999 + 1 = 1000
Example 3:
Input:

ini
Copy
Edit
arr1 = [0]
arr2 = [0]
Output:

csharp
Copy
Edit
[0]
Constraints
1 <= arr1.length, arr2.length <= 10^4

0 <= arr1[i], arr2[i] <= 9

Arrays do not have leading zeros, except for the number 0 itself.



*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumOfTwoArray {
	public static int[] addDigitArray(int [] arr1, int [] arr2) {
		
		int i=arr1.length-1;
		int j=arr2.length-1;
		int carry=0;
		
		ArrayList<Integer> result=new ArrayList<>();
		
		while(i>=0 || j>=0 || carry>0) {
			
			/*
			 * int digit1 = 0;
if (i >= 0) {
    digit1 = arr1[i];
}

int digit2 = 0;
if (j >= 0) {
    digit2 = arr2[j];
}

			 */
			int digit1=(i>=0)? arr1[i]:0;
			int digit2=(j>=0)? arr2[j]:0;
			
			int sum=digit1+digit2+carry;
			
			result.add(sum%10);
			carry=sum/10;
			i--;
			j--;
		}
		
		Collections.reverse(result);
		
		int [] finalResult=new int[result.size()];
		
		for(int k=0;k<result.size();k++) {
			finalResult[k]=result.get(k);
		}
		
		return finalResult;
	}
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the 1st array index:");
		int n1=sc.nextInt();
		int []arr1=new int[n1];
		System.out.println("Enter the 1 array element:");
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the 2nd array index:");
		int n2=sc.nextInt();
		int [] arr2=new int[n2];
		System.out.println("Enter the 2 array element:");
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		
		int [] sumArray=addDigitArray(arr1, arr2);
		
		System.out.println("Sum of two array is:");
		for(int num:sumArray) {
			System.out.print(num+" ");
		}
		sc.close();
	}

}
