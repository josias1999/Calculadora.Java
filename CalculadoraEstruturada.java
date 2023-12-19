package calculadora;

import java.util.Scanner;

/**
 * Esta classe representa uma calculadora com operações básicas e constantes
 * matemáticas.
 * Os conceitos de Programação Orientada a Objetos serão abordados em uma
 * disciplina posterior.
 *
 * @author Josias
 * @version 0.0.1
 * @since 1.7 JK
 * @see <a href=
 *      "https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html">Documentação
 *      do JavaDoc</a>
 */
public class CalculadoraEstruturada {
       /**
        * Método principal que inicia a calculadora.
        *
        * @param args Os argumentos da linha de comando (não utilizados neste
        *             programa).
        */
       public static void main(String[] args) {
              /**
               * Realiza operações básicas (adição, subtração, multiplicação, divisão,
               * potência) entre dois operandos.
               *
               * @param x        O primeiro operando.
               * @param operador O operador a ser aplicado (+, -, *, /, ^).
               * @param y        O segundo operando.
               * @return O resultado da operação.
               */
              Scanner sc = new Scanner(System.in);

              double operandoA, operandoB, resultado;

              operandoA = operandoB = resultado = 0;

              char operacao;

              System.out.println("Escolha a operação: ");

              System.out.println("Soma______________: + ");

              System.out.println("Subtração_________: - ");

              System.out.println("Multiplicação_____: * ");

              System.out.println("Divisão___________: / ");

              System.out.println("Potência__________: ^ ");

              System.out.println("Valor de Pi_______: p ");

              System.out.println("Valor de PHI______: f ");

              System.out.println("Valor de e________: e ");

              System.out.println("----------------------");

              System.out.println("Sair______________: s \n");

              System.out.println();

              operacao = sc.next().charAt(0);

              if (operacao == 's') {

              } else if (operacao == 'p') {

                     resultado = getPi();

                     System.out.printf("pi= %.2f ", resultado);

              } else if (operacao == 'f') {

                     resultado = getFi();

                     System.out.printf("phi= %.2f ", resultado);

              } else if (operacao == 'e') {

                     resultado = getE();

                     System.out.printf("e= %.2f ", resultado);

              } else if (operacao == '+' || operacao == '-'

                            || operacao == '*' || operacao == '/' || operacao == '^') {

                     System.out.println("Operando A: ");

                     operandoA = sc.nextDouble();

                     System.out.println("Operando B: ");

                     operandoB = sc.nextDouble();

                     resultado = operacaoesBasicas(operandoA, operacao, operandoB);

                     System.out.printf("%.2f %c %.2f = %.2f", operandoA, operacao,

                                   operandoB, resultado);

              }

       }

       public static double operacaoesBasicas(double x, char operador, double y) {
              /**
               * Retorna o valor de Pi (π).
               *
               * @return O valor de Pi.
               */

              double resultado = 0.0;

              switch (operador) {

                     case '+':

                            resultado = x + y;

                            break;

                     case '-':

                            resultado = x - y;

                            break;

                     case '*':

                            resultado = x * y;

                            break;

                     case '/':

                            resultado = x / y;

                            break;

                     case '^':

                            resultado = Math.pow(x, y);

              }

              return resultado;

       }

       public static double getPi() {
              /**
               * Retorna o valor de Euler (e).
               *
               * @return O valor de Euler.
               */

              return Math.PI;

       }

       public static double getE() {
              /**
               * Retorna o valor de Phi (φ).
               *
               * @return O valor de Phi.
               */

              return Math.E;

       }

       public static double getFi() {

              return 1.61803398874989484820;
       }

}