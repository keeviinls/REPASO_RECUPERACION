package tutorialINTERMEDIO;

public class Video7Rectangulo {

    private int base;
    private int altura;
    private int area;
    public Video7Rectangulo (int base, int altura){

        this.base=base;
        this.altura=altura;

    }

    public void Calculoarea(){
        area=base*altura;
    }
    public void Imprimir(){
        Calculoarea();
        System.out.println("El area es :  "+area);
    }


}
