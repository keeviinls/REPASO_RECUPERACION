package tutorialINTERMEDIO;

public class CambiarnombreMain {
    public static void main(String[] args) {
        String nombre = "Kevin";


        System.out.println(nombre);
        Cambiarnombre minombre = new Cambiarnombre(nombre);
        System.out.println("despues de pasarle el metodo TransformarNombre....");
        minombre.TransformarNombre();

    }
}
