import application.Iphone;

public class Usuario {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.reproduzir();
        iphone.selecionarMusica();
        iphone.pausar();

        iphone.pagina();
        iphone.adicionarNovaAba();
        iphone.atualiarPagina();

        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioDeVoz();

    }
}
