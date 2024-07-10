
import java.util.Scanner;

public class Tipos_primitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();
        System.out.printf("Digite a nota do %s: ", nome);
        float nota = teclado.nextFloat();
        System.out.format("A nota do %s é %.2f ", nome, nota);
    }
}
/*
 * String nome = "Matheus";
 * float nota = 10.0f;
 * System.out.format("A nota do %s é %.2f ", nome, nota);
 */