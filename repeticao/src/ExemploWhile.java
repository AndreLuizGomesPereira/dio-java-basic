import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorProduto();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorDoce;

        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Você gastou toda a sua mesada :(");
    }

    public static double valorProduto() {
        return ThreadLocalRandom.current().nextDouble(2,10);
    }
}
