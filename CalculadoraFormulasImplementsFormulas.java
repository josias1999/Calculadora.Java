package calculadora;

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

public class CalculadoraFormulasImplementsFormulas {
    /**
     * Efetua a multiplicação dos valores e retorna um valor Double
     * 
     * @param largura Operador
     * @param altura  Operador
     * @return resultado da multiplicação da largura vezes altura
     */

    public Double calcularAreaQuadrado(Double largura, Double altura) {
        return largura * altura;
    }

    /**
     * Efetuar a multiplicação do raio ao quadrado e retorna um valor Double
     * 
     * @param raio Operador
     * @return resulatdo da multiplicação do raio ao quadrado
     */
    public Double calcularAreaCirculo(Double raio) {
        return Math.PI * raio * raio;
    }

    /**
     * Efetua a multiplicação dos dois Opereadores e depois dividi por dois e
     * retorna uma valor Double
     * 
     * @param diagonalMenor Operador
     * @param diagonalMaior Operador
     * @return Valor da multiplicação e da divisão
     */

    public Double calcularAreaLosango(Double diagonalMenor, Double diagonalMaior) {
        return (diagonalMenor * diagonalMaior) / 2;
    }

    /**
     * Efetuar a multiplicação de base vezes a altura e devidir por dois, retorna um
     * valor Double
     * 
     * @param base   Operador
     * @param altura Operador
     * @return resultado da multiplicação da base * altura/2
     */

    public Double calcularAreaTriangulo(Double base, Double altura) {
        return (base * altura) / 2;
    }

    /**
     * Efetuar a soma da base maior com a base menor depois multiplicar vezes a
     * altura e depois dividir por dois, retorna um valor Double
     * 
     * @param baseMaior Operador
     * @param baseMenor Operador
     * @param altura    Operador
     * @return Resulatdo da soma BaseMaaior + BaseMenor e da multiplicação e divição
     */

    public Double calcularAreaTrapezio(Double baseMaior, Double baseMenor, Double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

}
