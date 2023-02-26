package firstclass;

public class BasicJava {

	public static void main(String[] args) {

		System.out.println("I am learning java");
		
		int MathGrade = 100;
		int JavaGrade = 95;
		
		int TotalGrade = MathGrade+JavaGrade;
		
		
		long Credit_Card1 = 4535545475755L;
		long Credit_card2 = 45355454275755L;
		double bankRate = 8.09;
		float pie = 0.167987798987987987f;
		boolean isDone = false;
		char Answer = 'N'; 
		
		System.out.println("My total Grade: "+TotalGrade);
		
		
		if (MathGrade>JavaGrade) {
			System.out.println("You are good in Math! Need to work on Java!");
		}
		
		if (JavaGrade>MathGrade){
			System.out.println("You are good in Java, but Need to work in MAth!");
		}
	}

}



