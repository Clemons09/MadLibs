import java.util.Scanner;

public class HiLoMadLibs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String color = "";
		String pastTenseVerb = "";
		String adjective = "";
		String noun = "";
		
		
			System.out.println("Enter a color: ");
				color = scan.nextLine();
			System.out.println("Enter a verb(past tense): ");
				pastTenseVerb = scan.nextLine();
			System.out.println("Enter an adjective: ");
				adjective = scan.nextLine();
			System.out.println("Enter a noun: ");
				noun = scan.nextLine();
				
				System.out.print("The " + color + " dragon " + pastTenseVerb + " at the " + adjective);
				System.out.println(" knight, who rode in on a sturdy, giant " + noun + ".");
			}
			
		}
		

	


