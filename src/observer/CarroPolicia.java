package observer;

import java.util.Observable;
import java.util.Observer;

// Observador
public class CarroPolicia implements Observer, Carro {

	@Override
	public void frente() {
		System.out.println("Viatura segue em frente");
	}

	@Override
	public void direita() {
		System.out.println("Viatura vira a direita");
	}

	@Override
	public void esquerda() {
		System.out.println("Viatura vira a esquerda");
	}

	@Override
	public void para() {
		System.out.println("Viatura para");
	}

	@Override
	public void update(Observable observable, Object object) {
		 
//		CarroRoubado carroObservado = (CarroRoubado) observable;
		
		/*
		 * Faz com que a ação do observado seja passada para a String ação
		 * recebe o valor passado no notifyObservers da classe observada, no caso CarroRoubado
		 */
		String acao = String.valueOf(object);
		 
		 if (acao.equals("frente")) {
			this.frente();
		 }
		 else if (acao.equals("direita")) {
			this.direita();
		 }
		 else if (acao.equals("esqueda")) {
			this.esquerda();
		 }
		 else if (acao.equals("para")) {
			this.para();
		 }
	}

}
