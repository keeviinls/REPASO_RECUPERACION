package AA__DE_AYUDA;

public class mayor_unidimensional {
    public static void main(String[] args) {
        int[] valores = {10, 100, 5, 1, 7, 30, 50};

        int mayor = valores[0];

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > mayor) {
                mayor = valores[i];
            }
        }

        System.out.println("El número mayor es el " + mayor);
        ////ESTO DE AQUI ES PARA BUSCAR LA POSICION DEL MAYOR/////

        int posicion = -1;
        for (int i=0;i<valores.length;i++){
            if (valores[i]==mayor){
                posicion=i;
            }
        }
        if (posicion==-1){
            System.out.println("No se encontro el numero");
        }
        else {
            System.out.println("El numero mayor es "+mayor+" esta en la posicion "+posicion);
        }
    }
}
