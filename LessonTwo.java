import java.util.Scanner;

public class LessonOne{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter for rows: ");
            int rows = input.nextInt();

            System.out.print("Enter for columns: ");
            int columns = input.nextInt();

            System.out.print("Enter for symbol: ");
            char symbol = input.next().charAt(0);

                for(int index = 0; index < rows; index++){
                    for(int count = 0; count < columns; count++){

                System.out.print(symbol);
            }
             System.out.println();
            }
    }
}
