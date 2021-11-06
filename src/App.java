import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, x1, y1, soma = 0;
        int[] vetor = new int[8];

        System.out.println("Digite 8 valores: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um valor de 1 a 8: ");
        x = scanner.nextInt();
        System.out.print("Digite outro valor de 1 a 8: ");
        y = scanner.nextInt();

        if (x > 8  || x < 1 || y >8 || y < 1) {
            System.out.println("Número digitado invalido");
        } else {

        x1 = x - 1;
        y1 = y - 1;
        
        soma = vetor[x1] + vetor[y1];
        System.out.println("A soma dos valores na posição " + x + " e na posição " + y + " é de: " + soma);
                }

        scanner.close();

    }
}