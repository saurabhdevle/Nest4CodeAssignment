package Assignment;

public class Assignment1 {

	public static void main(String[] args) {
		
		float p1 = 20;
		float p2 =30;
		float p3 = 40;
		float tax = 18;
		float ProductPrice = p1+p2+p3;
		float TaxAmount=(tax/100)*ProductPrice;
		System.out.println("Final bill Amount:"+ TaxAmount);
		

	}

}
