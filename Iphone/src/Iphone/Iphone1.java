package Iphone;

import Equipamentos.AparelhoTelefonico;
import Equipamentos.NavegadorNaInternet;
import Equipamentos.ReprodutorMusical;

public class Iphone1 implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Iphone tocando musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Iphone pausa musica");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Iphone selecionando musica");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Iphone exibindo pagina de internet");
		
	}

	@Override
	public void acionarNovaAba() {
		System.out.println("Iphone adicionando nova aba de internet");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Iphone atualizando pagina de internet");
		
	}

	@Override
	public void ligar() {
		System.out.println("Iphone realizando ligação");
		
	}

	@Override
	public void atender() {
		System.out.println("Iphone atendendo ligação");
		
	}

	@Override
	public void IniciarCorreioVoz() {
		System.out.println("Iphone iniciando correio de voz ligação");
		
	}

}
