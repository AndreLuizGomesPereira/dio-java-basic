public class BreakContinue {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 5; contador++) {
            if (contador == 3)
                break;

            System.out.println("break: " + contador);
        }

        for (int contador = 1; contador <= 5; contador++) {
            if (contador == 3)
                continue;

            System.out.println("continue: " + contador);
        }
    }
}
