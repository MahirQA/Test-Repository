package dataTypes;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/* Switch Statement Syntax: 
		 * 
		 * Switch (expression)
		 * case value1:
		 * //code to be executed
		 * break;
		 * case value2:
		 * // code to be executed 
		 * break;
		 * case value3:
		 * //code to be executed
		 * break
		 * 
		 * default
		 *  // code to be executed
		 *  }
		 */
		
		int dayNumber = 17;
		
		switch (dayNumber) {
		case 1: {
		System.out.println("It is Monday Today!");
		}
		break;
		case 2: {
			System.out.println("It is Tuesday Today!");
		}
		break;
		case 3: {
			System.out.println("It is Wednesday Today!");
		}
		break;
		case 4: {
			System.out.println("It is Thursday Today!");
			}
		break;
		case 5: {
			System.out.println("It is Friday Today!");
			}
		break;
		case 6: {
			System.out.println("It is Saturday Today!");
		}
		break;
		case 7: {
			System.out.println("It is Sunday Today!");
		}
		break;
		
		default:
			System.out.println("sorry it is not a day!!! ");
		
		}

	}

}
