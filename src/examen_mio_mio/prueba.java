package examen_mio_mio;

public class prueba {
    public static void main(String[] args) {
        double[] buscar_maximo={100.2,2.3};
        imprimir_resultado(buscar_maximo);
    }
    private static void imprimir_resultado(double[]buscar_maximo){
        double contador;
        double contador2;

        for (int i=0;i<buscar_maximo.length-1;i++){

            System.out.print("El maximo es "+buscar_maximo[i]);
        }

        for (int i=1;i<buscar_maximo.length;i++){
            System.out.println("y se encuentra en la posicion "+buscar_maximo[i]);

        }



    }

}
