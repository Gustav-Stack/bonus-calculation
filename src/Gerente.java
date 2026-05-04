public class Gerente extends Funcionario {


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        System.out.println("Gerente: "+ getNome());
        System.out.println(super.toString());
        System.out.println("Bônus: " + getSalario() * 0.20);
    }
}