package TutorialesBasicos;

public class Tutorial22 {
    public static void main(String[] args) {

        int numeros [][] = new int[3][4];
        int contador = 1;

        for (int j=0; j < numeros.length; j++){

            for (int i = 0; i<numeros[j].length; i++){

                numeros [j][i] = contador;
                contador++;

                System.out.print("[" + numeros [j][i] + "]");
            }
            System.out.println("");
        }
    }
}
