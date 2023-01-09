package AA__DE_AYUDA;

public class Wrapper_en_primitivo {
    public static void main(String[] args) {
        String cadena1="1234";
        Integer variable1;
        variable1=Integer.valueOf(cadena1);
        System.out.println("Conversion de una cadena a tipo Wrapper integer "+variable1);
        String cadena2="2345";
        int variable2;
        variable2=Integer.parseInt(cadena2);
        System.out.println("Conversion de una cadena a tipo primitivo integer "+variable2);
    }
}
