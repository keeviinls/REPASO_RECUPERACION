package tutorialINTERMEDIO;
import java.util.Scanner;
public class Video6SUMAMAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer valor: ");
        int valoruno=sc.nextInt();

        System.out.println("Dame el segundo valor: ");
        int valordos=sc.nextInt();


        //AQUI LO QUE HACEMOS ESO ENVIAR LOS VALORES A LA OTRA CLASE
        //VEMOS QUE HEMOS CREADO UN ATRIBUTO LLAMADO VALORES
        //DENTRO DE EL METEMOS LOS VALORES CREADOS, OSEA VALORUNO Y VALORDOS
        Video6SUMA valores = new Video6SUMA(valoruno, valordos);


        //AQUI MANDAREMOS A IMPRIMIR EL REUSLTADO
        // LLAMAMOS AL METODO QUE IMPRIME EL RESULTADO, RECORDMEOS QUE ES "IMPRIMIR"
        //PARA ELLO ATRAVES DLE OBJETO QUE SE COMUNICA O HACE DE MENSAJERO ENTRE LAS 2 CLASES,
        //LO LLAMAMOS Y ASI USAMOS EL METODO
        //PONEMOS EL NOMBRE DEL OBJETO QUE ESTAMOS USANDO, EN ESTE CASO ES "VALORES", SEGUIDO DE UN PUNTO
        //ESCRIBIMOS EL NOMBRE DLE METODO QUE QUEREMOS LLAMAR
        valores.Imprimir();
    }
}
