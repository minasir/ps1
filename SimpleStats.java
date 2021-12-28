/*  
/*
 * Problem Set 1
 * 
 * A simple interactive program that performs operations 
 * on a set of three integers.
 *
 * CS112
 *
 */
import java.util.*;

/*
 * Program Class Defintion
 */
public class SimpleStats {

    /*
     * printMenu()
     *
     * Method to display user options.
     */
    public static void printMenu() {
        System.out.println("(0) Enter new numbers");
        System.out.println("(1) Find the largest");
        System.out.println("(2) Compute the sum");
        System.out.println("(3) Compute the range (largest - smallest)");
        System.out.println("(4) Compute the average");
        System.out.println("(5) Print the numbers in ascending order");
        System.out.println("(6) Quit");
        System.out.println();
    }
    
    /*** PUT YOUR SEPARATE METHODS FOR OPTIONS 1-5 HERE ***/
    // 1 - method for largest 
    public static int largest(int n1, int n2, int n3){
        if (n1 >= n2 && n1 >= n3) { 
            // condition checks if first number is greater than other two 
            return n1;
        }
        if(n2 >= n1 && n2 >= n3){
            return n2; 
        }
        return n3;
    }
    // 2 - method for sum
    public static int sum(int n1, int n2, int n3){
        int x = n1 + n2 + n3;
        return x;
    }
    // helper for smallest number
    public static int smallest(int n1, int n2, int n3){
        if (n1 <= n2 && n1 <= n3) { 
            return n1;
        }
        if(n2 <= n1 && n2 <= n3){
            return n2; 
        }
        return n3;
    }
    // 3 - range 
    public static int range(int n1, int n2, int n3){
        int subtract = (largest(n1, n2, n3))-(smallest(n1, n2, n3));
        return subtract;
         }

    // 4 - average 
    public static double average(int n1, int n2, int n3){
        int x = n1 + n2 + n3;
        double avg = x/3.0;
        return avg; 
    }

    // 5 - ascending order 
    public static void ascending(int n1, int n2, int n3){
        if(n1 > n2){
            int temp = n2; // temp has the smaller number of the two
            n2 = n1; // larger number of the two is stored in n2
            n1 = temp; // now smallest num is stored in n1;
        }
        if(n1 > n3){
            int temp1 = n3;
            n3 = n1;
            n1 = temp1;

        }
        if(n2 > n3){
            int temp2 = n3;
            n2 = n3;
            n2 = temp2; 
        }
        System.out.println(n1+" "+n2+" "+n3);
    }
    
    /*
     * main()
     *
     * Program execution begins with this method.
     */
    public static void main(String[] args) {
        // Create an instance of a scanner object and
	// connect to the standard input device
        Scanner scan = new Scanner(System.in); // scanner object 

        // variable declarations and initializations as needed
        boolean more_input = true;
        int n1=0;
        int n2=0;
        int n3=0;
        int choice=0;
        boolean flag = false; 
        
	/*
 	 * Control loop
 	 */
        do {
	    // If numbers have been entered (choice 0) has been selected, output the numbers
        if(flag == true){
            System.out.println("Numbers that have been entered are: "+n1+" "+n2+" "+n3);
        }
        // if choice is not 0 and flag is false nothing is entered then printMenu();

	    // Call the method which displays the menu choices
            printMenu();

	    // Prompt to enter the choice of operation
            System.out.print("Enter your choice: ");
            choice = scan.nextInt(); 
            
            /*
             * Expand this conditional statement to correctly process all choices.
             * Make sure to follow the guidelines in the assignment for
             * doing so.
             */
            if(choice !=0 && flag == false){
                System.out.println("Cannot compute, numbers have not been entered");
                //printMenu();
            }
            else if (choice == 0) {
                System.out.print("Enter three new numbers: ");
                
		// Input the three numbers
                // scan the three integers inputted by user
                n1 = scan.nextInt();
                n2 = scan.nextInt();
                n3 = scan.nextInt();
		
		// Verify the numbers entered by printing them out
                //System.out.print("You have entered the following numbers: "+n1+" "+ n2+" "+n3);
                flag = true; 
            } 
            else if (choice ==1){ //"(1) Find the largest");
                System.out.println("Largest number entered is: "+largest(n1, n2, n3));

            }
            else if (choice ==2){ //(2) Compute the sum");
                System.out.println("Sum is: "+sum(n1, n2, n3));
            }
            else if (choice == 3){ // 
                System.out.println("Range is: "+range(n1, n2, n3));

            }
            else if (choice == 4){ // average 
                System.out.println("Average is: "+average(n1, n2, n3));

            }
            else if (choice == 5){
                System.out.println("Ascending order is: ");
                ascending(n1, n2, n3);
            }
            else if (choice == 6) {
                more_input = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            
            System.out.println();
        } while (more_input);
        
        System.out.println("Have a nice day!");
    }
}
