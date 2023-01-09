package Practicaprogramacion;

import java.util.Scanner;

public class Areacirculo {
    public static void main(String[] args) {

      int seguir = 1;
      int numero = 0;
      Scanner in = new Scanner(System.in);

      while (seguir == 1){
          System.out.println("Pon numero entero");
          numero = in.nextInt();
          System.out.println("Escribiste " + numero);
          System.out.println("Repetir?");
          System.out.println("");
          System.out.println("Teclea 1 para repetir");
          System.out.println("Teclea 2 para salir");
          seguir = in.nextInt();
      }
}
}
