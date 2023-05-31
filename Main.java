import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var valores = Arrays.asList(5.0, 10.0);

        var resultado = Calculadora.calcularListaValores(valores, Operacao.SOMA);

        System.out.println(resultado);
    }
}