package Java_MostAsked;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 7;
		int temp =0;
		for(int i =2;i<=n-1;i++) {
			if(n%i==0) {
				temp ++;
			}
		}
		
		if(temp != 0) {
			System.out.println("not prime number");
		}else {
			System.out.println("prime number");

		}
	}

}
