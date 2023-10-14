package servico;

import dominio.Reproduzir;

public class ServicoReproduzir extends Reproduzir {

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausado");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Proxima musica");
		
	}

}
