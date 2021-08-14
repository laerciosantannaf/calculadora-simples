import exceptions.InputsException;

import java.util.Scanner;

public class Calculadora {

  public static int soma(int a, int b) {
    return a + b;
  }

  public static int subtracao(int a, int b) {
    return a - b;
  }

  public static int multiplicacao(int a, int b) {
    return a * b;
  }

  public static float divisao(float a, float b) {
    return a / b;
  }

  private static int getNumero(Scanner scan) {
    System.out.println("Digite um número: ");
    var input = scan.nextLine();
    InputsException.validaInput(input);
    return Integer.parseInt(input);
  }

  private static int selecionaOperacao(Scanner scan) {
    System.out.println("Escolha o tipo de operação: ");
    System.out.println("1- Somar");
    System.out.println("2- Subtrair");
    System.out.println("3- Multiplicar");
    System.out.println("4- Dividir");
    var tipoOperacao = scan.nextLine();
    InputsException.validaTipoOperacao(tipoOperacao);
    return Integer.parseInt(tipoOperacao);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    var inputA = getNumero(scan);
    var inputB = getNumero(scan);

    switch (selecionaOperacao(scan)) {
      case 1:
        System.out.printf("Total da operação: %s", soma(inputA, inputB));
        break;
      case 2:
        System.out.printf("Total da operação: %s", subtracao(inputA, inputB));
        break;
      case 3:
        System.out.printf("Total da operação: %s", multiplicacao(inputA, inputB));
        break;
      case 4:
        System.out.printf("Total da operação: %s", divisao(inputA, inputB));
        break;
      default:
        System.out.println("Erro na operação");
    }
  }
}
