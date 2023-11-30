/**
 * This class provides a scanner for the user to interact
 * with a series of applications.
 * @author stephsal
 */
import java.util.Scanner;


public class Parser {
		
	Scanner reader;
	String inputString;
	int inputInt;
    
	public MyParser(){
		reader = new Scanner(System.in); 
    }
	
	public String getStringInput() {
		inputString = reader.nextLine();
		return inputString;
	}
	
	public int getIntInput() {
		inputInt= reader.nextInt();
		return inputInt;
	}
}
