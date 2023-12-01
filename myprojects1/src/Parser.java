/**
 * This class provides a scanner for the user to interact
 * with a series of applications.
 * @author stephsal
 */
import java.util.Scanner;


public class Parser {
		
	private static final String[] validCommands = {"QUIT", "HELP"};
	
	Scanner reader;
	String inputString;
	int inputInt;
	boolean continuing;
	
    
	public Parser(){
		reader = new Scanner(System.in);
		continuing= reader.hasNextLine();
    }
	
	
	
	public String getStringInput() {
		inputString = reader.nextLine();
		return inputString;
	}
	
	public int getIntInput() {
		inputInt= reader.nextInt();
		return inputInt;
	}
	public boolean isValidCommand(String value){
	    
	    for (int i =0; i< validCommands.length; i++){
	        if(validCommands[i].equals(value))
		        return true;
	    }
	    
	    return false;
    }
	public void end() {
		reader.close();
	}

	public void resetParser() {
		reader.reset();
	}
	
	public void showCommands(){
	    for (String cmd : validCommands)
	        System.out.print(cmd+" ");
	    System.out.println();
	}
	
	
	
	 public void printHelp(){
		    System.out.println("");
		    System.out.println("All the valid commands: ");
		    showCommands();
	    }
}
