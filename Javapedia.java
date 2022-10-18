import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        
        int figures = scan.nextInt(); 
        scan.nextLine();

        String[][] database = new String[figures][3];

        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure " + (i+1));

            System.out.print("\t- Name: ");
            database[i][0] = scan.nextLine();

            System.out.print("\t- Date of birth: ");
            database[i][1] = scan.nextLine();

            System.out.print("\t- Occupation: ");
            database[i][2] = scan.nextLine();

            System.out.print("\n");
        }
 
        System.out.println("These are the values you stored:"); 
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");  
        
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */

     public static void print2DArray(String[][] database) {
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < database[i].length; j++) {
                System.out.print("\t" + database[i][j] + " ");
            }
            System.out.println("\n");
        }
        
     }

}
