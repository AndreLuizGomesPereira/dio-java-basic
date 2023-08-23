public class CepFormat {
    public static void main(String[] args) {
        try {
            String cepVerify = cepFormat("23176532198");

            System.out.println(cepVerify);

        } catch (CepInvalidException e) {
            System.err.println("O CEP não corresponde ao padrão definido.");

        }
    }

    static String cepFormat(String cep) throws CepInvalidException {
        if (cep.length() != 11)
            throw new CepInvalidException();

        //simulando um cep formatado
        return "231.765.321-98";
    }
}
