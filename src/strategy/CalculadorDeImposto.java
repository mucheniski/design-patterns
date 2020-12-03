package strategy;

// https://www.youtube.com/watch?v=QgVIwrid_4E
public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calcula(orcamento);
		System.out.println(valorImposto);
	}

}
