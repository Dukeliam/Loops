import java.util.Scanner;

public class InfinityGame{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
            String response = "";

            while(!response.equals("W")){
                System.out.println("You are playing a Game");
                System.out.print("Guess the letter: ");
                response = input.nextLine().toUpperCase();
        }

                System.out.println("Took you long Enough");
    }
}
