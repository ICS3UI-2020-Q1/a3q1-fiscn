import java.util.Scanner; 

/**
 * a program that will find the maximum integer between three numbers that the user inputs.
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create Scanner for user input 
    Scanner input = new Scanner(System.in); 

    // prompt the user to enter three integers 
    System.out.println("Please enter three integers on separate lines."); 

    // declaring variables
    int Number1 = input.nextInt(); 
    int Number2 = input.nextInt(); 
    int Number3 = input.nextInt(); 

    // find out which integer is the greatest 
    if (Number1 >= Number2 && Number1 >= Number3){
      System.out.println("Maximum: " + Number1); 
    }else if (Number2 >= Number1 && Number2 >= Number3){
      System.out.println("Maximum: " + Number2);
    }else if (Number3 >= Number1 && Number3 >= Number2){
      System.out.println("Maximum: " + Number3);
    }


    
  }
}
