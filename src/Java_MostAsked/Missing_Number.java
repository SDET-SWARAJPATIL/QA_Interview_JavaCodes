package Java_MostAsked;

public class Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 5};

        int n = 5;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for(int num : arr) {

            actualSum = actualSum + num;
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Number is: " + missing);
	}

}
