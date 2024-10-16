public class Usuario {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("A Tv Está ligada? " + smartTv.onOrOff);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("ligando a tv... ligou? " + smartTv.onOrOff);

        smartTv.desligar();
        System.out.println("Desligando... a TV Está ligada? " + smartTv.onOrOff);

    }
}
