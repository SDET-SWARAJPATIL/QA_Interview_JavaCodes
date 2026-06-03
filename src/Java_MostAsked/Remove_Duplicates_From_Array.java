package Java_MostAsked;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_From_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,5,4,2,4,8,5,7};
		Set<Integer>s = new HashSet<Integer>();
		for(int i=0;i<=a.length-1;i++) {
			s.add(a[i]);
		}
		
		System.out.println(s);
		
		int b[] = new int[s.size()];
		int index =0;
		for(Integer v :s) {
			b[index] = v;
			index++;
		}
		
		System.out.println("New Array:");

		for(int i = 0; i <= b.length-1; i++) {

			System.out.print(b[i] + " ");
		}

	}

}
