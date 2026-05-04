public class Vendedor extends Funcionario {
    private double vendas;

    public Vendedor(String nome, double salario, double vendas) {
        super(nome, salario);
        this.vendas = vendas;
    }

    @Override
    public void calcularBonus() {

        System.out.println("Vendedor: "+ getNome());
        System.out.println("Bônus: " +this.vendas * 0.05);
    }
}