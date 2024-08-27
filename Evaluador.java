package C14270824;

import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las tres notas");


        System.out.println("nota 1");
        Integer nota1 = sc.nextInt();
        sc.nextLine();
        System.out.println("nota 2");
        Integer nota2 = sc.nextInt();
        sc.nextLine();
        System.out.println("nota 3");
        Integer nota3 = sc.nextInt();



            if ((nota1 < 0 && nota1 > 10) && (nota2 < 0 && nota2 > 10) && (nota3 < 0 && nota3 > 10)) {
                System.out.println("Nota incorrecta");
            } else if (((nota1 + nota2 + nota3) / 3) <= 3 ) {
                System.out.println("No aprovado");
            }
            else if (((nota1 + nota2 + nota3) / 3) > 3 && ((nota1 + nota2 + nota3) / 3) <=5) {
                System.out.println("Insuficiente");
                
            } else if (((nota1 + nota2 + nota3) / 3) > 5 && ((nota1 + nota2 + nota3) / 3) <=8) {
                System.out.println("Aceptable");
                
            } else if (((nota1 + nota2 + nota3) / 3) > 8 && ((nota1 + nota2 + nota3) / 3) <=10) {
                System.out.println("Aprovado");

            }
            else {
                System.out.println("La nota ingresada es la incorrecta");
            }

    }
}
