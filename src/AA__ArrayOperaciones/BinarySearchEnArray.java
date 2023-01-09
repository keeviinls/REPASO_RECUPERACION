package AA__ArrayOperaciones;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchEnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] alumnos ={"Sofia", "Elena", "Sara", "Lamyae"};
        int posicion = 0;

        System.out.println("Dime que nombre buscas");
        String buscas ="";
        buscas = sc.next();
        posicion = Arrays.binarySearch(alumnos, buscas);  //USAMOS BINARYSEARCH PARA BUSCAR ALGO EN ESPEFICO

        if (posicion<0){
            System.out.println("No esta ese nombre");
        }

        else {
            System.out.println("Se encuentra en la posicion "+posicion);
        }
    }
}
