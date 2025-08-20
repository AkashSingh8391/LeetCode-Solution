package bubblesort;

import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the Index of an Array:");
	      int n=sc.nextInt();
	      
	      int [] arr=new int[n];
	      System.out.println("Enter the Array Element:");
	      for(int i=0;i<n;i++){
	          arr[i]=sc.nextInt();
	      }
	      
	      
	      int temp=0;
	      
	      for(int i=0;i<n;i++) {
	    	  for(int j=0;j<n-1;j++) {
	    		  if(arr[j]>arr[j+1]) {
	    			  temp=arr[j];
	    			  arr[j]=arr[j+1];
	    			  arr[j+1]=temp;
	    		  }
	    	  }
	      }
	      
	      
	      System.out.println("Sorted Array is:");
	      
	      for(int i=0;i<n;i++) {
	    	  
	    	  System.out.print(arr[i]+" ");
	      }
	      
	      
	      
	      
	}
}
