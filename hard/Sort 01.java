/*****************
Sort 01 in the given array 
****************/




public class Sort01 {
		public static void main(String [] args) {
			int[] arr= {0,1,2,0,2,1,1,0};
			int temp=0;
			int i=0;
			int j=arr.length-1;
			
			
			int n=arr.length;
			
			while(i<arr.length && i<j) {
				
				if(arr[i]==0 && arr[j]==1) {
					i++;
					j--;
				}
				else if(arr[i]==1 && arr[j]==0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				else if(arr[i]==1 && arr[j]==1) {
					j--;
					
				}
				else {
					i++;
				}
			}
			
			System.out.println("Array after sort01 is:");
			
			for(int k=0;k<n;k++) {
				System.out.print(arr[k]+" ");
			}
		}
}
