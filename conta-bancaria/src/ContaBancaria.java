public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        int numero = Integer.valueOf(args[0]);
        String agencia = args[1];
        String nomeCompleto = args[2];
        double saldo = Double.valueOf(args[3]);


        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
