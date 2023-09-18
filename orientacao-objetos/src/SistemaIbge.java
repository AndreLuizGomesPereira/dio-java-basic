public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro uf : EstadoBrasileiro.values()) {
            System.out.println(uf.getSigla() + " - " + uf.getNome());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.BAHIA;
        System.out.println("Estado selecionado: " + eb);
    }
}
