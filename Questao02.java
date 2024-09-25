import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        if (sequenciaFib(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }


    public static boolean sequenciaFib(int num) {
        int a = 0, b = 1, temp;
        if (num == 0) return true;

        while (b < num) {
            temp = b;
            b = a + b;
            a = temp;
        }

        return b == num;
    }

}
