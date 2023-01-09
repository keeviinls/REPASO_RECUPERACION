package AA__DE_AYUDA;

public class METODOS_DE_STRING {
    public static void main(String[] args) {
        System.out.println("Uso de metodos string");
        String nombre="Kevin";
        String nombre2="Zoro";
        String nombre3="kevin";
        String nombre4="Gokue";
        String nombre5="      Kevin     ";

        System.out.println("una posicion   "+nombre.charAt(0));
        System.out.println("Comparar dos strings    "+nombre.compareTo(nombre2));
        System.out.println("Comparar ignorando las mayusculas   "+nombre.compareToIgnoreCase(nombre3));
        System.out.println("concatenear    "+nombre.concat(nombre2));
        System.out.println("si contiene otra    "+nombre.contains(nombre4));
        System.out.println("si termina en +oro  "+nombre2.endsWith("oro"));
        System.out.println("Si son iguales    "+nombre.equals(nombre3));
        System.out.println("donde esta la +e    "+nombre.indexOf('e'));
        System.out.println("donde esta la +e desde ciet aposicion   "+nombre4.indexOf('e',1));
        System.out.println("si un string es vacio    "+nombre.isEmpty());
        System.out.println("eliminar espacios en blanco    "+nombre5.trim());
        System.out.println("devolver un array de char     "+nombre.toCharArray());
        System.out.println("Remplazo la i por la e    "+nombre.replace('i','e'));
    }
}
