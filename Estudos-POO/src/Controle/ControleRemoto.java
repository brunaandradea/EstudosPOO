package Controle;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos abstratos da interface Controlador
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Implementação dos métodos da interface Controlador
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("Menu aberto");
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Tocando: " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());  
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("|");
        }
    }
    @Override
    public void fecharMenu() {
        System.out.println("");
        System.out.println("Menu fechado");
    }
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Erro! O controle está desligado.");
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Erro! O controle está desligado.");
        }
    }
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("Erro! O controle está desligado ou já está mudo.");
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50); // Volume padrão ao desligar mudo
        } else {
            System.out.println("Erro! O controle está desligado ou não está mudo.");
        }
    }
    @Override
    public void play() {
        if (this.getLigado()) {
            this.setTocando(true);
            System.out.println("Reproduzindo.");
        } else {
            System.out.println("Erro! O controle está desligado.");
        }
    }
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
            System.out.println("Pausado.");
        } else {
            System.out.println("Erro! O controle está desligado ou não está tocando.");
        }
    }
}
