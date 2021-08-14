import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class CalculadoraTeste {

  Logger log = Logger.getLogger("log");

  @Test
  public void testeSoma() {
    int resultado = Calculadora.soma(100, 817);
    log.info("resultado da soma: " + resultado);
    Assert.assertEquals(917, resultado);
  }

  @Test
  public void testeSubtracao() {
    int resultado = Calculadora.subtracao(100, 817);
    log.info("resultado da subtração: " + resultado);
    Assert.assertEquals(-717, resultado);
  }

  @Test
  public void testeMultiplicacao() {
    int resultado = Calculadora.multiplicacao(100, 817);
    log.info("resultado da multiplicação: " + resultado);
    Assert.assertEquals(81700, resultado);
  }

  @Test
  public void testeDivisao() {
    float resultado = Calculadora.divisao(817, 10);
    log.info("resultado da divisão: " + resultado);
    Assert.assertEquals(81.69999694824219, resultado, 1);
  }
}
