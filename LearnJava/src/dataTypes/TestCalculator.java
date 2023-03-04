package dataTypes;

public class TestCalculator {

	public static void main(String[] args) {
		// created an object of calculator calss
		calculator calc = new calculator();

		System.out.println("addition of a and b is:" +calc.doAdd(67, 12));
		
		System.out.println("value of a - b is : " +calc.doSub(83, 12));
		
	}

}
