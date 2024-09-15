package application;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    public void reproduzir() {
        System.out.println("Reproduzindo musica!");
    }

    public void selecionarMusica() {
        System.out.println("Musica selecionada!");
    }

    public void pausar () {
        System.out.println("Musica pausada!");
    }

    public void pagina() {
        System.out.println("Navegando na pagina!");
    }

    public void adicionarNovaAba () {
        System.out.println("Adicionando uma nova aba!");
    }

    public void atualiarPagina () {
        System.out.println("Pagina tualizada!");
    }

    public void atender() {
        System.out.println("Telefone atendido");
    }

    public void ligar() {
        System.out.println("Ligando....");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado!");
    }

}
