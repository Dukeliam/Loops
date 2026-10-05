public class Diamond{
    public static void main(String[] args){

        char symbol = '*';

            for(int index = 1; index <= 9; index += 2){


                    for(int space = 4; space >= (index + 1) / 2; space--){
                                System.out.print(" ");

                        }
                        for(int count = 1; count <= index; count++){

                            System.out.print(symbol);

                        }    
                                System.out.println();
                  }
         

      for(int index = 7; index >= 1; index -= 2){


                    for(int space = 4; space >= (index + 1) / 2; space--){
                                System.out.print(" ");

                        }
                        for(int count = index; count >= 1; count--){

                            System.out.print(symbol);

                        }    
                                System.out.println();
           }         
    }
}
