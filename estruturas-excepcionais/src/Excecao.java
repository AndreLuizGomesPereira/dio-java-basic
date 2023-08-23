import java.text.NumberFormat;
import java.text.ParseException;

public class Excecao {
    public static void main(String[] args) throws ParseException {
        //Number valor = Double.valueOf("a1.75");
        try {
            Number valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
