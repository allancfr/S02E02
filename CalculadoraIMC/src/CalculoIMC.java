import java.util.Locale;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Garante que o separador decimal seja o ponto

        double altura = 0;
        double peso = 0;

        // Pergunta e recebe a altura
        while (true) {
            System.out.print("Digite sua altura em metros (ex: 1.75): ");
            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                if (altura > 0.5 && altura < 2.5) { // Valida um intervalo realista de altura
                    break;
                } else {
                    System.out.println("Altura inválida. Digite um valor realista, ex: 1.75");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número decimal com ponto, exemplo: 1.75");
                scanner.next();
            }
        }

        // Pergunta e recebe o peso
        while (true) {
            System.out.print("Digite seu peso em kg (ex: 70.5): ");
            if (scanner.hasNextDouble()) {
                peso = scanner.nextDouble();
                if (peso > 20 && peso < 300) { // Valida um intervalo realista de peso
                    break;
                } else {
                    System.out.println("Peso inválido. Digite um valor realista, ex: 70.5");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número decimal com ponto, exemplo: 70.5");
                scanner.next();
            }
        }

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o resultado
        System.out.printf("Seu IMC é: %.2f\n", imc);

        scanner.close();
    }
}

