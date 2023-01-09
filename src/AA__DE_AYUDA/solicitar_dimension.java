package AA__DE_AYUDA;

import java.util.Scanner;

public class solicitar_dimension {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dimension=0;
        do {


            System.out.println("Dime la dimension, tiene que ser mayor a 0 y menor o igual 10");
            dimension=sc.nextInt();
            if (dimension <=0 || dimension > 10){
                System.out.println("Error, numero indicado elevado");
            }
            else {
                System.out.println("Ok, entonces tu numero es "+dimension);
            }
        }while (dimension <=0 || dimension > 10);

        //return dimension;
    }

}
