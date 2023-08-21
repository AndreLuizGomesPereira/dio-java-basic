public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"André Luiz", "Emilly", "Gabriela", "Zahra"};

        for (int contador = 0; contador < alunos.length; contador++) {
            System.out.println("O aluno que está na posição: " + (contador + 1) + " é o aluno " + alunos[contador]);
        }
    }
}
