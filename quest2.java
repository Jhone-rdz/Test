import java.util.Scanner;

public class ContaDeA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para verificar a ocorrência da letra 'a': ");
        String input = scanner.nextLine();

        int contador = OcorrenciasDeA(input);
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    public static int OcorrenciasDeA(String s) {
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
