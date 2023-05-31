import java.util.List;

public class Soma {
  public static double somarDoisValores(Double valor1, Double valor2){
        return  valor1 + valor2;
  }

  public static double somarListaDeValores(List<Double> valores){
        return  valores.stream().reduce(Double::sum).orElse(0.0);
  }
}
