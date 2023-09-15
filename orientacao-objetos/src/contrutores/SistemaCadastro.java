package contrutores;

public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa usuario = new Pessoa("03126090038", "André Luiz Gomes Pereira");

        //definimos o endereço do usuário
        usuario.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e cpf do usuário ?

        System.out.println(usuario.getNome() + " - " + usuario.getCpf());
    }
}
