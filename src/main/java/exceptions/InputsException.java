package exceptions;

import org.apache.commons.lang.StringUtils;

public class InputsException {

  public static void validaInput(String input) {
    if (input.isBlank() || !StringUtils.isNumeric(input)) throw new NumberFormatException("Valor inválido");
  }

  public static void validaTipoOperacao(String input) {
    if (StringUtils.isBlank(input) || !StringUtils.isNumeric(input) || (Integer.parseInt(input) < 1 || Integer.parseInt(input) > 4))
      throw new NumberFormatException("Opção inválida!");
  }
}
