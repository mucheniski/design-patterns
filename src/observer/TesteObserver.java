package observer;

// https://www.youtube.com/watch?v=GCFh4a0xQx0
public class TesteObserver {
	
	public static void main(String[] args) {
		
		// Observador 
		CarroPolicia carroPolicia = new CarroPolicia();
		
		// Observado
		CarroRoubado carroRoubado = new CarroRoubado();
		
		/*
		 * Após adicionar obervador ao observado, toda a ação que o observado fizer vai refletir uma ação no observador.
		 */
		carroRoubado.addObserver(carroPolicia);
		
		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.esquerda();
		carroRoubado.para();
		
	}

}
