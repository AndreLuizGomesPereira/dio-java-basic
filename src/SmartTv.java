public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar() {
        ligada = true;
        System.out.println("Ligando TV...");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Desligando TV...");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuido volume para: " + volume);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Alterando canal para: " + canal);

    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Alterando canal para: " + canal);

    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Alterando canal para: " + canal);
    }


}
