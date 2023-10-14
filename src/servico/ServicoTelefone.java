package servico;

import dominio.Telefone;

public class ServicoTelefone extends Telefone {

	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}

	@Override
	public void atender() {
		System.out.println("Ligação recebida");
		
	}

	@Override
	public void correioVoz() {
		System.out.println("Iniciando caixa postal");
		
	}
	


}
