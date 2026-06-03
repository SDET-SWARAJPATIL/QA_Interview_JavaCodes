package Java_MostAsked;

public class Move_Zeroes_to_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 0, 2, 0, 4, 0, 5};
		 int j=0;
		 for(int i =0;i<=arr.length-1;i++) {
			 
			 if(arr[i]!=0) {
				 arr[j] = arr[i];
			     j++;
		 }
		 } 
		 while(j<arr.length) {
			 arr[j] = 0;
			 j++;
		 }
		 
		 for(int num : arr) {

	            System.out.print(num + " ");
	        }
		 

	}

}
