package Java_MostAsked;

import java.util.Arrays;

public class Find_Second_Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,2,1,5,6,8};
		int k =2;
		for(int i =0;i<=a.length-1;i++) {
			for(int j = i+1;j<=a.length-1;j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j]=temp;
				}
			}
			if(i == k-1) {
				System.out.println(a[i]);

			}
		}
		
		System.out.println(Arrays.toString(a));
		
		

	}

}
