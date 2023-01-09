package AA__ARRAYS_DE_CLASE;

public class BinarySearch {
    public static void main(String[] args) {


        String[] alumnos = {"Marta", "Elena", "Sara", "Lamyae"};
        int posicion = java.util.Arrays.binarySearch(alumnos, "Marta");


        if (posicion < 0) {
            System.out.println("No esta en la lista");
        }

        else {
            System.out.println("el alumno" +alumnos[posicion]+ "esta en la posicion" + posicion);
        }
    }
}
