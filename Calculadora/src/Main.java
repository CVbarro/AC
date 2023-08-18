import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");

            String op = ler.next();

            if (op.equals("5")) {
                System.out.println("Encerrando a calculadora.");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = ler.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = ler.nextDouble();

            double resultado = 0;

            switch (op) {
                case "1":
                    resultado = somar(num1, num2);
                    break;
                case "2":
                    resultado = subtrair(num1, num2);
                    break;
                case "3":
                    resultado = multiplicar(num1, num2);
                    break;
                case "4":
                    resultado = dividir(num1, num2);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);
        }

        ler.close();
    }

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
