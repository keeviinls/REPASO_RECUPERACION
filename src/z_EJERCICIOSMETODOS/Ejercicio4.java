package z_EJERCICIOSMETODOS;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        System.out.println("Bienvenido a la calculadoa de áreas");
        System.out.println("Área de circulo");
        System.out.println("Área de triangulo");
        System.out.println("Área de cuadrado");
        System.out.println("Selecciona una opcion");
        Scanner sc= new Scanner(System.in);
        String figura = sc.next().toUpperCase();
        double area;

        //USAMOS SWITCH PQ ESAMOS USANDO STRING, SI SAMOS NUMEROS MEJOR PONER "IF"
        switch (figura){

            case "CIRCULO":
                System.out.println("Introduzca el radio");
                double radio = sc.nextDouble();
                area = area_circulo(radio);
                imprimir(area,figura);
                break;

//--------------------------------------------------------------------------------------

            case "TRIANGULO":
                System.out.println("Introduzca la base");
                double base = sc.nextDouble();
                System.out.println("Introduzca la altura");
                double altura = sc.nextDouble();
                area = area_triangulo(base,altura);
                imprimir(area,figura);
                break;

//--------------------------------------------------------------------------------------

            case "CUADRADO":
                System.out.println("Introduzca el lado");
                double lado = sc.nextDouble();
                area = area_lado(lado); //esto es la llamada
                imprimir(area,figura);
                break;
                }
        }

    //--------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------


    private  static double area_lado(double lado){
        double resultado;
        resultado=lado*lado;
        return resultado;
        }

        private static double area_triangulo(double base, double altura){
        double resultado;
        resultado=base*altura/2;
        return resultado;
        }

        private static double area_circulo(double radio){
            double resultado;

            resultado=Math.pow(radio,2)*Math.PI;
            return resultado;
        }

        private static void imprimir(double area, String figura){
            System.out.println("El area de" +figura+ " es "+area);
        }

    }

