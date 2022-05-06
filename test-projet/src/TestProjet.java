import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.css.CSSImportRule;

public class TestProjet {
	private static ArrayList<Character> characters = new ArrayList<Character>();
	private static void addCharacter(Character c) {
		characters.add(c);
	}
	private static void printCharacters() {
		for(int i = 0; i < characters.size(); i++) {
			System.out.prinln(
			         characters.get(i).name
			         +" is "
		             +String.valueOf(characters.get(i).age)
			         +"years old"
			);
	     }
	}
	private static Scanner inputReader;

	public static void main(String[] args) {
		
		Scanner inputReader = new Scanner(System.in);

		String name  ="";		
		while (name.isBlank() ) {
		 
			System.out.println(" quel est votre nom  ");
			name = inputReader.nextLine();
			
		
		}
	
		System.out.print("Hello " + name);
		 

	}

}
