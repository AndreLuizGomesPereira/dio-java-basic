public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Smart TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();

        smartTv.desligar();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();

        smartTv.mudarCanal(15);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
    }
}
