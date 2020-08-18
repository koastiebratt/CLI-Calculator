import java.util.Scanner;

public class commandLineCalculator {

	public static void main(String[] args) {
		
			//Created Variables
			char menu_Option;
			int stored_value_1;
			int stored_value_2;
			int results;
			char Continue = 'y';
			
			Scanner input = new Scanner(System.in);
		
		do {
			
			
			//Main Menu
			System.out.print("Welcome to the CLI calculator");
			System.out.print("\n" + "\n");
			System.out.println("Operations:");
			System.out.println("a: Addition");
			System.out.println("s: Subtraction");
			System.out.println("m: Multiplication");
			System.out.println("d: Division");
			System.out.println("e: Exit");
			System.out.println("\n");
			
			System.out.print("Choose your operation: ");
			
			menu_Option = input.next().toLowerCase().charAt(0);
			
			System.out.print("\n");
			
			 if(menu_Option != 'a' && menu_Option != 's' && menu_Option != 'm' && menu_Option != 'd' &&  menu_Option != 'e'){
				
				System.out.print("That is an invalid response. Please try again. Thank you \n\n");
				
			}else if( menu_Option == 'e') {
				
				System.out.println("\n\n****Goodbye*****");
				
				input.close();
				
				Continue = 'n';
				
			}else{
				
				//Only runs if menu_option = 1,2,3 or 4
				System.out.print("First Number: ");
				stored_value_1 = input.nextInt();
				//System.out.print("\n");
				
				System.out.print("Second Number: ");
				stored_value_2 = input.nextInt();
				
				
				//Case Statements for menu options
				switch(menu_Option) {
				
					case 'a':
						results = stored_value_1 + stored_value_2;
						System.out.print("\n");
						System.out.println("Result: " + results);
						System.out.println();
						break;
					
					case 's':
						results = stored_value_1 - stored_value_2;
						System.out.print("\n");
						System.out.println("Result: " + results);
						System.out.println();
						break;
						
					case 'm':
						results = stored_value_1 * stored_value_2;
						System.out.print("\n");
						System.out.println("Result: " + results);
						System.out.println();
						break;
					
					case 'd':
						//Have to convert for decimals in division
						float division_Results;
						float new_value_1;
						float new_value_2;
						
						new_value_1 = (float) stored_value_1;
						new_value_2 = (float) stored_value_2;
						
						if(new_value_2 == 0.0) {
							
							System.out.print("\n");
							System.out.println("~*Wait, that's illegal.*~ Can not divide by zero. Please try again.");
							
						} else {
							
							division_Results = new_value_1 / new_value_2;
							
							System.out.print("\n");

							System.out.printf("Result: " + division_Results);
							System.out.println("Result: " + division_Results);
							System.out.println();

							
						}
						
						break;

					default:
						
						System.out.print("\n");
						System.out.println("Error, Please try again.");
						break;				
				}
			}
			
		}while(Continue == 'y' || Continue == 'Y');
		
	}
}

