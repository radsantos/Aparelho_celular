package principal;

import dominio.Telefone;
import servico.ServicoTelefone;

public class Main {

	public static void main(String[] args) {

		ServicoTelefone tel = new ServicoTelefone();
		
		tel.ligar();
		tel.atender();
		tel.correioVoz();
		
		System.out.println(tel);
	}

}
