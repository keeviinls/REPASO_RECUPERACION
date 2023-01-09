package TutorialesBasicos;

public class Tutorial5 {
    public static void main(String[] args) {

        int numero_uno = 4;
        int numero_dos = 4;
        int resultado = 0;

        ;

        //RESULTADO INCORRECTO
        resultado = numero_uno + numero_dos / 2;
        System.out.println("El resultado incorrecto es: " + resultado);

        //Vemos que el resultado de arriba fue 6, eso es porque el orden de prioridades
        //En programacion es PARENTESIS, POTENCIA, MULTIPLICACION, SUMA Y RESTA
        //Por eso en la de arriba coge primero la division y hace 4/2= 2 + 4 = 6


        //RESULTADO CORRECTO
        //La solucion es simplemente poner parentesis en la suma para que asi
        //lea primero el parentesis y ya luego la suma
        resultado = (numero_uno + numero_dos) / 2;
        System.out.println("El resultado correcto es: " + resultado);
    }
}
