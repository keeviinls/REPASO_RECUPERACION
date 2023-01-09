package TutorialesBasicos;

public class Tutorial15 {
    public static void main(String[] args) {

        // 1,2,3,4,5,6,7,8,9,10

        int i = 0;

        System.out.println("Serie con for:");

        for (i=1;i<=10;i++){
            if (i < 10){
                System.out.print(i + ", ");
            }
            else {
                System.out.print(i);
            }

        }
        i = 1;
        System.out.println("");

        System.out.println("Serie con while ");
        while (i <= 10){

            if (i < 10){
                System.out.print(i + ", ");
            }
            else {
                System.out.print(i);
            }
            i++;

        }

        i = 1;

        System.out.println("");

        System.out.println("Serie con do while ");

        do {
            if (i < 10){
                System.out.print(i + ", ");
            }
            else {
                System.out.print(i);
            }
            i++;

        }
        while (i<=10);
    }
}
