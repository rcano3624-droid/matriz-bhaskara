import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Trabalhar com Matriz 2x2");
            System.out.println("2 - Calcular Equação do 2º Grau");
            System.out.println("0 - Encerrar");
            System.out.print("Digite sua escolha: ");

            escolha = sc.nextInt();

            if (escolha == 1) {
                lerMatriz(sc);
            } else if (escolha == 2) {
                calcularBhaskara(sc);
            } else if (escolha == 0) {
                System.out.println("Programa finalizado.");
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }

        } while (escolha != 0);

        sc.close();
    }

    public static void lerMatriz(Scanner sc) {
        int[][] dados = new int[2][2];

        System.out.println("\nInforme os números da matriz:");

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print("Valor posição [" + linha + "," + coluna + "]: ");
                dados[linha][coluna] = sc.nextInt();
            }
        }

        System.out.println("\nResultado da matriz:");
        for (int[] linha : dados) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void calcularBhaskara(Scanner sc) {
        double A, B, C;

        System.out.print("\nCoeficiente A: ");
        A = sc.nextDouble();

        System.out.print("Coeficiente B: ");
        B = sc.nextDouble();

        System.out.print("Coeficiente C: ");
        C = sc.nextDouble();

        double discriminante = (B * B) - (4 * A * C);

        if (discriminante < 0) {
            System.out.println("Não há soluções reais.");
        } else {
            double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);

            System.out.println("Discriminante: " + discriminante);
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
    }
}
