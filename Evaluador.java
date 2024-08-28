package C14270824;

import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer nota1;
        Integer nota2;
        Integer nota3;
        String resultado;


            System.out.println("Ingrese las tres notas");

            do{
                System.out.println("nota 1");
                nota1 = sc.nextInt();
                if (nota1 < 0 || nota1 > 10){
                    System.out.println("Nota inválida. Ingrese una nota entre 0 y 10.");

                }
            }while(nota1 < 0 || nota1 > 10);

        do {
            System.out.println("nota 2");
            nota2 = sc.nextInt();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota2 < 0 || nota2 > 10);

        do {
            System.out.println("nota 3");
            nota3 = sc.nextInt();
            if (nota3 < 0 || nota3 > 10) {
                System.out.println("Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota3 < 0 || nota3 > 10);


            if (((nota1 + nota2 + nota3) / 3) > 0 && ((nota1 + nota2 + nota3) / 3) <= 3)  {
                resultado ="No aprovado";
            } else if (((nota1 + nota2 + nota3) / 3) > 3 && ((nota1 + nota2 + nota3) / 3) <= 5) {
                resultado = "Insuficiente";

            } else if (((nota1 + nota2 + nota3) / 3) > 5 && ((nota1 + nota2 + nota3) / 3) <= 8) {
                resultado = "Aceptable";

            } else {
                resultado = "Aprovado";

            }
            System.out.println(resultado);
    }
}
