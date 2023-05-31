import java.util.List;

public class Calculadora {

    public static Double calcularDoisValores(Double valor1, Double valor2, Operacao operacao) {
        switch (operacao) {
            case SOMA -> {
                return Soma.somarDoisValores(valor1, valor2);
            }
            case SUBTRACAO -> {
                return null;
            }
            case DIVISAO -> {
                return null;
            }
            case MULTIPLICACAO -> {
                return null;
            }
            default -> {
                return null;
            }
        }
    }

    public static Double calcularListaValores(List<Double> valores, Operacao operacao) {
        switch (operacao) {
            case SOMA -> {
                return Soma.somarListaDeValores(valores);
            }
            case SUBTRACAO -> {
                return null;
            }
            case DIVISAO -> {
                return null;
            }
            case MULTIPLICACAO -> {
                return null;
            }
            default -> {
                return null;
            }
        }
    }
}


