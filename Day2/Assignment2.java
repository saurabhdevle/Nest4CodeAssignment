package Assignment;

public class Assignment2 {

	
	
	public static void main(String[] args) {

		heightConvertor();
		WeightConvertor();

	}
	
	public static void heightConvertor() {
		
		// height in inch
		int inHeight = 0;
		// height in feet
		int ftHeight=5;
		
		// convert height into cm
		double cmHeight = inHeight*2.54;
		double cmHeight1 = ftHeight*12*2.54;
		
		double Height = cmHeight+ cmHeight1;
		
		System.out.println("Total Height in cm. is :" + Height+ "cm");
		
	}
	
	public static void WeightConvertor() {
	
		// weight into pound
		int lbWeight = 101;
		double kgWeight = lbWeight*2.2;
		
		System.out.println("Total weight in kg is : " + kgWeight + "kg");
	}
	
}
