/*****************MERGE TWO SORTED ARRAY*********************/


package arrayDsa;

import java.util.ArrayList;
import java.util.Scanner;

public class Merge {
	
	public static void setArray(ArrayList<Integer>arr, Scanner sc) {
		System.out.println("Enter the array index:");
		int n=sc.nextInt();
		
		System.out.println("Enter the array Element:");
		
		for(int i=0;i<n;i++) {
			int element=sc.nextInt();
			arr.add(element);
		}
	}
	
	
	public static ArrayList<Integer> merge(ArrayList<Integer> arr1,ArrayList<Integer>arr2) {
		
		ArrayList<Integer> merge=new ArrayList<>();
		
		int m=0;
		int n=0;
		
		
		while(m<arr1.size() && n<arr2.size()) {
			if(arr1.get(m)<arr2.get(n)) {
				merge.add(arr1.get(m));
				m++;
			}else {
				merge.add(arr2.get(n));
				n++;
			}
		}
		
		while(m<arr1.size()) {
			merge.add(arr1.get(m));
			m++;
		}
		
		while(n<arr2.size()) {
			merge.add(arr2.get(n));
			n++;
		}
		
		
		
		return merge;
	}
	
	public static void display(ArrayList<Integer>arr) {
		int n=arr.size();
		
		
		
		System.out.println("Enter the array element:");
		for(int i=0;i<n;i++) {
			System.out.print(arr.get(i));
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> arr1=new ArrayList<>();

		ArrayList<Integer> arr2=new ArrayList<>();
		
		System.out.println("Input first Array:");
		setArray(arr1,sc);
		
		
		
		System.out.println("Input second Array:");
		setArray(arr2,sc);
		
		
		System.out.println("First Array:");
        display(arr1);

        System.out.println("Second Array:");
        display(arr2);

        ArrayList<Integer> mergedArray = merge(arr1, arr2);

        System.out.println("Merged Sorted Array:");
        display(mergedArray);

		
		
		
	}

}
