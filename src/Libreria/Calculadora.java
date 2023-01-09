package Libreria;

public class Calculadora {

    int v1 = 0;
    int v2 = 0;

    int resultado = 0;

    public Calculadora(int valor1, int valor2){
        this.v1 = valor1;
        this.v2 = valor2;
    }

    public void suma (){
        resultado = v1 + v2;
        System.out.println("La suma es " +resultado);

    }

    public void resta (){
        resultado = v1 - v2;
        System.out.println("La resta es " +resultado);
    }

    public void multiplicacion (){
        resultado = v1 * v2;
        System.out.println("La multiplicacion es " +resultado);
    }

    public void division (){
        resultado = v1 / v2;
        System.out.println("La division es " +resultado);
    }

    public void Imprimir(){
        suma();
        resta();
        multiplicacion();
        division();
    }

}






