package Z_practica_dificil;

import java.util.Scanner;

enum meses{
    ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE
}
public class Ejercicio2 {

    public static void main(String[] args) {

        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        float[] temperaturas_madrid = new float[12];

        do {
            System.out.println("0.- Salir");
            System.out.println("1.- Inicializar un array que recoja la temperatura media de cada mes del año");
            System.out.println("2.- Mostrar el mes(enumerado) con mayor temperatura");
            System.out.println("3.- Mostrar el mes(enumerado) con menor temperatura");
            System.out.println("4.- Imrpimir la temperatura del mes introducido(de 1 a 12) por teclado");
            System.out.println("5.- Sacar temperatura media de los meses de verano");
            System.out.println("6.- Sacar temperatura media de los meses de invierno");
            System.out.println("7.- Comparar si temperatura de dos meses(enumerados) introducidos son iguales");

            opcion = sc.nextInt();

            switch (opcion) {
                case 0 : System.out.println("Gracias por utilizar el programa. ¡Hasta pronto!");
                         break;
                case 1:
                        temperaturas_madrid = inicializar_array(temperaturas_madrid);
                        break;
                case 2:
                        meses_mio mes_mayor = mayor_temperatura(temperaturas_madrid);
                        System.out.println("El mes con mayor temperatura es " + mes_mayor.toString());
                        break;
                case 3: meses_mio mes_menor = menor_temperatura(temperaturas_madrid);
                        System.out.println("El mes con mayor temperatura es " + mes_menor.toString());
                        break;
                case 4:  System.out.println("Introduzca el numero del mes del que quiere saber temperatura");
                         int mes = sc.nextInt();
                         float temperatura = sacar_temperatura(mes,temperaturas_madrid);
                         System.out.println("La temperatura del mes de "+mes+" es "+temperatura);
                         break;
                case 5:
                        float media_verano = sacar_media_verano(temperaturas_madrid);
                        System.out.println("La temperatura media del verano es "+media_verano);
                        break;

                case 6:
                    float media_invierno = sacar_media_invierno(temperaturas_madrid);
                    System.out.println("La temperatura media del verano es "+media_invierno);
                    break;
                case 7:
                       boolean es=false;
                       meses_mio valor1,valor2;
                       String cadena="";
                       System.out.println("Introduzca el primer mes a comparar");
                        cadena=sc.next();
                       valor1=  meses_mio.valueOf(cadena.toUpperCase());
                       System.out.println("Introduzca el segundo mes a comparar");
                        cadena=sc.next();
                       valor2=  meses_mio.valueOf(cadena.toUpperCase());
                       es = comparar(valor1,valor2,temperaturas_madrid);
                       if (es){
                           System.out.println("son iguales");
                       }else{
                           System.out.println("no son iguales");
                       }

                default:
                       System.out.println("Ha introducido un valor incorrecto");
            }
        } while (opcion != 0);
    }

    private static boolean comparar(meses_mio valor1, meses_mio valor2, float[] temperaturas_madrid) {
        boolean resultado=false;
        int i = sacar_mes_numero(valor1);
        int j = sacar_mes_numero(valor2);
        if (i==1 || i==12){i--;}
        if (j==1 || j==12){j--;}
         if (temperaturas_madrid[i]== temperaturas_madrid[j])
         {
            resultado=true;
         }

        return resultado;
    }

    private static int sacar_mes_numero(meses_mio valor1) {
        int numero=0;
        switch (valor1)
        {
            case ENERO -> numero=1;
            case FEBRERO ->numero=2;
            case MARZO -> numero=3;
            case ABRIL -> numero=4;
            case MAYO -> numero=5;
            case JUNIO -> numero=6;
            case JULIO -> numero=7;
            case AGOSTO -> numero=8;
            case SEPTIEMBRE -> numero=9;
            case OCTUBRE -> numero=10;
            case NOVIEMBRE -> numero=11;
            case DICIEMBRE -> numero=12;

        }

        return numero;
    }

    private static float sacar_media_invierno(float[] temperaturas_madrid) {
        float media=0;
        media = (temperaturas_madrid[11]+temperaturas_madrid[0]+temperaturas_madrid[1]+temperaturas_madrid[2])/4;
        return media;
    }

    private static float sacar_media_verano(float[] temperaturas_madrid) {
        float media=0;
        media = (temperaturas_madrid[5]+temperaturas_madrid[6]+temperaturas_madrid[7])/3;
        return media;
    }

    private static float sacar_temperatura(int mes,float[] temperaturas) {

        float temperatura;
        if (mes ==1 ||mes==12) {
            temperatura = temperaturas[mes-1];
        }

        else{
            temperatura = temperaturas[mes];

        }

        return temperatura;
    }

    public static meses_mio mayor_temperatura(float[] temperaturas){
        meses_mio mayor= meses_mio.valueOf("No existe");
        float aux=0;
        int indice=0;
        for (int i=0;i<temperaturas.length;i++) {

            if (temperaturas[i]>=aux)
            {
                aux=temperaturas[i];
                indice=i;
            }

        }
        mayor= sacar_mes_enumerado(indice);
        return mayor;

    }

    private static meses_mio sacar_mes_enumerado(int indice) {
        meses_mio mes= meses_mio.valueOf("No existe");
        switch (indice)
        {
            case 0: mes = meses_mio.ENERO;break;
            case 1: mes = meses_mio.FEBRERO;break;
            case 2: mes = meses_mio.MARZO;break;
            case 3: mes = meses_mio.ABRIL;break;
            case 4:mes = meses_mio.MAYO;break;
            case 5:mes = meses_mio.JUNIO;break;
            case 6:mes = meses_mio.JULIO;break;
            case 7:mes = meses_mio.AGOSTO;break;
            case 8:mes = meses_mio.SEPTIEMBRE;break;
            case 9:mes = meses_mio.OCTUBRE;break;
            case 10:mes = meses_mio.NOVIEMBRE;break;
            case 11:mes = meses_mio.DICIEMBRE;break;
        }
        return mes;
    }

    public static meses_mio menor_temperatura(float[] temperaturas){
        meses_mio menor= meses_mio.valueOf("No existe");
        float aux=0;
        int indice=0;
        for (int i=0;i<temperaturas.length;i++) {

            if (temperaturas[i]<=aux)
            {
                aux=temperaturas[i];
                indice=i;
            }

        }

        menor= sacar_mes_enumerado(indice);
        return menor;


    }
    public static float[] inicializar_array(float [] temperaturas){
          float [] array_inicializado = new float[12];
          for (int i=0;i<temperaturas.length;i++)
          {
              Scanner sc = new Scanner(System.in);
              float temperatura;
              switch (i){

                  case 0: System.out.println("Introduzca temperatura de "+ meses_mio.ENERO);
                      array_inicializado[i]=sc.nextFloat();
                          break;
                  case 1: System.out.println("Introduzca temperatura de "+ meses_mio.FEBRERO);
                      array_inicializado[i]=sc.nextFloat();
                      break;
                  case 2: System.out.println("Introduzca temperatura de "+ meses_mio.MARZO);
                      array_inicializado[i]=sc.nextFloat();
                      break;
                  case 3: System.out.println("Introduzca temperatura de "+ meses_mio.ABRIL);
                      array_inicializado[i]=sc.nextFloat();
                      break;
                  case 4: System.out.println("Introduzca temperatura de "+ meses_mio.MAYO);
                      array_inicializado[i]=sc.nextFloat();
                      break;
                  case 5: System.out.println("Introduzca temperatura de "+ meses_mio.JUNIO);
                      array_inicializado[i]=sc.nextFloat();
                      break;
                  case 6: System.out.println("Introduzca temperatura de "+ meses_mio.JULIO);
                      array_inicializado[i]=sc.nextFloat();
                      break;
                  case 7: System.out.println("Introduzca temperatura de "+ meses_mio.AGOSTO);
                      array_inicializado[i]=sc.nextFloat();
                      break;
                  case 8: System.out.println("Introduzca temperatura de "+ meses_mio.SEPTIEMBRE);
                      array_inicializado[i]=sc.nextFloat();
                      break;
                  case 9: System.out.println("Introduzca temperatura de "+ meses_mio.OCTUBRE);
                      array_inicializado[i]=sc.nextFloat();
                      break;
                  case 10: System.out.println("Introduzca temperatura de "+ meses_mio.NOVIEMBRE);
                      array_inicializado[i]=sc.nextFloat();
                      break;
                  case 11: System.out.println("Introduzca temperatura de "+ meses_mio.DICIEMBRE);
                      array_inicializado[i]=sc.nextFloat();
                      break;


              }

          }
          return array_inicializado;
    }




}
