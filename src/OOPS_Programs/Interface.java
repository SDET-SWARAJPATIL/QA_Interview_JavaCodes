package OOPS_Programs;


interface RBI{
	void RateOfInterest() ;
		//abstract method
	
}

class HDFC implements RBI{
	
	@Override
	public void RateOfInterest() {
		System.out.println("rate of interest is 7%");
	}
}

class Axis implements RBI{
	@Override
	public void RateOfInterest() {
		System.out.println("rate of interest is 8%");

	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h = new HDFC ();
		h.RateOfInterest();
		
		Axis a = new Axis();
		a.RateOfInterest();

	}

}
