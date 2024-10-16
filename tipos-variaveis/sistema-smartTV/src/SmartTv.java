public class SmartTv {
    boolean onOrOff = false;
    int canal = 1;
    int volume = 25;

    public void mudarDeCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void passarDeCanal() {
        canal++;
    }

    public void voltarDeCanal() {
        canal--;
    }

    public void aumentarVolume() {
        System.out.println("Aumentando o volume para: " + volume);
        volume++;
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo o volume para: " + volume);

        volume--;
    }

    public void ligar() {
        onOrOff = true;
    }

    public void desligar() {
        onOrOff = false;
    }
}
