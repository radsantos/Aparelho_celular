package servico;

import dominio.Navegador;

public class ServicoNavegador extends Navegador {

	@Override
	public void exibirPagina() {
		System.out.println("Página Inicial");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Página Nova Aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página");
		
	}

}
