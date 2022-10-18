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
        System.out.println("\n");
        System.out.println("\t********************************************");
        print2DArray(database);
        System.out.println("\t********************************************");

        System.out.print("\nWho do you want information on? ");  

        String name = scan.nextLine();
        System.out.println("\n");
        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equalsIgnoreCase(name)){
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
                break;
            } else {
                System.out.println("Sorry not available");
                break;
            }
        } 

        scan.close();
    }

     public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("\t" + array[i][j] + " ");
            }
            System.out.println("\n");
        }
        
     }

}
