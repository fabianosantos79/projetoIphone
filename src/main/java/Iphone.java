public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Ligando...  ");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...  ");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrir correio de voz...  ");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página...  ");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrir nova aba...  ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página...  ");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar música...  ");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música...  ");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música...  ");
    }
}
